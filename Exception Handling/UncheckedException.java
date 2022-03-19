class UncheckedException
{
    public static void main(String[] args) {
        int n = 9;
        int result = n / 0;
        System.out.println(result); 
        System.out.println("Something??"); 
    }
}

/**
 * OUTPUT:
rohit@rohit-HP-Notebook:/rohit/My codes/Java in VSC/Exception Handling$ javac UncheckedException.java
rohit@rohit-HP-Notebook:/rohit/My codes/Java in VSC/Exception Handling$ java UncheckedException
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at UncheckedException.main(UncheckedException.java:5)
rohit@rohit-HP-Notebook:/rohit/My codes/Java in VSC/Exception Handling$
 */