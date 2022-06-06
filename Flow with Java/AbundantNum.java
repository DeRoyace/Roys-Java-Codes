/**
 * Write a Java program to print all the possible Abundant numbers (integers) between
M and N ( 1 > M,N < 100000) .
In number theory, an abundant number is a number for which the sum of its proper
divisors is greater than the number itself.
The first few abundant numbers are:
12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100,
102,...
The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4 and 6
for a total of 16.
 */
import java.util.*;
public class AbundantNum
{
    public static int factors(int x, int f) //recursive function to find sum of factors of the number
    {
        if(x==f)
        return 0;
        else if(x%f==0)
        return f+factors(x,f+1);
        else
        return factors(x,f+1);
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the lower limit : ");
        int M=sc.nextInt();
        System.out.print("\nEnter the upper limit : ");
        int N=sc.nextInt();
        if(M>1 && M<100000 && N>1 && N<100000)
        {
            for(int i=M;i<=N;i++)
            {
                if(factors(i,1)>i)
                    System.out.print(i+", ");
            }
        }
        else
        {
            System.out.println("OUT OF RANGE");
            main();
        }
        sc.close();
    } // end of main
} // end of class