public class StringPalinCLA {

    static int isPalin(String x)
    {
        int len=0;
        if(!x.equals(""))
            len = x.length();

        if(len==1 || len==0)
            return 1;
        else if(x.charAt(0) == x.charAt( len-1 ))
            return isPalin(x.substring(1, len-1) );
        else
            return 0;
    }

    public static void main(String[] args) {
        String cat = "";
        for(int i = 0; i<args.length; i++)
        {
            cat+=args[i]; // to concatenate arguments
            
            if ( isPalin(args[i])==1)
                System.out.println(args[i] + " -> is Palindromic");
            else
                System.out.println(args[i] + " -> Not Palindromic");
        }

    // Code below checking whether concatenating the arguments produces a palindromic string or not
        // if ( isPalin(cat)==1)
        //     System.out.println(cat + " -> is Palindromic");
        // else
        //     System.out.println(cat+ " -> Not Palindromic");
    }
}