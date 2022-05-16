abstract class Sphere
{
	int r;
	Sphere(int r)
	{
		this.r = r;
	}
	abstract float getVol();
	abstract float getArea();
	void show()
	{
		System.out.printf("Radius of sphere: %d units\n", r);
	}
}

abstract class Area extends Sphere
{
	// we need to make class Area as abstract because getVol() is not defined here.
	Area(int radius)
	{
		super(radius);
	}

	float getArea()
	{
		return (float) (2 * Math.PI * r * r);
	}

	void show()
	{
		super.show();
		System.out.printf("Area of sphere  : %.2f sq. units\n", getArea());
	}
}

class Volume extends Area
{
	Volume()
	{
		super(7);
	}

	float getVol()
	{
		return (float) ((4/3) * Math.PI * r * r * r);
	}

	void show()
	{
		super.show();
		System.out.printf("Volume of sphere: %.2f cubic units\n", getVol());
	}
}

class Driver
{
	public static void main(String []args)
	{
		Sphere s;
		s = new Volume();
		s.show();
	}
}

/**
 * OUTPUT:
rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Inheritance/Abstract$ javac Sphere.java
rohit@rohit-HP-Notebook:/rohit/Desktop/My codes/Java in VSC/Inheritance/Abstract$ java Driver
Radius of sphere: 7 units
Area of sphere  : 307.88 sq. units
Volume of sphere: 1077.57 cubic units
*/
