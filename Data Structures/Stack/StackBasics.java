import java.util.Scanner;

class StackBasics
{
	int top, N, st[];
	StackBasics(int size) // parameterized constructor to initialize array and top index
	{
		N = size;
		top = -1;
		st = new int[N];
	}

	// function to insert elements into the stack:
	void push(int v)
	{
		if(top == N-1)
		{
			System.out.println("ALERT: Stack is full!\nUnable to insert element " + v);
			return;
		}
		st[++top] = v;
	}

	void pop() // function to delete topmost element of the stack
	{
		if(top == -1)
		{
			System.out.println("Stack is empty!");
			return;
		}
		int val = st[top--];
		System.out.println("Poped element is " + val);
	}

	void peep() // function to show the topmost element
	{
		if(top == -1)
		{
			System.out.println("Stack is empty!");
			return;
		}
		System.out.println("Topmost element is " + st[top]);
	}

	void display() // function to display stack elements
	{
		if(top == -1)
		{
			System.out.println("Stack is empty!");
			return;
		}
		System.out.println("Stack flements are: ");
		for(int i = top; i >= 0; i--)
			System.out.println(st[i]);
	} // end of display

	void choice() // choice menu
	{
		System.out.println("1: Insert element");
		System.out.println("2: Delete topmost element");
		System.out.println("3. Show topmost element");
		System.out.println("4: Display stack elements");
		System.out.println("5: Empty stack");
		System.out.println("6: Terminate the program");
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		System.out.println();
		switch(ch){
			case 1:
			System.out.print("Enter element to be inserted: ");
			int e = sc.nextInt();
			push(e);
			break;
			
			case 2:
			pop();
			break;
			
			case 3:
			peep();
			break;
			
			case 4:
			display();
			break;
			
			case 5:
			top = -1;
			System.out.println("Stack is empty now.");
			break;

			case 6:
			System.exit(0);

			default:
			System.out.println("Invalid chhoice\nEnter again...");
			choice();
		}
	} // end of choice()
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter size of stack: ");
		int size = sc.nextInt();
		StackBasics sb = new StackBasics(size);
		while(true)
		{
			sb.choice();
			System.out.println("------------------------------------------");
		}	
	} // end of main()
} // end of class

