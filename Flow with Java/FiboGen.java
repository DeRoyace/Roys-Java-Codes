import java.util.*;
class FiboGen
{
    static void genfibos(int m, int n)
    {
        int a=0, b=1, c;
        System.out.println("Printing fibo series within the given limit if present: ");
        if(m==0)
            System.out.print(a + " " + b + " ");
        for(int i=2; i<=n; i++)
        {
            c = a+b;
            a = b;
            b = c;
            if(c>=m && c<=n)
                System.out.print(c + " ");
        }
    }

    public static void main(String []s)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter lower limit: ");
        int low = sc.nextInt();
        System.out.print("\nEnter upper limit: ");
        int upp = sc.nextInt();
        genfibos(low, upp);
        sc.close();
    }
}