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
} // end of super class A

class B extends A
{
    B()
    {
        System.out.println("Sub-class B is called...");       
    }
} // end of sub class B

class Basics  // driver class
{
    public static void main(String[] args) {
        B subObj = new B();
    }
}

/**
Output:
Super-class A is called...
Sub-class B is called...
*/