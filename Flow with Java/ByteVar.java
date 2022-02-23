class ByteVar{
    public static void main(String[] args) {
        final int v = 7; // final keywordensures that value won't change.
        // int v = 7;
        byte a = v; // b can't store value of a untill an unless it is type casted or variable is made final.
        byte b = (byte) 130; // 130 is out of range of byte type variables. Byte : -128 to 127 => 256
        System.out.println(a); // 7
        System.out.println(b); // -126  => 130 - 256 = -126 
    }
}