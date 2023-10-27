package NPTEL_Programs.Demonstration_6.src;

//Creating theads wih Runnable interface and then running them concurrently
//Create object implementing Runnable interface
//Pass it to Thread object via Thread constructor
class ThreadX implements Runnable
{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Thread X with i ="+-1*i);
		}
		System.out.println("Exiting from thread X....");
	}
}
class ThreadY implements Runnable
{
	public void run(){//Abstract method run in Runnable interface which needs to be overridden
		for(int j=1;j<=5;j++){
			System.out.println("Thread Y with j ="+2*j);
		}
		System.out.println("Exiting from thread Y....");
	}
}
class ThreadZ implements Runnable
{
	public void run(){
		for(int k=1;k<=5;k++){
			System.out.println("Thread Z with k ="+(2*k-1));
		}
		System.out.println("Exiting from thread Z....");
	}
}
class MultiThreadRunnable{
	public static void main(String args[]){
		ThreadX x=new ThreadX();//x is basically object of class ThreadX
		Thread t1=new Thread(x);//t1 is the thread of that object x i.e. t1 is the thread object of class ThreadX
		ThreadY y=new ThreadY();
		Thread t2=new Thread(y);
//ThreadZ z=new ThreadZ();
//Thread t3=new Thread(z);
		Thread t3=new Thread(new ThreadZ());//Shortcut method, here also t3 is the thread object of class ThreadZ
		t1.start();
		t2.start();
		t3.start();
		System.out.println("....Multithreading is over ");
	}
}
//So here we have created three threads using runnable interface i.e. class declaration of thread class