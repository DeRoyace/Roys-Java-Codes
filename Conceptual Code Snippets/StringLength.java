public class StringLength {
    public static void main(String[] args) {
        String s1; // string is not initialized
        String s2 = null; // string is initialized but it conatains nothing. No object created.
        String s3 = new String(); // string is initialized and object is created.
        // System.out.println(s1.length()); // gives Compile time error
        // System.out.println(s2.length()); // java.lang.NullPointerException;
        System.out.println(s3.length()); // 0
    }
}
