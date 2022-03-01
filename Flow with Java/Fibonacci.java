import java.util.Scanner;

class Fibonacci
{
    static void genFibos(int x)
    {
        int a=0, b=1, c=a+b;
        System.out.print(a + "  " + b + "  " + c);
        while((b+c) <=x)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print("  "+ c);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number to print fibonacci series upto it: ");
        int N = sc.nextInt();
        System.out.println("Fibonacci series upto "+ N + " are: ");
        genFibos(N);
        sc.close();
    }
}