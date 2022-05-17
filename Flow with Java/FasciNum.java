/**
 * Fascinating number - A number when multiplied by 2 and 3 and then, after the results are concatenated with original
 * number, the new number formed contains all digits from 1 to 9 exactly once. Zeroes can be ignored.
 * E.g. 273
 * 273 x 1 = 273
 * 273 x 2 = 546
 * 273 x 3 = 819
 * After concatenating : 273546819
 */
import java.util.*;
public class FasciNum
{
    static long N;

    private static boolean checkFreq(String s)
    {
        //String s=Long.toString(x);
        int len=s.length();
        int count=0,flag=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch!='0')
            {
                for(int j=0;j<len;j++)
                {
                    if(ch== s.charAt(j))
                        count++;
                }
                if(count!=1)
                {
                    flag=1;
                    break;
                }
            }
            count=0;  
        }
        return (flag==0);
    }

    private static int zeros(String str)
    {
        int len=str.length();
        int c=0;
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='0')
                c++;
        }

        if( (len-c) == 9)
            return 9;
        else if( (len-c) <9)
            return 1;
        else
            return 0;
    }

    private static boolean isFasci(String x, long n, int i)
    {
        int len = x.length();
        if( checkFreq(x) && zeros(x)==9 )
        {
            return true;
        }
        else if( (zeros(x)==0 && len>=9) || i>3)
        {
            return false;
        }
        else
        {
            //String s1=Long.toString(x);
            String s2 = Long.toString(n*i);
            String s3 = x+s2;
            return isFasci(s3,n,i+1);
        }
    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nENTER LOWER LIMIT : ");
        int m=sc.nextInt();
        System.out.print("ENTER UPPER LIMIT : ");
        int n=sc.nextInt();
        int c=0;
        if(m > 99 && m<10000 && n>99 && n<10000 && m<n)
        {
            for(int i=m; i<n; i++)
            {
                if(isFasci(Integer.toString(i),i,2) )
                {
                    c++;
                    System.out.print(i+" ");
                }
            }
            if(c==0)
            {
                System.out.println("NIL");
            }
            else
            {
                System.out.println("\nFREQUENCY OF FASCINATING NUMBERS IS: "+c);
            }
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
        sc.close();
    }
}
