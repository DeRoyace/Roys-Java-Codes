import java.util.*;
class MergeSort
{
	private String[] copyArr(String arr[], int l, int u)
	{
		String cpy[] = new String[u-l+1];
		for(int i = l, k = 0; i <= u; i++)
			cpy[k++] = arr[i];
		return cpy;
	}

	private void sort(String arr[], int l, int u)
	{
		if(l < u)
		{
			int mid = (l + u) / 2;
			sort(arr, l, mid);
			sort(arr, mid+1, u);
			merge(arr, l, mid, u);
		}
	}

	private void  merge(String arr[], int l, int mid, int u)
	{
		int i = 0, j = 0, k = l;
		String left[] = new String[mid-l+1];
		left = copyArr(arr, l, mid);
		String right[] = new String[u-mid];
		right = copyArr(arr, mid+1, u);
		//String mix[] = new String[u-l+1];
		while(i < left.length && j < right.length)
		{
			if( Integer.parseInt(left[i]) < Integer.parseInt(right[j]) )
			{
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		// the above loop works until the comparison between both arrays ends with their same length
		// the array which is bigger is left with an element that need to be added in mix[].
		if(i < left.length)
			arr[k] = left[i];

		if(j < right.length)
			arr[k] = right[j];
		// merging of arrays done w.r.t their values comparisons
	}

	private static void display(String arr[])
	{
		for(String i : arr)
			System.out.print(i + "  ");
		System.out.println();
	}

	public static void main(String []args)
	{
		MergeSort ms = new MergeSort();
		System.out.print("\nOriginal array: ");
		display(args);
		System.out.print("Sorted array  : ");
		ms.sort(args, 0, args.length-1);
		display(args);
	}
}
