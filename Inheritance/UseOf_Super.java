/**
 * This program deals with the different ways we can inherit a Super Class using super keyword
 * Super can be used to invoke Super Class Constructor.
 * Super can be also used as a reference variable.
 * 
 *  NOTE: 
      - To invoke super class constructor, Super statement (i.e. super(...)) must be the first statement inside the sub class constructor.
      - If the sub-class constructor does not explicitly invoke a super class constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
      - If your method overrides one of its super class's methods, you can invoke the overridden method of super class through the use of super.methodName().
 * 
 * Super Class: A
 * Sub-class of A are: B, C and D
 * Type: Hiearchical Inheritance
 */

class A  // Super-class
{
    private int i;
    int a, b;
    A(int i)
    {
        System.out.println("------------------------------------------");
        System.out.println("Constructor of Super class A is invoked...");
        this.i = i;
    }
    
    A(int a, int b)
    {
        System.out.println("------------------------------------------");
        System.out.println("Constructor of Super class A is invoked...");
        this.a = a;
        this.b = b;
    }
    
    void show()
    {
        System.out.println("i = " + i);
    }
} // end of super class A

class B extends A
{
    private int j;
    B()
    {
        super(30); // invoking super-class constructor and also passing values
        System.out.println("Constructor of Sub-class B is invoked...");
        j = 74;
    }
    
    void show()
    {
        System.out.println("j = " + j);
        /**
         * In this class we are having two show function.
         * One from class B another from class A
         * 
         * So we are having method overriding here; 
         * In order to omit that we are using super keyword
         * Using super.show() we are calling show function of super-class
         */ 
        super.show();
    }
} // end of sub-class B

class C extends A
{
    private int k;
    C(int k) // parameterized constructor of a sub-class
    {
        super(12);
        System.out.println("Constructor of Sub-class C is invoked...");
        this.k = k;
    }
    
    void display()
    {
        show(); // calling a super-class function
        System.out.println("k = " + k);
    }
} // end of sub-class C

class D extends A 
{
    private int c;
    D(int p, int q, int c)
    {
        super(p, q);
        System.out.println("Constructor of Sub-class D is invoked...");
        this.c = c;
    }

    int sum()
    {   // we are using super class variables using super keyword
        /* Note: to use super class variables like these (shown below), 
        the super class variables must not be private, otherwise there will be an error. */
        return super.a + super.b + c;
    }
    
    void show()
    {
        System.out.println(super.a + " + " + super.b + " + "+ c + " = " + sum());
    }
} // end of sub-class D

class UseOf_Super // Driver class
{
    public static void main(String[] args) 
    {
        B objB = new B();
        objB.show();
        
        C objC = new C(99);
        objC.display();
        
        D objD = new D(7, 8, 6);
        objD.show();

        System.out.println("------------------------------------------\n");
    } // end of main
} // end of Driver class

/*
OUTPUT:
------------------------------------------
Constructor of Super class A is invoked...
Constructor of Sub-class B is invoked...
j = 74
i = 30
------------------------------------------
Constructor of Super class A is invoked...
Constructor of Sub-class C is invoked...
i = 12
k = 99
------------------------------------------
Constructor of Super class A is invoked...
Constructor of Sub-class D is invoked...
7 + 8 + 6 = 21
------------------------------------------

*/