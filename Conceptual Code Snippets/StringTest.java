class StringTest
{
	public static void main(String []s)
	{
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = new String("abc");
		String s4 = "abc";
		if(s1 == s2)
		{
			System.out.print("s1 and s2 are Equal");
		}
		if(s2 == s3)
		{
			System.out.println("s2 and s3 are equal");
		}
		if(s1 == s4)
		{
			System.out.println("s1 and s4 are Equal");
		}
		System.out.println("End of main()");
	}
}

/*
OUTPUT:
s1 and s4 are Equal
End of main()
*/
