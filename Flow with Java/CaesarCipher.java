/**
 * Question 3
Caesar Cipher is an encryption technique which is implemented as ROT13 (‘rotate by 13
places’). It is a simple letter substitution cipher that replaces a letter with the letter 13 places
after it in the alphabets, with the other characters remaining unchanged.
ROT13
A/a  B/b  C/c  D/d  E/e  F/f  G/g  H/h  I/i  J/j  K/k  L/l  M/m
 ↕    ↕    ↕    ↕    ↕     ↕    ↕    ↕    ↕    ↕    ↕    ↕    ↕
N/n  O/o  P/p  Q/q  R/r  S/s  T/t  U/u  V/v  W/w  X/x  Y/y  Z/z
Write a program to accept a plain text of length L, where L must be greater than 3 and less than 100.
Encrypt the text if valid as per the Caesar Cipher.
Test your program with the sample data and some random data:

Example 1
INPUT: Hello! How are you?
OUTPUT: The cipher text is:
Uryyb! Ubj ner lbh?

Example 2
INPUT: Encryption helps to secure data.
OUTPUT: The cipher text is:
Rapelcgvba Urycf gb frpher gngn.

Example 3
INPUT: You
OUTPUT: INVALID LENGTH
 */
import java.util.*;
public class CaesarCipher
{
    static String s;
    public static void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter any sentence : ");
        s=sc.nextLine();
        s=s.trim();
        int L=s.length();
        if(L<=3 || L>=100 )
        {
            System.out.println("INVALID LENGTH");
            accept();
        }
        sc.close();
    }
    
    public static String ROT13(String str)
    {
        int len=str.length();
        String temp="";
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                int x=ch;
                x+=13;
                if(Character.isUpperCase(ch))
                {
                    if(x>90)
                    x-=26;
                }
                else
                {
                    if(x>122)
                    x-=26;
                }
                ch=(char)x;
            }
            temp+=ch;
        }
        return temp;
    }

    public static void main(String[] args) {
        accept();
        System.out.println("The cipher text is: " + ROT13(s));;
    }
}