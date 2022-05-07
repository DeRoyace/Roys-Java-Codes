// Q.Write a Java program to find out whether a word given as argument from the command line is a palindrome or not.
class PalinStringCLA
{
	private static boolean isPalin(String x)
	{
		int len = x.length();
		if(len <= 1)
			return true;
		else
		{
			if(x.charAt(0) == x.charAt(len-1) )
			{
				return isPalin(x.substring(1,len-1));
			}
			else
			return false;
		}
	}

	private static void display(String []arr)
	{
		for(String s : arr)
		{
			if(isPalin(s))
				System.out.println(s + " : Palindromic word");
			else
				System.out.println(s + " : Not a palindromic word.");
		}
	}

	public static void main(String []args)
	{
		if(args.length > 0)
		display(args);
		else
		{
			System.out.println("Please enter atleast one arrgument");
		}
	}
}
