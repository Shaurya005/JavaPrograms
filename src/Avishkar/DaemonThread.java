package Avishkar;

/*
Daemon thread in java is a service provider thread that provides services to the user thread. Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.
Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection.

There are many java daemon threads running automatically e.g. gc, finalizer etc.

Points to remember for Daemon Thread in Java :-

It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
They can not prevent the JVM from exiting when all the user threads finish their execution so its life depends on user threads
JVM terminates itself when all user threads finish their execution
If JVM finds running daemon thread, it terminates the thread and after that shutdown itself. JVM does not care whether Daemon thread is running or not.
It is an utmost low priority thread.

The java.lang.Thread class provides two methods for java daemon thread.

void setDaemon(boolean status): This method is used to mark the current thread as daemon thread or user thread.
                                                          For example if I have a user thread tU then tU.setDaemon(true) would make it Daemon thread.
                                                          On the other hand if I have a Daemon thread tD then by calling tD.setDaemon(false) would make it user thread.
boolean isDaemon():                     This method is used to check that current is daemon. It returns true if the thread is Daemon else it returns false.

*/
public class DaemonThread extends Thread
{
	public DaemonThread(String name){
		super(name);
	}
	public void run()
	{
		// Checking whether the thread is Daemon or not
		if(Thread.currentThread().isDaemon())
			System.out.println(getName() + " is Daemon thread");
		else
			System.out.println(getName() + " is User thread");
	}
	public static void main(String[] args)
	{
		DaemonThread t1 = new DaemonThread("t1");
		DaemonThread t2 = new DaemonThread("t2");
		DaemonThread t3 = new DaemonThread("t3");

		// Setting user thread t1 to Daemon
		t1.setDaemon(true);

		// starting first 2 threads
		t1.start();
		t2.start();
		// Setting user thread t3 to Daemon
		t3.setDaemon(true);
		t3.start();
	}
}
/*
Note: If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.

public class DaemonThread extends Thread
{
    public void run()
    {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Check if its DaemonThread: "
                        + Thread.currentThread().isDaemon());
    }
    public static void main(String[] args)
    {
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        t1.start();
        // Exception as the thread is already started
        t1.setDaemon(true);
        t2.start();
    }
}
*/