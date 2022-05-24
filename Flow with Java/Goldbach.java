/**
 * Question 1
A Goldbach number is a positive even integer that can be expressed as the sum of two odd
primes.
Note: All even integer numbers greater than 4 are Goldbach numbers.
Example: 6 = 3 + 3
10 = 3 + 7
10 = 5 + 5
Hence, 6 has one odd prime pair 3 and 3. Similarly, 10 has two odd prime pairs, i.e. 3 and 7,
5 and 5.
Write a program to accept an even integer ‘N’ where N > 9 and N < 50. Find all the odd
prime pairs whose sum is equal to the number ‘N’.
Test your program with the following data and some random data:

Example 1:
INPUT: N = 14
OUTPUT: PRIME PAIRS ARE: 3, 11
7, 7

Example 2:
INPUT: N = 30
OUTPUT: PRIME PAIRS ARE: 7, 23
11, 19
13, 17

Example 3:
INPUT: N = 17
OUTPUT: INVALID INPUT. NUMBER IS ODD.

Example 4:
INPUT: N = 126
OUTPUT: INVALID INPUT. NUMBER OUT OF RANGE.
 */
import java.util.*;
public class Goldbach
{
    static int N;
    public static boolean isPrime(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            c++;
        }
        return (c==2);
    }
    
    public static void isGoldbach(int x, int i, int j)
    {
        if(isPrime(i) && isPrime(j) && i+j==x)
        {
            System.out.println(i+", "+j);
            isGoldbach(x,i,j+1);
        }
        else if(j==x && i<x)
        {
            isGoldbach(x,i+1,i+1);
        }
        else if(i==x)
        {
            System.out.println();
        }
        else
        {
            isGoldbach(x,i,j+1);
        }
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nENTER ANY POSITIVE EVEN INTEGER, N (N>9 and N<50): ");
        N=sc.nextInt();
        if(N>9 && N<50 && N%2==0)
        {
            System.out.println("PRIME PAIRS ARE: ");
            isGoldbach(N,2,2);
        }
        else
        {
            if(N<=9 || N>=50)
            {
                System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
            }
            else
            {
                System.out.println("INVALID INPUT. NUMBER IS ODD.");
            }
        }
        sc.close();
    }
}