// Create a second thread by extending Thread
class NewThread2 extends Thread {
	NewThread2() {
    // Create a new, second thread
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start(); // Start the thread
	}
	// This is the entry point for the second thread.
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
class ThreadUsingExtendThread {
	public static void main(String args[]) {
		new NewThread2(); // create a new thread
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}
/*
        This program generates the same output as the preceding version. As you can see, the child
		thread is created by instantiating an object of NewThread, which is derived from Thread.
		Notice the call to super( ) inside NewThread. This invokes the following form of the

		Thread constructor:
        public Thread(String threadName)
		Here, threadName specifies the name of the thread.
*/