public class UnicodeValue {
    public static void main(String[] args) {
        char ch = '\u005A';
        /**
         A = 10
         \u005A (base 16) = (16^1) x 5 + (16^0) x 10 [base 10] = 90 (ascii of Z)
         */
        System.out.println(ch);
    }
}