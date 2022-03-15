/**
 * Type: Multi-level inheritance
 * A, B & C are both super class and sub-class wrt their usage:
 * B is sub-class of A
 * C is sub-class of B
 * D is sub-class of C
 */
class A
{
    private int a;
    A(int a)
    {
        this.a = a;
    }

    void show()
    {
        System.out.println("A: " + a);
    }
}

class B extends A
{
    private int b;
    B(int a, int b)
    {
        super(a);
        this.b = b;
    }

    void show()
    {
        System.out.println("B: " + b);
        super.show();
    }
}

class C extends B
{
    private int c;
    C(int a, int b, int c)
    {
        super(a, b);
        this.c = c;
    }

    void show()
    {
        System.out.println("C: " + c);
        super.show();
    }
}

class D extends C
{
    private int d;
    D(int a, int b, int c, int d)
    {
        super(a, b, c);
        this.d = d;
    }

    void show()
    {
        System.out.println("D: " + d);
        super.show();
    }
}

class Multi_Level {
    
    public static void main(String[] args) {
        
        A ref;
        System.out.println("Class A: ");
        ref = new A(12);
        ref.show();
        System.out.println("----------");
        System.out.println("Class B: ");
        ref = new B(45, 56);
        ref.show();
        System.out.println("----------");
        System.out.println("Class C: ");
        ref = new C(70, 67, 89);
        ref.show();
        System.out.println("----------");
        System.out.println("Class D: ");
        ref = new D(90, 98, 99, 100);
        ref.show();

    }
}

/**
 * OUTPUT:
Class A: 
A: 12
----------
Class B: 
B: 56
A: 45
----------
Class C: 
C: 89
B: 67
A: 70
----------
Class D: 
D: 100
C: 99
B: 98
A: 90
 */