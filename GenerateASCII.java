import java.util.Scanner;

public class GenerateASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of ASCII values to be generate: ");
        int N = sc.nextInt();
        for (int i=0; i<=N; i++) {
            System.out.println( i + " = " + (char)i);
        }
        sc.close();
    }
}
