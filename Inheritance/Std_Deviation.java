/**
Q. Write a program in Java to implement inheritance to solve the following problem. :
a) Define a class SUM which contains 1-dimensional array int a[20] and the size of array ‘n’. Use constructor to input data into array a[2].
b) Define a class called as AVERAGE which is derived from SUM. Define a method average() to  calculate average of ‘n’ numbers. Derive class AVERAGE from SUM.
c) Define a class called as S_DEV and it is to derived from AVERAGE. In this class define 2 methods sd( ) and maximum(). Method sd( ) will calculate the standard deviation of ‘n’ numbers and maximum() will calculate the largest number. 
*/
import java.util.*;
class SUM
{
	int n;
	int a[] = new int[20];
	SUM(int n)
	{
		this.n = n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
	}
} // end of super class SUM

class AVERAGE extends SUM
{
	AVERAGE(int sz)
	{
		super(sz);
	}

	double average()
	{
		int sum=0;
		for(int i=0; i<n; i++)
                {
                        sum += a[i];
                }
		return sum / n;
	}
}

class S_DEV extends AVERAGE
{
	S_DEV(int size)
	{
		super(size);
	}
	double sd()
	{
		double sumof = 0.0d, mean = average();
		for(int i=0; i<n; i++)
                {
                        sumof += Math.pow(a[i] - mean, 2);
                }
		//return Math.sqrt(sumof/(n-1)); // simple standard deviation
		return Math.sqrt(sumof/n); // for population standard deviation
	}

	int maximum()
	{
		int max = a[0];
		for(int i=1; i<n; i++)
                {
                        if(a[i] > max)
				max = a[i];
                }
		return max;
	}
}

class Std_Deviation
{
	public static void main(String []args)
	{
		S_DEV s = new S_DEV(5);
		System.out.print("\nELements are: ");
		for(int i=0; i<s.n; i++)
			System.out.print(s.a[i] + "  ");
		System.out.println("\nStandard Deviation = " + s.sd() );
		System.out.println("Maximum element = " + s.maximum() );
	} // end of main
} // end of program driver class
