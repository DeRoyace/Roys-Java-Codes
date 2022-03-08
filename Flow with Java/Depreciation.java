import java.util.Scanner;

public class Depreciation {

    static double depric(double p, double rate, int yrs)
    {
        if(yrs == 0)
            return p;
        else
        {
            p -= (p *rate)/100;
            // System.out.println(p);
            return depric(p, rate, yrs-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any amount: ");
        double amt = sc.nextDouble();
        System.out.print("Enter depreciation rate (in %): ");
        double r = sc.nextDouble();
        System.out.print("Enter no. of years: ");
        int year = sc.nextInt();
        System.out.printf("Depreciation: %.2f\n",  depric(amt, r, year) );
        sc.close();
    }
}
