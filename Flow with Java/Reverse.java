// Q. Write a Java program to accept an array of numbers through the command line and of them reverse the numbers having 3 digits only
import java.util.*;
class Reverse
{
	private static int numRev(int x)
	{
		if(x < 10)
			return x;
		else
		{
			return (int) Math.pow(10, Integer.toString(x).length() - 1) * (x%10) + numRev(x/10);
		}
	}

	private static String strRev(String x)
	{
		int len = x.length();
		if(len <= 1)
			return x;
		else
			return x.charAt(len-1)  + strRev(x.substring(0, len-1) );
	}

	private static boolean checkNum(String x)
	{
		for(int i = 0; i < x.length(); i++)
		{
			char ch = x.charAt(i);
			if(!Character.isDigit(ch))
				return false;
		}
		return true;
	}

	private static void choice(String []arr)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("A : Reverse as a String\nB : Reverse as a Number");
		System.out.print("\nEnter your choice: ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'A':
				for(String s : arr)
				{
					System.out.print(strRev(s) + " ");
				}
				break;

			case 'B':
			for(String s : arr)
			{
				if(checkNum(s))
					System.out.print(numRev(Integer.parseInt(s)) + " ");
				else
					System.out.println("The given inputs is not a number. It cannot be reversed as a number");
			}
			break;

			default:
			System.out.println("Invalid choice.\nEnter again \'-\'");
		}
	}

	public static void main(String []args)
	{
		choice(args);
	}
}
