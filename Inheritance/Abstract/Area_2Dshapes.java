/**
 * A program to demonstrate the usage of Abstract class
 * An Abstract class is a class in which we define the method signature but not the implementation or body of the method. Such no body methods are called abstract methods.
 * 
 * we use abstract keyword before class and method to make it abstract class and method respectively.
 * Any class that contains one or more abstract methods, the class must also be declared abstract.
 * An abstract class may contain non-abstract members.
 * If all the abstract methods are not defined in each sub-classes of the abstract class, then the sub-classes should also be make abstact using abstract keyword.
 * We cannot instantiate an abstract class.
 * 
 * This program contains an abstract super class: Area
 * An abstract method is defined and overriden in sub-classes: Rectangle, Square & Circle.
 * Type: Hiearchical inheritance
 */
abstract class Area {
    String shape; // stores the 2D-shape name
    Area(String shape)
    {
        this.shape = shape;
    }
    abstract double calcArea(); // function to compute Area

    void show() // displays area
    {
        System.out.println("Area of " + shape + " is: " + calcArea());
    }
} // end of abstract super-class Area

class Square extends Area
{
    private double side;
    Square(double side)
    {
        super("Square");
        this.side = side;
    }

    double calcArea()
    {
        return side * side;
    }

    void show()
    {
        System.out.println("Side: " + side);
        super.show();
    }

} // end of sub-class Square

class Rectangle extends Area
{
    private double length, breadth;
    Rectangle(double length, double breadth)
    {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    double calcArea()
    {
        return length * breadth;
    }

    void show()
    {
        System.out.println("Length: "+ length);
        System.out.println("Breadth: "+ breadth);
        super.show();
    }
} // end of sub-class Rectangle

class Triangle extends Area
{
    private double height, base;
    Triangle(double height, double base)
    {
        super("Triangle");
        this.height = height;
        this.base = base;
    }

    double calcArea()
    {
        return 0.5 * base * height;
    }

    void show()
    {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        super.show();
    }
} // end of sub-class Triangle

class Circle extends Area
{
    private double radius;
    Circle(double radius)
    {
        super("Circle");
        this.radius = radius;
    }

    double calcArea()
    {
        return 4 * Math.PI * radius * radius;
    }

    void show()
    {
        System.out.println("Radius: " + radius);
        super.show();
    }
} // end of sub-class Circle

class Area_2Dshapes // Driver class
{
    public static void main(String[] args) {
        /** NOTE:
         * Dynamic method dispatch is a concept by which the Java run-time environment determines (or decides) which version of an overriden method will be executed.
         * this method implements run-time polymorphism,
         * as it resolves the calls of overriding methods at run time.
         * Here, the show() method is overriden in all the sub classes
         * By making referrence of class Area we are referring to other classes;
         * in order to implement Dynamic Method Dispatch
         */ 
        Area a; // creating a reference of class Area as 'a'
        System.out.println("-------------------------------------");
        a = new Square(6); // a is referring to class Square's object
        a.show(); // calling the show() of Square class
        System.out.println("-------------------------------------");
        a = new Rectangle(3, 4); // a is referring to class Rectangle's object
        a.show(); // calling the show() of Rectangle class
        System.out.println("-------------------------------------");
        a = new Triangle(5, 6); // a is referring to class Triangle's object
        a.show(); // calling the show() of Triangle class
        System.out.println("-------------------------------------");
        a = new Circle(7); // a is referring to class Circle's object
        a.show(); // calling the show() of Circle class
        System.out.println("-------------------------------------");
    } // end of main()
} // end of class


/*
OUTPUT:
-------------------------------------
Side: 6.0
Area of Square is: 36.0
-------------------------------------
Length: 3.0
Breadth: 4.0
Area of Rectangle is: 12.0
-------------------------------------
Base: 6.0
Height: 5.0
Area of Triangle is: 15.0
-------------------------------------
Radius: 7.0
Area of Circle is: 615.7521601035994
-------------------------------------
*/
