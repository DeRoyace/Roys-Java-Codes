import java.util.*;
public class Sumofdigits {

    public static int sod(int x) {
        if (x < 10)
            return x;
        else
            return x % 10 + sod(x / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits = " + sod(num));
        sc.close();
    }
}
