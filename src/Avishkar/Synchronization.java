package Avishkar;

/*
Synchronization in java is the capability to control the access of multiple threads to any shared resource.
Java Synchronization is better option where we want to allow only one thread to access the shared resource.

The synchronization is mainly used to :-

i)To prevent thread interference.
ii)To prevent consistency problem.

There are two types of synchronization

1) Process Synchronization
2) Thread Synchronization

Here, we will discuss only thread synchronization. There are two types of thread synchronization mutual exclusive and inter-thread communication.

1) Mutual Exclusive
     i) Synchronized method.
     ii) Synchronized block.
     iii) Static synchronization.
2) Cooperation (Inter-thread communication in java)

Mutual Exclusive:- Mutual Exclusive helps keep threads from interfering with one another while sharing data. This can be done by three ways in java:

by synchronized method
by synchronized block
by static synchronization

Concept of Lock in Java :-

Synchronization is built around an internal entity known as the lock or monitor. Every object has an lock associated with it. By convention, a thread that
needs consistent access to an object's fields has to acquire the object's lock before accessing them, and then release the lock when it's done with them.

 */
class Thread1 extends Thread{
	MathUtils mu;
	public Thread1(MathUtils mu){
		this.mu=mu;
	}
	public void run(){
		try{
			mu.getMultiples(2);
		}
		catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
}

class Thread2 implements Runnable {
	MathUtils mu;
	public Thread2(MathUtils mu) {
		this.mu = mu;
	}
	public void run() {
		try {
			mu.getMultiples(3);
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

class MathUtils {
	void getMultiples(int n){
		//synchronized (this){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{ Thread.sleep(400); }
			catch (Exception e){ System.out.println(e); }
		}
	}
}

public class Synchronization {
	public static void main(String args[]){
		MathUtils obj=new MathUtils();
		Thread1 t1=new Thread1(obj);
		Thread t2=new Thread(new Thread2(obj));
		t1.start();
		t2.start();
	}
}
/*
Java synchronized method :- If you declare any method as synchronized, it is known as synchronized method. Synchronized method is used to lock an object for any shared resource.
When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.
 */