package Avishkar;

/*   Synchronized Block in Java:-

Synchronized block can be used to perform synchronization on any specific resource of the method. Suppose you have 50 lines of code in your method, but you want
to synchronize only 5 lines, you can use synchronized block. If you put all the codes of the method in the synchronized block, it will work same as the synchronized method.

Points to remember for Synchronized block

	Synchronized block is used to lock an object for any shared resource.
	Scope of synchronized block is smaller than the method.
	Syntax to use synchronized block

        synchronized (object reference expression) {
		//code block
		}
*/
class Table2{
	void printTable(int n){
		synchronized(this){//synchronized block
			for(int i=1;i<=5;i++){
				System.out.println(n*i);
				try{
					Thread.sleep(400);
				}catch(Exception e){System.out.println(e);}
			}
		}
	}//end of the method
}

class MyThread1 extends Thread{
	Table2 t;
	MyThread1(Table2 t){
		this.t=t;
	}
	public void run(){
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	Table2 t;
	MyThread2(Table2 t){
		this.t=t;
	}
	public void run(){
		t.printTable(100);
	}
}

public class SynchronizedBlock{
	public static void main(String args[]){
		Table2 obj = new Table2();//only one object
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();
	}
}