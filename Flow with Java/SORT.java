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
			display();
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
			display();
		}
	}

	static void selection()
	{
		for(int i = 0; i < N-1; i++)
		{
			int pos = i;
			for(int j = i+1; j < N; j++)
			{
				if(arr[j] > arr[pos])
					pos = j;
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
			display();
		}
	}

	static void choice()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("A : Insertion Sort");
		System.out.println("B : Bubble Sort");
		System.out.println("C : Selection Sort");
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
			case 'C':
				selection();
				break;
			default:
				System.out.println("Invalid choice!\nEnter again: ");
				choice();
		}
		sc.close();
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
		sc.close();
	}
}

/*
 * OUTPUT 1:
Enter size of 1D-array : 6
Enter array elements:
14
78
23
99
65
190
Original array: 14  78  23  99  65  190
A : Insertion Sort
B : Bubble Sort
C : Selection Sort
Enter your choice: B
78  23  99  65  190  14
78  99  65  190  23  14
99  78  190  65  23  14
99  190  78  65  23  14
190  99  78  65  23  14
Sorted matrix: 190  99  78  65  23  14

 * OUTPUT 2:
Enter size of 1D-array : 6
Enter array elements:
25
64
90
7
97
43
Original array: 25  64  90  7  97  43
A : Insertion Sort
B : Bubble Sort
C : Selection Sort
Enter your choice: A
64  25  90  7  97  43
90  64  25  7  97  43
90  64  25  7  97  43
97  90  64  25  7  43
97  90  64  43  25  7
Sorted matrix: 97  90  64  43  25  7

 * OUTPUT 3:
Enter size of 1D-array : 6
Enter array elements:
34
25
90
56
78
97
Original array: 34  25  90  56  78  97
A : Insertion Sort
B : Bubble Sort
C : Selection Sort
Enter your choice: C
97  25  90  56  78  34
97  90  25  56  78  34
97  90  78  56  25  34
97  90  78  56  25  34
97  90  78  56  34  25
Sorted matrix: 97  90  78  56  34  25
*/
