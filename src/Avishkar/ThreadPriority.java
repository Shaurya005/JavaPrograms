package Avishkar;

//Setting priority to threads. There are three priority viz. min, max, and normal
/*
To set a thread’s priority, use the setPriority( ) method, which is a member of Thread. Its general form is:

final void setPriority(int level)

Here, level specifies the new priority setting for the calling thread. The value of level must be within the range MIN_PRIORITY and MAX_PRIORITY,
Currently, these values are 1 and 10, respectively. To return a thread to default priority, specify NORM_PRIORITY, which is currently 5.
These priorities are defined as static final variables within Thread. You can obtain the current priority setting by calling the getPriority( ) method of Thread,

final int getPriority(
 */
class Thread_A extends Thread{
	public void run(){
		System.out.println("Start Thread A.....");
		for(int i=1;i<=5;i++){
			System.out.println("From Thread A: i = "+i);
		}
		System.out.println("....Exit Thread A");
	}}

class Thread_B extends Thread{
	public void run(){
		System.out.println("Start Thread B.....");
		for(int j=1;j<=5;j++){
			System.out.println("From Thread B: j = "+j);
		}
		System.out.println("....Exit Thread B");
	}}

class Thread_C extends Thread{
	public void run(){
		System.out.println("Start Thread C.....");
		for(int k=1;k<=5;k++){
			System.out.println("From Thread C: k ="+k);
		}
		System.out.println("....Exit Thread C");
	}}

class ThreadPriority{
	public static void main(String args[]){
		Thread_A t1=new Thread_A();
		Thread_B t2=new Thread_B();
		Thread_C t3=new Thread_C();

		t3.setPriority(Thread.MAX_PRIORITY); //Scheduler now know that this thread will be executed first
	    t2.setPriority(t1.getPriority()+1);//random priority based on current priority of t1
		t2.setPriority(6);
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Started Thread A");
		t1.start();
		System.out.println("Started Thread B");
		t2.start();
		System.out.println("Started Thread C");
		t3.start();
		System.out.println("End of execution ");
	}
 }