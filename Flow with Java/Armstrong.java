import java.util.Scanner;

public class Armstrong {

    static int countDigits(int x)
    {
        String s = Integer.toString(x);
        return s.length();
    }

    static int sodPow(int x, int p)
    {
        if ( x<10)
        return x;
        else
        return (int) Math.pow(x%10, p) + sodPow(x/10, p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a lower limit: ");
        int low = sc.nextInt();
        System.out.print("Enter a upper limit: ");
        int upp = sc.nextInt();
        
        System.out.print("\nArmstrong Numbers are: ");
        for(int i = low; i<=upp; i++)
        {
            int power = countDigits(i);
            if(sodPow(i, power) == i)
                System.out.print(i + " ");

        }
        System.out.println();
        sc.close();
    }
}
