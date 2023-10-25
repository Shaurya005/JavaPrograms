package Avishkar;

//Demo of thread class methods: getID()
//Java code for thread creation by implementing Runnable Interface
//Every thread  whenever it is in execution from the program point of view 
//we can get have information about the threads by means of their identity. So, the Id of a Thread can be accessed by a method called the getId, which is defined in the class Thread in the Java.lang.methods class. 
class ThreadId_ implements Runnable{
	public void run(){
		try{
//Displaying the thread that is running
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e){
//Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
public class ThreadIdUsingRunnable{
	public static void main(String args[]){
		int n=8;//Number of threads
		for(int i=0;i<8;i++){
			Thread obj=new Thread(new ThreadId_());//Note the difference as in case of Thread class
//So nine threads will be executed, we are running for same class ThreadId but nine differernt ocassions 
			obj.start();//Here nine threads will be executed, although here we r calling one by one but whenever when these threads will be in execution, they will execute parellely, simultaneously or oncurrently.
		}//It creates thread in each loop and each thread will be executed
	}//Here also on running this program we get different order of results everytime
}