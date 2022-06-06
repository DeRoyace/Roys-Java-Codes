/**
 * Inheritance is a proprty by which we can inherit the properties of one class to another
 * In this program we are using the properties of class A in class B (inheriting class A)
 * To inherit a class we need to use extends keyword.
 * 
 * Type: Single Inheritance
 */
class A
{
    A()
    {
        System.out.println("Super-class A is called...");
    }
    
    public static void func()
    {
        System.out.println("Inside Super-class method");
    }

    public void show()
    {
        System.out.println("show() of class A");
    }
} // end of super class A

class B extends A
{
    B()
    {
        System.out.println("Sub-class B is called...");       
    }
    /**
     * NOTE:
     * func() is not overridden rather its hidden by func() in class A
     * Since func() is static, there is no chance of run time polymorphism.
     * show() is overridden in class B
     */
    public static void func()
    {
        System.out.println("Inside Sub-class method");
    }

    public void show()
    {
        System.out.println("Overridden show() in class B");
    }
} // end of sub class B

class Basics  // driver class
{
    public static void main(String[] args) {
        B subObj = new B();
        subObj.func();
        subObj.show();
    }
}

/**
Output:
SSuper-class A is called...
Sub-class B is called...
Inside Sub-class method
Overridden show() in class B
*/