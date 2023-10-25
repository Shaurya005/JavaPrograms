package Avishkar;

//Creating three threads with Thread class already defined in java.lang and then running them concurrently.
// We can create our thread either by extending the Thread Class or by Implementing the Runnable Interface. Here we're extending the Thread Class.
class ThreadA extends Thread{
	public void run() //Overriding run method in Thread class
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("From Thread A with i="+(-1*i));
			// It will be printing five negative numbers.
		}
		System.out.println("Exiting from Thread A");}
}
class ThreadB extends Thread{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("From Thread B with j="+2*j);
			// It'll be printing five even numbers
		}
		System.out.println("Exiting from Thread B");
		}
}
class ThreadC extends Thread{
	public void run(){
		for(int k=1;k<=5;k++)
		{
			System.out.println("From Thread C with k= "+(2*k-1));
			//
		} //If here 2*k-1 is written without bracket then it'll show error as- "error: bad operand types for binary operator '-'."
		System.out.println("Exiting from Thread C");}
}
class MultiThreading{
	public static void main(String args[]){
		ThreadA a=new ThreadA(); // This is how we create a thread for our own.
		ThreadB b=new ThreadB();
		//Three Thread Objects for three classes
		a.start(); //In order to run the thread we have to invoke start method for each thread object.
		b.start();
		new ThreadC().start(); // This is direct way of starting your thread by extending thread class.
		System.out.println("....Multithreading is over ");
	}
}
//Main method itself  here together is a thread so total 4 threads will run here.
//Here we don't know which thread will be executed in which order as no priority has been assigned and scheduler will take all threads and depending on its own, threads will be executed in random order.
//In every time running this program, output will be in different order.
//Here when program is running, all threads are executing paralelly but on display we are getting synchronically as we have only one display i.e. all the threads here are running independently.