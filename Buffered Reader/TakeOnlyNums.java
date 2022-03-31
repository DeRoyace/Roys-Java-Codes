import java.io.*;
public class TakeOnlyNums
{
	public static void main(String []s) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0, arr[] = new int[10];
		while(true)
		{
			try{
				System.out.print("\nEnter a number: ");
				arr[i++] = Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid Input!");
				i--;
			}
			if(i==10)
				break;
		}
		for (int j : arr) {
			System.out.print(j + "   ");
		}
		System.out.println();
	}
}
