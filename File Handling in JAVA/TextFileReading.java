import java.io.*;
public class TextFileReading {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("read.txt");
        BufferedReader br =new BufferedReader(fr);
        String r;
        while(true)
        {
            r = br.readLine();
            if(r==null)
                break;
            System.out.println(r);
        }
        fr.close();
    }
}
