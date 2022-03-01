/**
 * BigDecimal class provides operations for arithmetic, scale manipulation, rounding, comparison, hashing, and format conversion.
 * Java includes BogDecimal class to handle high-precision small/ large floating point numbers.
 * So we can use these for accurate monetary calculations.
 * 
 * For more info visit: 
 * Oracle docs: https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.html
 * GeeksforGeeks: https://www.geeksforgeeks.org/bigdecimal-class-java/
 */

import java.math.BigDecimal;
import java.util.Scanner;
public class BigDecimalUsage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        BigDecimal bg1 = sc.nextBigDecimal();
        System.out.print("Enter another number: ");
        BigDecimal bg2 = sc.nextBigDecimal();

        System.out.println(bg1+" + "+bg2+ " = " + bg1.add(bg2));
        System.out.println(bg1+" - "+bg2+ " = " + bg1.subtract(bg2));
        System.out.println(bg1+" x "+bg2+ " = " + bg1.multiply(bg2));
        System.out.println(bg1+" / "+bg2+ " = " + bg1.divide(bg2));
        System.out.println(bg1+" ^ 2 = " + bg1.pow(2));
        System.out.println("Negate of " + bg1 + " = " + bg1.negate());
        sc.close();
    }
}