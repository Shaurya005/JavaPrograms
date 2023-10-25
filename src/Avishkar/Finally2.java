package Avishkar;/*
public class Finally2 {    // Here exception doesn't occur and finally block executed.
	public static void main(String args[]){
		try{
			int data=25/5;
			System.out.println(data);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("Rest of the code");
	}
}


public class Finally2 {    //Here exception occur but not handled and finally block executed.
	public static void main(String args[]){
		try{
			int data=25/0;
			System.out.println(data);
		}
		catch(ArrayIndexOutOfBoundsException e){
		// It will not handle the exception thrown by above try block because it will handle only Array IOB Exception and not any other exception like Arithmetic exception.
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("Rest of the code");
	}
}
 */

public class Finally2 {    //Here exception occur as well as handled and finally block executed.
	public static void main(String args[]){
		try{
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("Rest of the code");
	}
}
/*
For each try block there can be zero or more catch blocks, but only one finally block.
The Finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort().
 */