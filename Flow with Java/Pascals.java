import java.util.*;
public class Pascals
{
    public static void main(String []s)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter no. of rows: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i<n ; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                if(j==0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        for(int i = 0; i<n ; i++)
        {
            for(int k = n; k>i; k--)
            {
                System.out.print("  ");
            }
            for(int j = 0; j<=i; j++)
            {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}