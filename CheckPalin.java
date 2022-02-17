import java.util.*;
public class CheckPalin 
{
    public static int isPalin(String s) // recursive function to check Plaindromic String
    {
        int len = s.length();
        if (s.charAt(0) == s.charAt(len - 1) && len > 1) {
            if (len == 2 || len == 3)
                return 1;
            else
                return isPalin(s.substring(1, len - 1));
        } else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any Word: ");
        String w = sc.next();
        if (isPalin(w) == 1)
            System.out.println("Palindromic Word.");
        else
            System.out.println("Not a Palindromic Word.");
        sc.close();
    }
}