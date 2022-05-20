/**
 gc() method runs the garbage collector. Calling this suggests that the Java Virtual Machine expend effort toward recycling unused objects in order to make the memory they currently occupy available for quick reuse. 
 System.gc() is used to invoke the garbage collector and on invocation garbage collector will run to reclaim the unused memory space. It will attempt to free the memory that are occupied by the discarded objects.
*/

public class Garbage {
    public static void main(String[] args) {
        System.out.println("Inside Garbage.main()");
        String str = "something!!";
        System.out.println(str);
        str = null; // making the string class object refering to nowhere or null
        Garbage g = new Garbage();
        System.out.println(g); // displays the hashcode (in hexadecimal) value of the class object
        g = null; // making the class object null
        System.out.println(g);
        System.gc(); // invoking garbage collection (GC)
        System.out.println("end of main()");
    } // end of main()

    public void finalize() // overriding finalize method
    {
        // this method is called when GC is invoked.
        // Note: finalize method is executed after main()
        System.out.println("Overriding finalize method");
    } // end of finalize()
} // end of class

/**
 * OUTPUT:
rohit@rohit-HP-Notebook:/media/rohit/My codes/Java in VSC/Flow with Java$ javac Garbage.java
Note: Garbage.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
rohit@rohit-HP-Notebook:/media/rohit/My codes/Java in VSC/Flow with Java$ java Garbage
Inside Garbage.main()
something!!
Garbage@7344699f
null
end of main()
Overriding finalize method
rohit@rohit-HP-Notebook:/media/rohit/My codes/Java in VSC/Flow with Java$
 */
