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
        for(int i=0; i < arr.length; i++)
        {
            if(checkLetter(arr[i], ch))
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char ch = 'd';
        dispW(args, ch);
    }
}
