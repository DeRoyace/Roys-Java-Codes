/**
 * Create two arrays Numerator and Denominator, such that Numerator cannot be negative and Denominator will have no-zero values.
 * Compute each elements of the same position.
 */
import java.io.*;
class NegativeNumberException extends Exception
{
	public String toString()
	{
		return "Negative Number";
	}
}

class UserDefined
{
	private int Numerator[] = new int[5];
	private int Denominator[] = new int[5];

	void getData() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,d;
		for(int i=0; i<5; i++)
		{
			try{
				System.out.printf("\nEnter Numerator %d   : ", (i+1));
				n = Integer.parseInt(br.readLine());
				if(n < 0)
				{
					i--;
					throw new NegativeNumberException();
				}
				System.out.printf("Enter Denominator %d : ", (i+1));
                                d = Integer.parseInt(br.readLine());
                                if(d == 0)
				{
					i--;
					throw new ArithmeticException();
				}
				Numerator[i] = n;
				Denominator[i] = d;
			}
			catch(NegativeNumberException e)
			{
				System.out.println(e);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Denominator cannot be ZERO");
			}
		}
	}

	void show()
	{
		System.out.println("\nRESULT:");
		int j=0;
		for(int i : Numerator)
		{
			System.out.printf("\n %d / %d = %d\n", i, Denominator[j], i/Denominator[j]);
			j++;
		}
	}

	public static void main(String []args) throws IOException
	{
		UserDefined usd = new UserDefined();
		usd.getData();
		usd.show();
	}
}
