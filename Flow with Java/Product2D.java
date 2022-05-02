
/**
 * Write a program in Java to input 2 dimensional arrays arr[][] and brr[][] and calculate product of 2-dimentional array.
 */

import java.io.*;

public class Product2D 
{
	int N;
	static int[][] arr, brr, prr;

	Product2D(int N) 
	{
		this.N = N;
		arr = new int[N][N];
		brr = new int[N][N];
		prr = new int[N][N];
	}

	void input(int a[][]) throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
				a[i][j] = Integer.parseInt(br.readLine());
		}

	}

	void product() 
	{
		for (int i = 0; i < prr.length; i++) 
		{
			for (int j = 0; j < prr.length; j++) {
				prr[i][j] = arr[i][j] * brr[i][j];
			}
		}
	}

	void display(int a[][]) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}

	}

	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("\nEnter size of 2D array: ");
		int size = Integer.parseInt(br.readLine());

		Product2D p = new Product2D(size);
		System.out.println("Enter elements for Matrix 1: ");
		p.input(arr);
		System.out.println("\nEnter elements for Matrix 2: ");
		p.input(brr);
		System.out.println("\nMatrix 1:");
		p.display(arr);
		System.out.println("\nMatrix 2:");
		p.display(brr);

		p.product();
		System.out.println("\nProduct of two Matrices:");
		p.display(prr);

	} // end of main()
} // end of class
