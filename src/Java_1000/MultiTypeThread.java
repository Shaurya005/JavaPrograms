public class MultiTypeThread extends Thread implements Runnable {

	public void run(){
		System.out.printf("Inside run");
	}

	public static void main(String a[]){
		MultiTypeThread t = new MultiTypeThread();
		t.start();

		Thread t1 = new Thread(new MultiTypeThread());
		t1.start();
	}
}