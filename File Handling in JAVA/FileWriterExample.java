// Writing into a text file
import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("testout.txt");
            fw.write("Welcome to the world of JAVA programming");
            fw.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}