/**
 * An n-digit number N is a Keith Number if it forms a Fibonacci-like sequence that begins with the digits of the number 
 * itself. The most significant digit is followed by the rest of the digits. 
 * Now each subsequent term is the sum of the previous n terms, and the number N itself appears in this sequence.

Consider the number 197.
1 + 9 + 7 = 17
9 + 7 + 17 = 33
7 + 17 + 33 = 57
17 + 33 + 57 = 107
33 + 57 + 107 = 197 (the number itself)

14, 19, 28, 47, 61, 75, 197, 742, 1104, 1537, 2208, 2580,  are some of the Keith Numbers.

Class Name : KeithOPrime
Data Members :
n : integer to store the positive number(<9999) generated randomly.
Member Functions:
void store() : stores the randomly generated number in the given data member n.
boolean prime() : returns true if the number n is prime otherwise returns false.
boolean Keith() : returns true if the number n is a Keith number otherwise returns false.
boolean checkNumber() : returns true if the number n is both a prime number as well as a Keith number.
State all the necessary validation checks for the above program.
Specify the class KeithOPrime giving details of the constructor and member functions void store( ),
boolean prime(), boolean Keith(), boolean checkNumber() with main( ) function to create an object and
call the functions accordingly.
*/

import java.util.*;
class Keith_o_Prime
{
	private int n;
	private void store()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter any number: ");
		n = sc.nextInt();
		if(n >= 9999 || n < 1)
		{
			System.out.println("Invalid input\nEnter again: ");
			store();
		}	
		sc.close();
	}

	private boolean prime()
	{
		for(int i = 2; i < Math.sqrt(n); i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	private int sum(int []arr)
	{
		int sum = 0, i = 0;
		while(i < arr.length)
		{
			sum += arr[i];
			i++;
		}
		return sum;
	}
	
	private int[] proceed(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(i==0)
				System.out.print(arr[i]);
			else
				System.out.print(" + " + arr[i]);

		}	

		for(int i = 0; i < arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		return arr;
	}

	private boolean Keith(int k, int arr[])
	{
		System.out.println(" = " +k);
		if(k == n)
			return true;
		else if(k > n)
			return false;
		else
		{
			k = sum(arr);
			arr = proceed(arr);
			arr[arr.length - 1] = k;
			return Keith(k, arr);
		}
	}

	private boolean checkNumber()
	{
		int num = n;
		int c = (Integer.toString(n)).length();
		int arr[] = new int[c];
		while(num > 0) {
			arr[c-1] = num % 10;
			num/=10;
			c--;
		}
		if( Keith(0, arr) && prime())
		{
			System.out.println(n + " is a Keith-o-Prime number.");
			return true;
		}
		else
		{
			System.out.println("Not a Keith-o-Prime number.");
			return false;
		}
	}

	public static void main(String []args)
	{
		Keith_o_Prime kop = new Keith_o_Prime();
		kop.store();
		kop.checkNumber();
	}
}
