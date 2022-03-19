public class CheckedException {
    public static void main(String[] args) {
        int num = 9;
        try{
            int result = num / 0;
            System.out.println(result);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println("End of main()");
    }
}

/**
rohit@rohit-HP-Notebook:/rohit/My codes/Java in VSC/Exception Handling$ javac CheckedException.java
rohit@rohit-HP-Notebook:/rohit/My codes/Java in VSC/Exception Handling$ java CheckedException
java.lang.ArithmeticException: / by zero
End of main()
rohit@rohit-HP-Notebook:/rohit/My codes/Java in VSC/Exception Handling$
 */