/**
 * Q. Write a Java program to define a class for representing a complex number.
The program should then add two complex numbers.
 */
class ComplexNum
{
	int real, imag;
	ComplexNum(int real, int imag)
	{
		this.real = real;
		this.imag = imag;
	}

	private void add(ComplexNum c1, ComplexNum c2)
	{
		int r = c1.real + c2.real;
		int i = c1.imag + c2.imag;
		System.out.print("\nSum = ");
		display(r, i);
	}

	private void display(int r, int i)
	{
		System.out.print(r + " + " + i + "i");
	}

	public static void main(String []args)
	{
		ComplexNum cn1 = new ComplexNum(24, 9);
		System.out.print("\nComplex number 1: ");
		cn1.display(cn1.real, cn1.imag);
		ComplexNum cn2 = new ComplexNum(18, 12);
		System.out.print("\nComplex number 2: ");
		cn2.display(cn2.real, cn2.imag);
		cn2.add(cn1, cn2);
	}
}
