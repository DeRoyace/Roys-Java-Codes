/**
 * Write a Java program to find and print the Happy numbers between m and n.
Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
Example: 19 is a happy number
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

The first few happy numbers are 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100, ...
 */
import java.util.*;
public class HappyNum
{
    public static int digitSq(int x) // recursive function to find square of digits of the number
    {
        if(x<10)
            return x*x;
        else
            return (x%10)*(x%10) + digitSq(x/10);
    }// end of digitSq()

    public static boolean isHappy(int num, int i)  // recursive function to check whether the no. is happy or not
    {
        //System.out.println(num);
        if(num==1)
            return true;
        else if(i==15)
            return false;
        else
            return isHappy( digitSq(num), i+1);
    } // end of isHappy()

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter lower limit : ");
        int m=sc.nextInt();
        System.out.print("\nEnter upper limit : ");
        int n=sc.nextInt();
        System.out.println("The Happy numbers are : ");
        for(int i=m;i<=n;i++)
        {
            if( isHappy(i, 0) )
            {
                System.out.print(i+"    ");
            }
        }
    } // end of main()
} // end of class
