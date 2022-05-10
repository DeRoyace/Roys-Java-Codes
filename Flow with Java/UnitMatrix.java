/**
 * Q. Write a Java program to accept 9 numbers from the command line and check whether these 9 numbers form a 3x3 Unit matrix or not.
Example: If the numbers are 1 0 0 0 1 0 0 0 1; the matrix formed is
 1 0 0
 0 1 0
 0 0 1
 */
class UnitMatrix
{
	private static void display(String [][]arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static boolean isUnit(String arr[][])
	{
		// function to check whther the matrix is unit matrix or not.
		int flag = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if((i==j && Integer.parseInt(arr[i][j]) != 1) || (i != j && Integer.parseInt(arr[i][j]) != 0))
				{
					flag = 1;
					break;
				}
			}
		}
		return (flag==0);
	}

	private static String[][] convert1D(String arr[])
	{
		int N = (int) Math.sqrt(arr.length);
		String brr[][] = new String[N][N];
		for(int i = 0, k = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				brr[i][j] = arr[k++];
			}
		}
		return brr;
	}

	public static void main(String []args)
	{
		String a[][] = convert1D(args);
		display(a);
		if(isUnit(a))
			System.out.println("Unit Matrix");
		else
			System.out.println("Not a unit matrix");
	}
}
