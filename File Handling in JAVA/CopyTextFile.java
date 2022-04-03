import java.io.*;
public class CopyTextFile
{
	static FileReader fr;
        static FileWriter fw;
	static void copy() throws IOException
	{
		BufferedReader br = new BufferedReader(fr);
		String cpy = " ";
		while(true)
		{
			cpy = br.readLine();
			if(cpy == null)
				break;
			fw.write(cpy + "\n");
		}
	}

       	public static void main(String []s) throws IOException
	{
		fr = new FileReader("read.txt");
		fw = new FileWriter("copied.txt");
	       	copy();
		fw.close();
                fr.close();

       	}

}
