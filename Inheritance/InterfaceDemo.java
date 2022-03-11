interface Interf
{
    void func1();
    void func2();
}

abstract class A implements Interf 
{
    public void func1()
    {
        System.out.println("Inside Class A");
    }
}

class B extends A // sub-class B implements Interf indirectly
{
    public void func2()
    {
        System.out.println("Inside Class B");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args) {
        Interf ref; // declaring reference to the object of class Interf
        ref = new B(); // allocating the reference to object of class B
        ref.func1();
        ref.func2();
    }
}