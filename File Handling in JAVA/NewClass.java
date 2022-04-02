import java.io.*;

public class NewClass {
    public static void main(String[] args) {
        // initializing FileWriter
        FileWriter filewrite;
        try {
            filewrite = new FileWriter("ABC.txt");

            // Initialing BufferedWriter
            BufferedWriter bufferwrite = new BufferedWriter(filewrite);
            System.out.println("Buffered Writer start writing :)");

            // Use of write() method to write the value in 'ABC' file
            bufferwrite.write("ROHIT ROY\n");
            bufferwrite.write(49); // writes ASCII of 49 i.e 1
            bufferwrite.write('A');

            // Closing BufferWriter to end operation
            bufferwrite.close();
            System.out.println("Written successfully");
        } 
        catch (IOException excpt) {
            excpt.printStackTrace();
        }

    }
}