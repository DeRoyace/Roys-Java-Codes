interface Interf
{
	/** By default : 
		- all member functions are public
		- all data members are public, static and final. So, variables need to be initialize.
	*/
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
        Interf ref; // creating reference of class Interf
        // NOTE: We cannot create object of an interface
        ref = new B(); // allocating the reference to object of class B
        ref.func1();
        ref.func2();
    }
}
