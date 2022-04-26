import java.util.*;
class Numbers
{
	int num;
	Numbers(int num)
	{
		this.num = num;
	}
	
	void show()
	{
		System.out.println("Decimal form: " + num);
	}
}

class Binary extends Numbers
{
	Binary(int n)
	{
		super(n);
	}
	
	int bin(int n)
	{
		if(n==0 || n ==1)
		return n;
		else
		return n%2 + 10*bin(n/2);
	}

	void show()
	{
		System.out.println(num + " in Binary form: " + bin(num));
	}
}

class Octal extends Numbers
{
	Octal(int n)
	{
		super(n);
	}

	int oct(int n)
    {
		if(n<=7)
            return n;
		else
            return n%8 + 10*oct(n/8);
	}
	
	void show()
    {
		System.out.println(num + " in Octal form: " + oct(num));
	}
}

class Hexadecimal extends Numbers
{
	Hexadecimal(int n)
	{
		super(n);
	}

	String hex(int n)
	{
		if(n<10)
		return Integer.toString(n);
		else if(n>=10 && n<16)
		{
			char ch = (char)(n + 55);
			return ch+"";
		}
		else
		return hex(n/16) + hex(n%16) ;
	}
	void show()
	{
		System.out.println(num + " in Hexadecimal form: " + hex(num));
	}
}

class Driver
{
	public static void main(String []s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter any number: ");
		int num = sc.nextInt();
		Numbers nm;
		nm = new Binary(num);
		nm.show();
		nm = new Octal(num);
		nm.show();
		nm = new Hexadecimal(num);
		nm.show();
		sc.close();
	}
}