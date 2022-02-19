public class floaterror {
    public static void main(String[] args) {
        float v= (float) 123.45; // here type casting req otherwise error
        // 123.45 is taken as double, so double to float conversion error will occur, i.e, precission error. To omit the error we do type casting.
        System.out.println("v = " + v);
    }
}
