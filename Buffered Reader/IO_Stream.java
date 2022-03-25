import java.io.*;

class IO_Stream {
    /**     
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter any string: ");
        String s = br.readLine();
        System.out.println("Your String is: " + s);
    }
    */
    public static void main(String[] args) 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.print("\nEnter any string: ");
            String s = br.readLine();
            System.out.println("Your String is: " + s);
        } 
        catch (IOException e) {
            System.out.println("Exception occured: " + e);
        }
    }
}