import java.io.*;
public class CheckedException {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any sentence: ");
        String s = br.readLine();
        System.out.println("Your string: " + s);
        System.out.println("End of main()");
    }
}

/**
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC/Exception Handling$ javac CheckedException.java
CheckedException.java:6: error: unreported exception IOException; must be caught or declared to be thrown
        String s = br.readLine();
                              ^
1 error
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC/Exception Handling$
 */
