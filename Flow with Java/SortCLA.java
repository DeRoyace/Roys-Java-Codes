// Q. Write a Java program to sort a list of numbers given as arguments from the command line.

class SortCLA
{
	static void sort(String arr[]) // sorting in ascending order
	{
		// using Insertion Sorting technique:
		String temp;
		for(int i = 1; i < arr.length; i++)
		{
			temp = arr[i];
			for(int j = i-1; j >= 0; j--)
			{
				if(Integer.parseInt(arr[j]) > Integer.parseInt(temp))
				{
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	} // end of sort()

	static void display(String arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
	}

	public static void main(String [] args)
	{
		System.out.print("\nOriginal array: ");
		display(args);
		sort(args);
		System.out.print("\nSorted array: ");
		display(args);
		System.out.println();
	}
}

/**
 * OUTPUTS:
 
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC/Flow with Java$ javac SortCLA.java
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC/Flow with Java$ java SortCLA 12 89 67 90 45 32 890 74 2

Original array: 12  89  67  90  45  32  890  74  2
Sorted array: 2  12  32  45  67  74  89  90  890
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC/Flow with Java$ java SortCLA 98 72 100 85 77 97 90 86

Original array: 98  72  100  85  77  97  90  86
Sorted array: 72  77  85  86  90  97  98  100
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC/Flow with Java$ java SortCLA 789 456 234 777 125 456 360 180 911 275

Original array: 789  456  234  777  125  456  360  180  911  275
Sorted array: 125  180  234  275  360  456  456  777  789  911
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC/Flow with Java$
*/
