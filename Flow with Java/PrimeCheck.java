import java.util.Scanner;

public class PrimeCheck {

    static boolean isPrime(int x)
    {
        int c=0;
        for(int i=1; i<=x; i++)
        {
            if(x%i==0)
            c++;
        }
        return (c==2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("\nEnter any number: ");
        int N = sc.nextInt();
        if(isPrime(N))
            System.out.println(N+ " is a Prime number.");
        else 
            System.out.println(N+ " is NOT a Prime number.");
        sc.close();
    }
}
