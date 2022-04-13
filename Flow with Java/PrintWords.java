import java.util.StringTokenizer;

public class PrintWords 
{
    static boolean checkLetter(String w, char ch)
    {
        if(w.equals(""))
            return false;
        if(w.charAt(0) == ch)
            return true;
        else
            return checkLetter(w.substring(1), ch);
    }

    static void dispW(String arr[], char ch)
    {
        int flag=0;
        for(int i=0; i < arr.length; i++)
        {
            if(checkLetter(arr[i], ch))
            {
                flag=1;
                System.out.print(arr[i] + ", ");
            }
        }
        if(flag==1)
            System.out.println();
    }

    static void extract(String str[], char ch)
    {
        String wrd[];
        int count=0;
        for(int i=0; i < str.length; i++)
        {
            str[i] = str[i].trim();
            StringTokenizer st = new StringTokenizer(str[i], " .?!,;");
            count = st.countTokens();
            wrd = new String[count];
            for(int j=0; j<count; j++)
            {
                wrd[j] = st.nextToken();
            }

            if(count==1)
                dispW(wrd, ch);
            else
            {
                System.out.printf("\nThe words that contains letter \'%c\' in string %d: ", ch, (i+1));
                dispW(wrd, ch);
            }
        }
    }

    public static void main(String[] args) {
        char ch = 'd';
        // dispW(args, ch);
        extract(args, ch);
    }
}
