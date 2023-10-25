package Avishkar;

//Multithreading works good, it is fast but if u r not careful, u may not get right result.
//Data race example
public class DataRace extends Thread{
	static int x;
	public void run(){
		for(int i=0;i<1000;i++){
			x=x+1;
			x=x-1;
		}
	}
	public static void main(String args[]){
		x=0;
		for(int i=0;i<1000;i++){
			/*
			DataRace d=new DataRace();
			d.start();
			*/
			new DataRace().start();
			System.out.println(x); //Here x isn't always 0.
//Data Race is happening because threads are running simultaneously and not synchronically i.e. one thread must not be executed simultaneously when other thread is running having accessing the same variable as here in case of static variable.
		}
	}
}