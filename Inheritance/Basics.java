class A
{
    A()
    {
        System.out.println("Super-class A is called...");
    }
}

class B extends A
{
    B()
    {
        System.out.println("Sub-class B is called...");       
    }
}

class Basics
{
    public static void main(String[] args) {
        B subObj = new B();
    }
}