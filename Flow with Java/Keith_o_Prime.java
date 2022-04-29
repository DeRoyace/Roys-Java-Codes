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

	private int sum(int arr[])
	{
		int sum = 0;
		for(int i = 0; i < arr.length-1; i++)
		{
			arr[i] = arr[i+1];
			sum += arr[i];
		}
		return sum;
	}

	private boolean Keith(int k, int arr[])
	{
		if(k > n)
			return false;
		else if(k == n)
			return true;
		else
		{
			k = sum(arr);
			arr[arr.length - 1] = k;
			return Keith(k, arr);
		}
	}

	private boolean checkNumber()
	{
		int num = n;
		int c = (Integer.toString(n)).length();
		int arr[] = new int[c];
		for(int i = 0; i < c; i++)
		{
			arr[i] = num%10;
			num/=10;
		}
		if( Keith(0, arr) && prime())
			return true;
			System.out.print(n + " is Keith-o-Prime number.");
		else
			System.out.println("Not a Keith-o-Prime number.");
	}

	public static void main()
	{
		Keith_o_Prime kop = new Keith_o_Prime();
		kop.store();
		kop.checkNumber();
	}

}
