package Avishkar;/*
Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.

Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock)
in the same critical section to be executed. It is implemented by following methods of Object class:

wait()
notify()
notifyAll()

1) wait() method
Causes current thread to release the lock and wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
The current thread must own this object's monitor, so it must be called from the synchronized method only otherwise it will throw exception.

Method	Description
public final void wait()throws InterruptedException	waits until object is notified.
public final void wait(long timeout)throws InterruptedException	waits for the specified amount of time.

2) notify() method
Wakes up a single thread that is waiting on this object's monitor. If any threads are waiting on this object, one of them is chosen to be awakened.
The choice is arbitrary and occurs at the discretion of the implementation.

Syntax: public final void notify()

3) notifyAll() method
Wakes up all threads that are waiting on this object's monitor.

Syntax: public final void notifyAll()

Understanding the process of inter-thread communication
inter thread communication in java

Why wait(), notify() and notifyAll() methods are defined in Object class not Thread class?
It is because they are related to lock and object has a lock.

Difference between wait and sleep?
Let's see the important differences between wait and sleep methods.

			  wait()	                                                                                  sleep()
wait() method releases the lock	                                        sleep() method doesn't release the lock.
is the method of Object class	                                            is the method of Thread class
is the non-static method	                                                    is the static method
is the non-static method	                                                    is the static method
should be notified by notify() or notifyAll() methods	        after the specified amount of time, sleep is completed.

Example of inter thread communication in java
 */

class Customer{
	int amount=10000;

	synchronized void withdraw(int amount){
		System.out.println("going to withdraw...");

		if(this.amount<amount){
			System.out.println("Less balance; waiting for deposit...");
			try{
				wait();
			}
			catch(Exception e){}
		}
		this.amount-=amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount){
		System.out.println("going to deposit...");
		this.amount+=amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

class InterThreadCommunication{
	public static void main(String args[]){
		final Customer c=new Customer();
		new Thread(){
			public void run(){c.withdraw(15000);}
		}.start();
		new Thread(){
			public void run(){c.deposit(10000);}
		}.start();
	}
}