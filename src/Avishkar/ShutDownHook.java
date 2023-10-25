package Avishkar;/*
Shutdown Hooks are a special construct that allows developers to plug in a piece of code to be executed when the JVM is shutting down.
A shutdown hook is simply an initialized but unstarted thread. This comes in handy in cases where we need to do special clean up operations in case the VM is shutting down.

All we have to do is simply write a class which extends the Thread class, and provide the logic that we want to perform when the VM is shutting down, inside the run() method.
Then we register an instance of this class as a shutdown hook to the VM by calling Runtime.getRuntime().addShutdownHook(Thread) method.
If you need to remove a previously registered shutdown hook, the Runtime class provides the removeShutdownHook(Thread) method as well.
 */
/*
public class ShutDownHook {
	// a class that extends thread that is to be called when program is exiting.
	 static class Message extends Thread {
		public void run() {
			System.out.println("Bye.");
		}
	}
	public static void main(String[] args) {
		try {
			// register Message as shutdown hook
			Runtime.getRuntime().addShutdownHook(new Message());
			// print the state of the program
			System.out.println("Program is starting...");
			// cause thread to sleep for 3 seconds
			System.out.println("Waiting for 3 seconds...");
			Thread.sleep(3000);
			// print that the program is closing
			System.out.println("Program is closing...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
*/

public class ShutDownHook
{
  public static void main(String[] args)
  {

    Runtime.getRuntime().addShutdownHook(new Thread()
    {
      public void run()
      {
        System.out.println("Shutdown Hook is running !");
      }
    });
    for(int i = 1; i <= 10; i++)
            System.out.println("2 X " + i + " = " + 2 * i);
    System.out.println("Application Terminating ...");
  }
}
