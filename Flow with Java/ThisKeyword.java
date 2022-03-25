class UsingThis {
    private int a = 4;
    private int b = 1;

    void getSum(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(this.a + this.b);
    }
}

public class ThisKeyword {
    public static void main(String args[]) {
        UsingThis T = new UsingThis();
        T.getSum(3, 5);
    }
}