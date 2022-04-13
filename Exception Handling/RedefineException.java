import java.io.*;
class RedefineException
{
	public static void main(String []s) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nEnter any positive number: ");
			int num = Integer.parseInt(br.readLine());
			try{
				if(num<0)
					throw new ArithmeticException();
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
			System.out.print("\nDo you want to continue? (y/n): ");
			char ch = (char) br.read();
			if(ch == 'n' || ch == 'N')
				System.exit(0);
			else if(ch == 'y' || ch == 'Y')
				main(s);
			else 
				System.out.println("Invalid input!!");
	}
}
