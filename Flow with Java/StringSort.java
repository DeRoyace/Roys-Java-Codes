import java.util.*;
class StringSort
{
	static String arr[];
	static int N;
	StringSort()
	{
		arr = new String [N];
	}

	static void getWords()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter no. of words: ");
		N = sc.nextInt();
		new StringSort();
		System.out.println("Enter words: ");
		for(int i = 0; i < N; i++)
		{
			arr[i] = sc.next();
		}
		sc.close();
	}

	static void getSent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter any sentence: ");
		String s = sc.nextLine();
		fillArr(s);
		sc.close();
	}

	static void fillArr(String s)
	{
		StringTokenizer st = new StringTokenizer(s, ".,!?; ");
		N = st.countTokens();
		new StringSort();
		for(int i = 0; i < N; i++)
		{
			arr[i] = st.nextToken();
		}
	}

	static void display()
	{
		for(String i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	static void sort() // insertion sort in ascending order of dictionary.
	{
		for(int i = 1; i < N; i++)
		{
			String temp = arr[i];
			for(int j = i-1; j >= 0; j--)
			{
				if(arr[j].compareTo(temp) > 0)
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
		System.out.println("What do you want to take as Input?");
		System.out.println("A : Words");
		System.out.println("B : Sentence");
		System.out.print("Enter your choice: ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'A':
				getWords();
				break;
			case 'B':
				getSent();
				break;
			default:
				System.out.println("Invalid choice!");
				choice();
		}
		sc.close();
	}

	public static void main(String []args)
	{
		choice();
		System.out.print("\nOriginal array: ");
		display();
		sort();
		System.out.print("Sorted array: ");
		display();
	}
}

/*
 * OUTPUT 1:
What do you want to take as Input?
A : Words
B : Sentence
Enter your choice: A

Enter no. of words: 5
Enter words:
Java
Python
Golang
Rust
JavaScript

Original array: Java Python Golang Rust JavaScript
Sorted array: Golang Java JavaScript Python Rust

 * OUTPUT 2:
What do you want to take as Input?
A : Words
B : Sentence
Enter your choice: B

Enter any sentence: Roses are red, and violets are shade of blue.                                                       

Original array: Roses are red and violets are shade of blue 
Sorted array: Roses and are are blue of red shade violets
*/
