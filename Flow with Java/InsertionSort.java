import java.util.*;
class InsertionSort
{
	static int arr[], N;
	static void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter size of array: ");
		N = sc.nextInt();
		arr = new int[N];
		System.out.println("Enter arrey elements: ");
		for(int i = 0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
	}

	static void sort() // sorting in ascending order
	{
		int temp = 0;
		for(int i = 1; i < N; i++)
		{
			temp = arr[i];
			for(int j = i-1; j>=0; j--)
			{
				if(arr[j] > temp)
				{
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	static void display()
	{
		for(int i=0; i<N; i++)
		{
			System.out.print(arr[i] + "  ");
		}
	}

	public static void main(String ars[])
	{
		accept();
		System.out.print("\nOriginal array: ");
		display();
		sort();
		System.out.print("\nSorted array: ");
		display();
		System.out.println();
	}
}
