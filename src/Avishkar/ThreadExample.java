package Avishkar;

public class ThreadExample extends Thread{
	public void run(){
		for(int i=0;i<3;i++){
			try{
				System.out.println("Before Sleep");
				sleep(2000);// 2000 milliseconds i.e. 2 sec
				// sleep((int)(Math.random()*5000));// 5000 millisec i.e. 5 sec
				// The sleep() method in Thread might throw an InterruptedException. This would happen if some other thread wanted to interrupt this sleeping one.
				System.out.println("After Sleep");
			}
			catch(InterruptedException e){
				System.out.println(i);
			}
		}}
	public static void main(String args[]){
		new ThreadExample().start(); //Here we have created two ThreadExample objects and then start in parallel.
		new ThreadExample().start(); //We grant two Threads parallely.
		System.out.println("Done");
	}
}
// Inter process thread communication
// A problem occurs often when multiple threads are in execution, which is known as Data Races