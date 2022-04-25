
/**
 * Q. When converting ordinary fractions into decimal fractions one sometimes ends up with a set of decimal digits that keep on repeating (so-called recurring decimals). For example ? = 0.3333333 etc.

Write a program that will convert an ordinary fraction into a decimal fraction and that places the recurring digits in brackets.
For example:
	22/5 = 4.4 (no recurring decimal digits so no brackets)
	1/3 = 0.(3) (three recurs ad infinitum)

Examples:

Input: Fraction? 1/3
Output: 0.(3)

Input: Fraction? 9/7
Output: 1.(285714)

*/

import java.util.*;
class DecimalRepeat 
{
	static int num, deno;
	static double q;

	static void checkRepeat(String s, String temp, int i, int j, int count) 
	{
		if (j >= s.length()) 
		{
			if (count <= 1)
				System.out.println(num + " / " + deno + " = " + q);
			else {
				System.out.println(num + " / " + deno + " = " + (int) Math.floor(q) + ".(" + temp + ")");
			}
		} 
		else 
		{
			if (s.substring(i, j).equals(temp)) {
				count++;
				checkRepeat(s, temp, j, j + (j - i), count);
			} 
			else {
				int len = temp.length();
				temp += s.substring(len, len + 1);
				checkRepeat(s, temp, 0, len + 1, 0);
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter dividend: ");
		num = sc.nextInt();
		System.out.print("Enter divisor: ");
		deno = sc.nextInt();
		q = num / (double) deno;
		if (num % deno == 0) {
			System.out.println(num + " / " + deno + " = " + q);
		} 
		else {
			String res = Double.toString(q);
			int p = res.indexOf(".");
			String n = res.substring(p + 1) + " ";
			checkRepeat(n, n.substring(0, 1), 0, 1, 0);
		}
		sc.close();
	}
}
