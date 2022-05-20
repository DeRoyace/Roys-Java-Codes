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
 * Sub-class of A are: B, C, D and E
 * Type: Hiearchical Inheritance
 */

class A  // Super-class
{
    private int i;
    int a, b;
    A()
    {
        System.out.println("------------------------------------------");
        System.out.println("Constructor of Super class A is invoked...");
    }
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
    
    void show() // overriding show() function
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
    {   
        /* Note: to use super class variables like these (shown below), 
        the super class variables must not be private, otherwise there will be an error.
        * Also, if we have invoked super class constructor in sub-class constructor then we don't need to write super.VariableName for using super class variables.
        */
        return super.a + super.b + c; // using super as reference variable though it was not needed here.
    }
    
    void show() // overriding show() function
    {
        System.out.println(a + " + " + b + " + "+ c + " = " + sum());
    }
} // end of sub-class D

class E extends A
{
    private int e;
    E()
    {
        System.out.println("Constructor of Sub-class E is invoked...");
    }
    void disp()
    {
        // i = 50; // error as i is private
        a=100;
        b=200;
        e=300;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("E = " + e);
    }
}

class UseOf_Super // Driver class
{
    public static void main(String[] args) 
    {
        B objB = new B();
        objB.show(); // calling the show() of class B
        
        C objC = new C(99);
        objC.display();
        
        D objD = new D(7, 8, 6);
        objD.show();

        E objE = new E();
        objE.disp();

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
Constructor of Super class A is invoked...
Constructor of Sub-class E is invoked...
A = 100
B = 200
E = 300
------------------------------------------

*/
