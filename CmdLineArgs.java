public class CmdLineArgs {
    public static void main(String[] argv) {
        int i,argc;
        argc=argv.length;
        System.out.println("Number of command line arguments = "+argc);
		System.out.println("The command line arguments are ....");
		for(i=0;i<argc;i++)
			System.out.println(argv[i]);
    }
}

/**

OUTPUT 1: 
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ javac CmdLineArgs.java
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java CmdLineArgs "Hello World!" "This are command line args"
Number of command line arguments = 2
The command line arguments are ....
Hello World!
This are command line args
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ 

OUTPUT 2:
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java CmdLineArgs Command Line Arguments
Number of command line arguments = 3
The command line arguments are ....
Command
Line
Arguments
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ 

*/