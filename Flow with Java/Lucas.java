/**
 * Write a Java program to display first N Lucas numbers. ( 3>N>100 )
The Lucas numbers or series are integer sequences named after the mathematician François Édouard Anatole Lucas, 
who studied both that sequence and the closely related Fibonacci numbers. 
Lucas numbers and Fibonacci numbers form complementary instances of Lucas sequences.
The sequence of Lucas numbers : 2, 1, 3, 4, 7, 11, 18, 29, ….
 */
import java.util.*;
public class Lucas
{
    public static void lucas(int x, int a, int b) //recursive function to display lucas series
    {
        if(x==0)
            System.out.println();
        else
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(",   "+c);
            lucas(x-1,a,b);
        }
    }  // end of lucas()
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter number of terms : ");
        int N=sc.nextInt();
        if(N>3 && N<100)
        {
            System.out.println("\nThe sequence of "+N+" Lucas numbers are :  ");
            System.out.print(" 2,  1");
            lucas(N-2,2,1);
        }
        else
        {
            System.out.println("OUT OF RANGE.");
        }
    }  // end of main
}  // end of class