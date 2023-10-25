package Avishkar;/*
The isAlive( ) method returns true if the thread upon which it is called is still running. It returns false otherwise. The general structure of this method is:
final boolean isAlive(

java.lang.Thread class provides the join() method which allows one thread to wait until another thread completes its execution.
If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is terminated before the next instruction is executed by the program.
If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify a waiting period.
However, as with sleep, join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.

There are three overloaded join functions.

join(): It will put the current thread on wait until the thread on which it is called is dead. If thread is interrupted then it will throw InterruptedException.
Syntax:
public final void join()

join(long millis) :It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds).
Syntax:
public final synchronized void join(long millis)

join(long millis, int nanos): It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds + nanos).
Syntax:
public final synchronized void join(long millis, int nanos)
 */

class ThreadJoining extends Thread
{
	public void run()
	{
		for (int i = 0; i < 2; i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Current Thread: "  + Thread.currentThread().getName());
			}
			catch(Exception ex)
			{
				System.out.println("Exception has been caught" + ex);
			}
			System.out.println(i);
		}
	}}

class JoinThread
{
	public static void main (String[] args)
	{
		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();
		t1.start(); // thread t1 starts
		// starts second thread after when first thread t1 has died.
		try
		{
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			System.out.println(t1.isAlive());
			t1.join();
			System.out.println(t1.isAlive());
		}

		catch(Exception ex)
		{
			System.out.println("Exception has been caught" + ex);
		}
		t2.start(); // t2 starts
		// starts t3 after when thread t2 has died.
		try
		{
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t2.join();
		}
		catch(Exception ex)
		{
			System.out.println("Exception has been caught" + ex);
		}
		t3.start();
	}
}