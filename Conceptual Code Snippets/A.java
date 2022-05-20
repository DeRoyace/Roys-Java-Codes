public class A 
{
    public void display() 
    {
        System.out.println("A");
    }
}

class B extends A 
{
    public static void main(String[] str) 
    {
        A a = new B();
        a.display();
    }

    public void display() 
    {
        System.out.println("B");
    }
}

// OUTPUT: B
