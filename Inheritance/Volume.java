import java.util.*;
class Area
{
    double l, b;
    Area(double l, double b)
    {
        this.l = l;
        this.b = b;
    }

    double getArea()
    {
        return l*b;
    }

    void show()
    {
        System.out.println("Area: " + getArea());
    }
}

class Volume extends Area
{
    private double h;
    Volume(double l, double b, double h)
    {
        super(l, b);
        this.h = h;
    }
    double getVol()
    {
        return l*h*b;
    }

    void show()
    {
        super.show();
        System.out.println("Volume: "+ getVol());
    }
}

class Driver
{
    public static void main(String []s)
    {
        // Array of objects demonstration:
        double len, br, ht;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter no. of object: ");
        int n = sc.nextInt();
        Volume v[] = new Volume[n];
        for(int i = 0; i<n ;i++)
        {
            System.out.print("\nEnter length: ");
            len = sc.nextDouble();
            System.out.print("Enter breadth: ");
            br = sc.nextDouble();
            System.out.print("Enter height: ");
            ht = sc.nextDouble();
            v[i] = new Volume(len, br, ht);
            v[i].show();
            System.out.println("-------------------------------");
        }

        // // Dynamic Method Dispatch:
        // Area a;
        // a = new Volume(2, 5, 6);
        // a.show();
    }
}