import java.io.*;
class CountNumerics
{
	public static void main(String args[]) throws IOException
	{
		BufferedInputStream bis = new BufferedInputStream( new FileInputStream("myFile.txt"));
		int ch, count = 0;
		String s = "";
		while(true)
		{
			ch = bis.read();
			char c = (char) ch;
			s += c;
			if(Character.isDigit(c))
				count++;
			if(ch == -1)
				break;
		}
		System.out.println(s);
		System.out.println("No. of numeric characters: " + count);
		bis.close();
	}
}
