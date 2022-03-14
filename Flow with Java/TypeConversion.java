import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any number: ");
        int n = sc.nextInt();
        System.out.println("Integer: " + n);
        long x =n; // implicit type conversion occurs
        System.out.println("Long: " + x);
        // short s = n; // Error: lossy conversion from int to short
        short s = (short) n; // explicit type conversion required (done by type casting)
        System.out.println("Short: " + s);
        float f = n; // implicit
        System.out.println("Float: " + f);
        double d = n; // implicit
        System.out.println("Double: " + d);
        char c = (char) n; // type casting required
        System.out.println("Char: " + c);
        sc.close();
    }
}
