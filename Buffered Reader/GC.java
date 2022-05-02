import java.io.*;
public class GC
{
    public static void main(String []s) throws IOException
    {
		GC g = new GC();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter any single  character: ");
        char ch = (char) br.read();
        System.out.println("Your character is: " + ch);
		g = null;
		System.gc();
		System.out.println("Exiting...");
		System.exit(0);
		System.out.println("End of Main().");
    }
	
	public void finalize()
	{
		System.out.println("Inside overriding finalize().");
	}
}
