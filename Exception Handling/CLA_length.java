/**
 * Write a Java program which will have a user-defined exception that will be thrown when the length of any command line argument is more than 5 Otherwise the command line argument will be printed in the uppercase.
 */

class LengthException extends Exception
{
	public String toString()
	{
		return "Length of command line arguments is  greater than 5";
	}
}

class CLA_length
{
	public static void main(String []args)
	{
		try{
			if(args.length > 5 )
				throw new LengthException();
			else
			{
				for(String s : args)
					System.out.print(s.toUpperCase() + " ");
				System.out.println();
			}
		}
		catch(LengthException e)
		{
			System.out.println(e);
		}
		System.out.println("End of try-catch block");
	}
}
