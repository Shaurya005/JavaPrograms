package Avishkar;

/* Use of suspend() and resume() methods
   Any one method is running and you can call the suspend method that mean this thread will be not permanently stop,
   it will be temporarily withheld and the same method can be again revoked if we call the resume method.
*/
class Thread3 extends Thread{
	public void run(){
		try{
			System.out.println(" First thread starts running");
			sleep(10000);
			System.out.println(" First thread finishes running");
		}
		catch (Exception e){}
	}
}

class Thread4 extends Thread{
	public void run(){
		try{
			System.out.println(" Second thread starts running");
			System.out.println(" Second thread is suspended itself");
			suspend();
			System.out.println(" Second thread runs again");
		}
		catch (Exception e){}
	}
}

class SuspendAndResume{
	public static void main(String args[]){
		try{
			Thread3 first=new Thread3();//It is a newborn thread i.e. Newborn state
			Thread4 second=new Thread4();//another newborn thread

			first.start();//first is scheduled for running
			second.start();//second is scheduled for running

			System.out.println("Revive the second thread");//If it is suspended
			second.resume();

			System.out.println("Second thread went for 10 seconds sleep");
			second.sleep(10000);

			System.out.println("Wake up second thread and finishes running");
			System.out.println(" Demonstration is finished");
		}
		catch(Exception e){}
	}
}