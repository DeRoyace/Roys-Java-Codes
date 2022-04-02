import java.io.*;

public class TextFileWriting {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("write.txt");
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("\nEnter a sentence to write in file: ");
        String w = br.readLine();
        fw.write(w);
        fw.close();
    }
}