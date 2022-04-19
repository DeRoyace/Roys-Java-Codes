/**
Q. Write a program in Java to do the following:
Define a class called as SORT which contains a method bubble(), insertion() to sort numbers
using bubble sort method or using insertion sort method. In the main() method display a menu
to select either bubble sort method or insertion sort method and then display the sorted list.
Use constructor to input 1-dimensional list and the size of the list from the main() method.
*/
import java.util.*;
class SORT
{
	static int arr[], N;
	SORT(int N)
	{
		this.N = N;
		arr = new int[N];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i = 0; i < N; i++)
		{
			arr[i] = sc.nextInt();
		}
	}

	static void bubble()
	{
		for(int i = 0; i < N-1; i++)
		{
			for(int j = 0; j < N-i-1; j++)
			{
				if(arr[j] < arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	static void insertion()
	{
		for(int i = 1; i < N; i++)
		{
			int temp = arr[i];
			for(int j = i-1; j >= 0; j--)
			{
				if(arr[j] < temp)
				{
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	static void choice()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("A : Insertion Sort");
		System.out.println("B : Bubble Sort");
		System.out.print("Enter your choice: ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'A':
				insertion();
				break;
			case 'B':
				bubble();
				break;
			default:
				System.out.println("Invalid choice!\nEnter again: ");
				choice();
		}
	}

	static void display()
	{
		for( int i : arr)
			System.out.print(i + "  ");
		System.out.println();
	}

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter size of 1D-array : ");
		int size = sc.nextInt();
		new SORT(size);
		System.out.print("Original array: ");
		display();
		choice();
		System.out.print("Sorted matrix: ");
		display();
	}
}
