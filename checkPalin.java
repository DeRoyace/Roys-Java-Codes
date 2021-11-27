import java.util.*;
public class checkPalin
{
    public static int isPalin(String s)
    {
        int len=s.length();
        if(s.charAt(0)==s.charAt(len-1) && len>1)
        {
            if(len==2 || len==3)
            return 1;
            else
            return isPalin(s.substring(1,len-1));
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter any Word: ");
        String w=scanner.next();
        if(isPalin(w)==1)
        System.out.println("Palindromic Word.");
        else
        System.out.println("Not a Palindromic Word.");
    }
}