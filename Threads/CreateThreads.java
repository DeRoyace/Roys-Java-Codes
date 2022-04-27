class NewThread extends Thread
{
	// creating thread by extending Thread class
	String threadName;
	NewThread( String threadName)
	{
		this.threadName = threadName;
	}

	public void run()
	{
		try{
			for(int i = 1; i<=10; i++)
			{
				System.out.println(threadName + " : " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(threadName + " is finished...");
	}
}

class MyThread implements Runnable
{
	// creating thread by implementing Runnable interface
	String threadName;
	Thread t;
	MyThread( String threadName)
	{
		this.threadName = threadName;
		t = new Thread(this, threadName); // instantiating the user defined thread
		System.out.println("New Thread: " + t);
		t.start(); // ready to run the thread
	}

	public void run()
	{
		try{
			for(int i = 1; i<=10; i++)
			{
				System.out.println(threadName + " : " + i);
				Thread.sleep(500); // blocking for 0.5s
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(threadName + " is finished...");
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
Two : 1
Thread 2 : 1
Thread 1 : 1
One : 1
Two : 2
Thread 2 : 2
Thread 1 : 2
One : 2
Two : 3
Thread 2 : 3
Thread 1 : 3
One : 3
Two : 4
Thread 2 : 4
Thread 1 : 4
One : 4
Two : 5
Thread 2 : 5
Thread 1 : 5
One : 5
Two : 6
Thread 2 : 6
Thread 1 : 6
One : 6
Two : 7
Thread 2 : 7
Thread 1 : 7
One : 7
Two : 8
Thread 2 : 8
Thread 1 : 8
One : 8
Two : 9
Thread 2 : 9
Thread 1 : 9
One : 9
Two : 10
Thread 2 : 10
Thread 1 : 10
One : 10
Two is finished...
Thread 2 is finished...
One is finished...
Thread 1 is finished...
 */
