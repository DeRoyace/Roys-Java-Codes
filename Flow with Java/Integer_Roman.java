/**
 * Q. Integer to Roman number conversion: 
 */
import java.util.*;
class Integer_Roman 
{
	// I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
	static String Rnum[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };

	static char ivalue(int d) 
	{
		char val = ' ';
		switch (d) {
			case 1:
				val = 'I';
				break;
			case 5:
				val = 'V';
				break;
			case 10:
				val = 'X';
				break;
			case 50:
				val = 'L';
				break;
			case 100:
				val = 'C';
				break;
			case 500:
				val = 'D';
				break;
			case 1000:
				val = 'M';
				break;
			default:
				val = ' ';
		}
		return val;
	}

	static String getRepeat(int x, char r) 
	{
		if (x == 1)
			return r + "";
		else
			return r + getRepeat(x - 1, r);
	}

	static String Int_R(int x) // recursive function to convert numbers to Roman form.
	{
		int len = Integer.toString(x).length();
		if (x != 0) {
			int c = x - (x % (int) Math.pow(10, len - 1));
			if (ivalue(c) != ' ') 
			{
				x %= (int) Math.pow(10, len - 1);
				return ivalue(c) + Int_R(x);
			} 
			else 
			{
				if (c >= 10 && c < 40) 
				{
					x %= (int) Math.pow(10, len - 1);
					return getRepeat(c / 10, 'X') + Int_R(x);
				} 
				else if (c >= 100 && c < 400) 
				{
					x %= (int) Math.pow(10, len - 1);
					return getRepeat(c / 100, 'C') + Int_R(x);
				} 
				else if (c >= 1000 && c < 4000) 
				{
					x %= (int) Math.pow(10, len - 1);
					return getRepeat(c / 1000, 'M') + Int_R(x);
				} 
				else if (c == 40) 
				{
					x %= 10;
					return "XL" + Int_R(x);
				} 
				else if (c == 400) 
				{
					x %= 100;
					return "CD" + Int_R(x);
				} 
				else if (c >= 60 && c < 90) 
				{
					return ivalue(50) + getRepeat((c - 50) / 10, 'X') + Int_R(x % 10);
				} 
				else if (c >= 600 && c < 900) 
				{
					return ivalue(500) + getRepeat((c - 500) / 100, 'C') + Int_R(x % 100);
				} 
				else if (c == 90) 
				{
					x %= 10;
					return "XC" + Int_R(x);
				} 
				else if (c == 900) 
				{
					x %= 100;
					return "CM" + Int_R(x);
				} 
				else 
				{
					return Rnum[x];
				}
			}
		} else
			return "";
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter any number between 1 to 3999: ");
		int num = sc.nextInt();
		if (num < 1 || num >= 4000)
	   	{
			System.out.print("\nOut of Range!\nEnter again: ");
			main(args);
		} 
		else
	   	{
			System.out.println(num + " in Roman number is: " + Int_R(num));
		}
		sc.close();
	}
}

/**
 * OUTPUTS:

rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Flow with Java$ javac Integer_Roman.java
rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Flow with Java$ java Integer_Roman

Enter any number between 1 to 3999: 786
786 in Roman number is: DCCLXXXVI
rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Flow with Java$ java Integer_Roman

Enter any number between 1 to 3999: 2022
2022 in Roman number is: MMXXII
rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Flow with Java$ java Integer_Roman

Enter any number between 1 to 3999: 98
98 in Roman number is: XCVIII
rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Flow with Java$ java Integer_Roman

Enter any number between 1 to 3999: 5600

Out of Range!
Enter again: 
Enter any number between 1 to 3999: 3750
3750 in Roman number is: MMMDCCL
rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Flow with Java$ 
 */