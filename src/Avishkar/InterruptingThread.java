package Avishkar;

/*
   Interrupting a Thread:
   If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException.
   If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behaviour and doesn't interrupt the thread but sets the interrupt flag to true.
   Let's first see the methods provided by the Thread class for thread interruption. The 3 methods provided by the Thread class for interrupting a thread

   public void interrupt()
   public static boolean interrupted()
   public boolean isInterrupted()

		Example of interrupting a thread that stops working. In this example, after interrupting the thread, we are propagating it, so it will stop working.
		If we don't want to stop the thread, we can handle it where sleep() or wait() method is invoked. Let's first see the example where we are propagating the exception.
*/
class TestInterruptingThread1 extends Thread
{
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("task");
		}catch(InterruptedException e){
			throw new RuntimeException("Thread interrupted..."+e);
		}
	}

	public static void main(String args[]){
		TestInterruptingThread1 t1=new TestInterruptingThread1();
		t1.start();
		try{
			t1.interrupt();
		}catch(Exception e){System.out.println("Exception handled "+e);}
	}
}
	/*
Example of interrupting a thread that doesn't stop working. In this example, after interrupting the thread, we handle the exception, so it will break out the sleeping but will not stop working.
class TestInterruptingThread2 extends Thread{
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("task");
		}catch(InterruptedException e){
			System.out.println("Exception handled "+e);
		}
		System.out.println("thread is running...");
	}

	public static void main(String args[]){
		TestInterruptingThread2 t1=new TestInterruptingThread2();
		t1.start();
		t1.interrupt();
	}
}
*/