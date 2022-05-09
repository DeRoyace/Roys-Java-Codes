/**
 * Q. Write a Java program to accept 9 numbers from the command line which would form
a 3x3 matrix. The program should then check whether the matrix is Upper triangular
or Lower triangular in nature. The program should then compute the determinant of
the matrix.
*/
import java.util.*;
class UppLowTrimat
{
	int arr[][], N;
	UppLowTrimat(int N)
	{
		this.N = N;
		arr = new int[N][N];
	}

	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	boolean isUppTri()
	{
		for(int i = 1; i < N; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if(arr[i][j]!=0)
					return false;
			}
		}
		return true;
	}

	boolean isLowTri()
	{
		for(int i = 0; i < N-1; i++)
		{
			for(int j = i+1; j < N; j++)
			{
				if(arr[i][j]!=0)
					return false;
			}
		}
		return true;
	}

	boolean checkDiagonal() // function to check left diagonals are all zero or not
	{
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				if(arr[i][i] == 0)
					return false;
			}
		}
		return true;
	}

	void display()
	{
		System.out.println("The Matrix is: ");
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String []args)
	{
		UppLowTrimat m = new UppLowTrimat(4);
		m.accept();
		m.display();
		if(m.isUppTri() && m.checkDiagonal() )
			System.out.println("Upper triangle matrix");
		else if(m.isLowTri() && m.checkDiagonal() )
			System.out.println("Lower triangle matrix");
		else
			System.out.println("Neither Upper triangle nor Lower triangle matrix");
	}
}
