import java.io.*;
public class CharIO
{
	public static void main(String []s) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter any single  character: ");
		//char ch = (char) br.read();
		char ch = (char) System.in.read();
		System.out.println("Your character is: " + ch);
	}
}
