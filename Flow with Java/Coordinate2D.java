/**
 * Q. Write a Java program to represent a point in the 2D Cartesian co-ordinate system. 
 * The program should then compute the distance between two such points.
 */
class Coordinate2D
{
	private int x, y;
	Coordinate2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	private int distance( Coordinate2D c1, Coordinate2D c2)
	{
		int x2 = (int) Math.pow(c1.x - c2.x, 2);
		int y2 = (int) Math.pow(c1.y - c2.y, 2);
		return (int) Math.sqrt(x2 + y2);
	}

	public static void main(String []args)
	{
		Coordinate2D co1 = new Coordinate2D(4, 5);
		Coordinate2D co2 = new Coordinate2D(5, 2);
		String p1 = "(" + co1.x + ", " + co1.y + ")";
		String p2 = "(" + co2.x + ", " + co2.y + ")";
		System.out.println("Distance between " + p1 + " and " + p2 + " is: " + co2.distance(co1, co2) );
	}
}
