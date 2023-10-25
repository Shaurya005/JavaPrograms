package Avishkar;//Example of synchronized method by using anonymous class. In this program, we have created the two threads by anonymous class, so less coding is required.
//Program of synchronized method by using anonymous class

class Table{
	synchronized void printTable(int n){//synchronized method
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			}catch(Exception e){ System.out.println(e); }
		}
	}
}

public class SynchronizedAnonymous{
	public static void main(String args[]){
		final Table obj = new Table(); //only one object

		Thread t1=new Thread(){
			public void run(){
				obj.printTable(5);
			}
		};
		Thread t2=new Thread(){
			public void run(){
				obj.printTable(100);
			}
		};
		t1.start();
		t2.start();
	}
}