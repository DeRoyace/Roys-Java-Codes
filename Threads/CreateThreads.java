class NewThread extends Thread
{
	// creating thread by extending Thread class
	String ThreadName;
	NewThread( String ThreadName)
	{
		this.ThreadName = ThreadName;
	}

	public void run()
	{
		try{
			for(int i = 1; i<=10; i++)
			{
				System.out.println(ThreadName + " : " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(ThreadName + " is finished...");
	}
}

class MyThread implements Runnable
{
	// creating thread by implementing Runnable interface
	String ThreadName;
	Thread t;
	MyThread( String ThreadName)
	{
		this.ThreadName = ThreadName;
		t = new Thread(this.ThreadName);
		System.out.println("New Thread: " + t);
		t.start();
	}

	public void run()
	{
		try{
			for(int i = 1; i<=10; i++)
			{
				System.out.println(ThreadName + " : " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(ThreadName + " is finished...");
	}
}

class CreateThreads
{
	public static void main(String args[])
	{
		
		NewThread t1 = new NewThread("Thread 1");
		NewThread t2 = new NewThread("Thread 2");
        t1.start();
		t2.start();

		new MyThread("One");
		new MyThread("Two");
	}
}

/**
 * OUTPUT:
 * 
New Thread: Thread[One,5,main]
New Thread: Thread[Two,5,main]
Thread 1 : 1
Thread 2 : 1
Thread 1 : 2
Thread 2 : 2
Thread 1 : 3
Thread 2 : 3
Thread 1 : 4
Thread 2 : 4
Thread 1 : 5
Thread 2 : 5
Thread 1 : 6
Thread 2 : 6
Thread 1 : 7
Thread 2 : 7
Thread 1 : 8
Thread 2 : 8
Thread 1 : 9
Thread 2 : 9
Thread 1 : 10
Thread 2 : 10
Thread 1 is finished...
Thread 2 is finished...
 */