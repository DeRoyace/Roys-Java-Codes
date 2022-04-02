// Reading a Text file in console.
import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExample {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("testout.txt");
            BufferedReader br= new BufferedReader(fr);
            String s="";
            while( (s=br.readLine())!=null)
            {
                System.out.println(s);
            }
            br.close();
            fr.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}