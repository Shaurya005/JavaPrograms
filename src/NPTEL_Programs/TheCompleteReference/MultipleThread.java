package NPTEL_Programs.TheCompleteReference;

// Create multiple threads.
class NewThread3 implements Runnable {
	String name; // name of thread
	Thread t;
	NewThread3(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start(); // Start the thread
	}
	// This is the entry point for thread.
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
class MultipleThread {
	public static void main(String args[]) {
		new NewThread3("One"); // start threads
		new NewThread3("Two");
		new NewThread3("Three");
		try {
			Thread.sleep(10000); // wait for other threads to end
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}