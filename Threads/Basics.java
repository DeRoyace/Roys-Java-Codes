/**
 * Thread - It is a light weight sub process that takes same memory space.
 * It exists within a process. Every process has atleast one thread, i.e. Main thread.
 * It provides an execution environment
 * It switches content very fast
 * 
 * Java has a Multi-thread programming feature, where more than one thread can run concurrently within the same memory space.
 * Each thread has a seperate part of execution that will run in parallel with the main thread. Thus, multi-threading is a specialized form of multi-tasking.
 * Each thread has a priority. Thread with higher priority will execute first.
 * Example: A Word processor having one thread running as writing into the word file and another thread to autosave the document.
 */
class Basics
{
	public static void main(String s[])
	{
		 String ThreadName = Thread.currentThread().getName();
		 System.out.println("Name of the current Thread is: " + ThreadName);
		 System.out.println("How many threads are running?  Ans:" + Thread.activeCount());
		 System.out.println( ThreadName + " thread is alive ?  Ans: " + Thread.currentThread().isAlive());

		 // changing the name of Current thread:
		 Thread.currentThread().setName("Mr.Java");
		 String NewName = Thread.currentThread().getName();
		 System.out.println("Name of the current thread: " + NewName);

		 // Thread Priorities:
		 // Java assigns to each thread a priority that determines how that thread should be treated wrt others.
		 // Thread priority is used to decide when to switch from one running thread to the next thread. This is called a context switching.
		 // Minimum Priority  - 1
		 // Normal Priority   - 5
		 // Maximum priority  - 10
		 System.out.println("Priority of the current thread: " + Thread.currentThread().getPriority());
		 Thread.currentThread().setPriority(7);
		 System.out.println("Updated Thread priority: " + Thread.currentThread().getPriority());
		 
		 //sleep(): suspends a thread for a period of time.
		 try{
			 System.out.println("\nExiting \'" + NewName + "\' thread in 5 seconds...");
			 for(int i = 5; i>0; i--)
			 {
				 System.out.println(i);
				 Thread.sleep(1000); // delays in milliseconds
			 }
			 System.exit(0);
		 }
		 catch(InterruptedException e)
		 {
			 System.out.println("Interrupted...");
		 }
	}
}
