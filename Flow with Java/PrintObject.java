public class PrintObject {
    public static void main(String[] args) {
        PrintObject obj = new PrintObject();
        System.out.println(obj); // PrintObject@7344699f
        System.out.println(obj.toString()); // PrintObject@7344699f
        System.out.printf("%x\n", obj.hashCode()); // 7344699f
        /**
         * on printing class object we get to see class name with @*****
         * the values after @ is the hashcode in hexadecimal form
         * this hashcode is is hashcode of the object
         * the hashcode is used in hash mapping (hashing algorithm)
         */
    }
}
