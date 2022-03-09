/**
 * A program to demonstrate the usage of Abstract class
 * An 
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
    double side;
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
    double length, breadth;
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
    double height, base;
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
    double radius;
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
        Area a;
        System.out.println("-------------------------------------");
        a = new Square(6);
        a.show();
        System.out.println("-------------------------------------");
        a = new Rectangle(3, 4);
        a.show();
        System.out.println("-------------------------------------");
        a = new Triangle(5, 6);
        a.show();
        System.out.println("-------------------------------------");
        a = new Circle(7);
        a.show();
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