/**
Q. Write a program in Java to input 2 sets set-a, set-b and calculate
a) union of 2 sets and store in set-c.
b) Difference of 2 sets and store in set d. Use constructor to input 2 sets and also size of 2 sets.
Use a class called as SET_OPERATION to define the methods to calculate union of 2 sets and difference of 2 sets.
*/

import java.util.*;
class SET_OPERATION
{
	static int [] set_a, set_b, set_c, set_d;
	static int sz_c, sz_d;
	SET_OPERATION(int arr[])
	// static void input(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter set elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
	}

	static void Union(int arr[], int brr[])
	{
		int k=0, flag;
		for(int i=0; i<arr.length ; i++)
		{
			set_c[i] = arr[k++];
		}
		// System.out.println(k);
		for(int i = 0; i< brr.length; i++)
		{
			flag = 0;
			for(int j=0; j<arr.length; j++)
			{	
				if(brr[i] != arr[j] && k<set_c.length)
					flag = 1;
				else
				{
					flag = 0;
					break;
				}
			}
			if(flag==1)
			set_c[k++] = brr[i];
		}
		sz_c = k;
	}

	static void Diff(int arr[], int brr[])
	{
		// arr = arr - arr intersection brr
		int k=0, flag;
		for(int i = 0; i< arr.length; i++)
		{
			flag = 0;
			for(int j=0; j<brr.length; j++)
			{	
				if(arr[i] != brr[j])
					flag=1;
				else
				{
					flag = 0;
					break;
				} 
			}
			if(flag == 1)
				set_d[k++] = arr[i];
		}
		sz_d = k;
	}
	
	static void display(int a[], int n)
	{
		for(int i=0; i<n; i++)
		System.out.print(a[i] + "  ");
	}

	public static void main(String []s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter size of set-a: ");
		int n1 = sc.nextInt();
		set_a = new int[n1];
		new SET_OPERATION(set_a); // object created without using referrence variable
		// input(set_a);
		
		System.out.print("\nEnter size of set-b: ");
        int n2 = sc.nextInt();
		set_b = new int[n2];
		new SET_OPERATION(set_b);
		// input(set_b);
		
		System.out.print("\n SET A: ");
		display(set_a, n1);
		System.out.print("\n SET B: ");
        display(set_b, n2);
		
		set_c = new int[n1+n2];
		set_d = new int[n1+n2];
		
		Union(set_a, set_b);
		Diff(set_a, set_b);
		
		System.out.print("\nUnion of SET A & B: ");
		display(set_c, sz_c);
		
		System.out.print("\nDifference of SET A & B: ");
		display(set_d, sz_d);
		System.out.println();
		sc.close();
	}
}