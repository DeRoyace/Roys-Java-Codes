/**
 * A composite magic number is a positive integer which is composite as well as a magic number.
Composite number: A composite number is a number that has more than two factors.
For example: 10
Factors are: 1, 2, 5, 10.
 
Magic number: A magic number is a number in which the eventual sum of the digits is equal to 1.
For example: 28
2 + 8 = 10.
1 + 0 = 1.

Accept two positive integers ‘m’ and ‘n’, where m is less than n as user input. 
Display the number of composite magic integers that are in the range between ‘m’ and ‘n’ (both inclusive) 
and output them along with the frequency, in the format specified below.

Test your program with the sample data and some random data:

Example 1:
INPUT:
m = 10
n = 100
OUTPUT:
THE COMPOSITE MAGIC INTEGERS ARE:
10, 28, 46, 55, 64, 82, 91, 100
FREQUENCY OF COMPOSITE MAGIC INTEGERS IS: 8

Example 2:
INPUT:
m = 1200
n = 1300
OUTPUT:
THE COMPOSITE MAGIC INTEGERS ARE:
1207, 1216, 1225, 1234, 1243, 1252, 1261, 1270, 1288
FREQUENCY OF COMPOSITE MAGIC INTEGERS IS: 9

Example 3:
INPUT:
m = 120
n = 99
OUTPUT:
INVALID INPUT
 */
import java.util.*;
public class CompositeMagicNum
{
    static int m,n;
    public static boolean isComposite(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            c++;
        }
        return (c>2);
    }
    
    public static int sumOfDig(int x)
    {
        if(x<10)
        return x;
        else
        return x%10+sumOfDig(x/10);
    }
    
    public static boolean isMagic(int x)
    {
        if(x==1)
        return true;
        else if(x<10)
        return false;
        else
        {
            x=sumOfDig(x);
            return isMagic(x);
        }
    }
    
    public static void display()
    {
        int c=0;
        System.out.println("THE COMPOSITE MAGIC INTEGERS ARE:");
        for(int i=m;i<=n;i++)
        {
            if(isComposite(i) && isMagic(i) )
            {
                c++;
                System.out.print(i+", ");
            }
        }
        System.out.println("\nFREQUENCY OF COMPOSITE MAGIC INTEGERS IS: "+c);
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nm = ");
        m=sc.nextInt();
        System.out.print("n = ");
        n=sc.nextInt();
        if(m<n && m>0 && n>0)
        {
            display();
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
        sc.close();
    }
}
