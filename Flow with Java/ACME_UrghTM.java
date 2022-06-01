/**
 * The ACME Code Company has released their new encryption algorithm: UrghTM. 
 * To encrypt a message using the UrghTM algorithm is simple. 
Each letter ends up N letters to the right of its original position, and the last N letters wrap around to the beginning. 
In addition the letters are replaced by letters N places further in the alphabet. 
For example: 
If you shift the word APPLE by N=2 then it becomes LEAPP 
If you then replace the letters by letters 2 places further in the alphabet, LEAPP becomes NGCRR 
If you shift the word ENCRYPTION by N=4 you get TIONENCRYP. If you then replace the letters by letters 4 places further in
the alphabet, you get XMSRIRGVCT 
Write a program in Java/C/C++/Python such that, given a word and a number N, will output the encrypted word.
 */
import java.util.*;
public class ACME_UrghTM
{
    String wrd;
    int N;
    public static String shiftPos(String x, int n)
    {
        int len=x.length();
        int p=len-n;
        String temp=x.substring(p,len)+x.substring(0,p);
        return temp;
    }
    
    public static String replaceCHAR(String x, int n)
    {
        int l=x.length();
        String temp="";
        for(int i=0;i<l;i++)
        {
            char ch=x.charAt(i);
            int p=ch;
            if(Character.isLetter(ch))
            {
                p=p+n;
                if(Character.isUpperCase(ch))
                {
                    if(p+n>90)
                    p=p-25;
                }
                else
                {
                    if(p+n>122)
                    p=p-25;
                }
            }
            char c=(char)p;
            temp+=c;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter any word: ");
        String s=sc.next();
        System.out.print("Enter N = ");
        int N=sc.nextInt();
        String shifted = shiftPos(s, N);
        String encrypt = replaceCHAR(shifted, N);
        System.out.println("Encrypted word : " + encrypt);
        sc.close();
    }
}