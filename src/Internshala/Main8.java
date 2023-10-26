package Internshala;

public class Main8 {
	public static void main(String args[]) {
		//Exception Handling --> Handles runtime errors
		//                   --> Normal flow of program continues
		//                   --> Prevents application from being crashed
		System.out.println("Program Starts");//Executed
		int[] a = {2, 44, 67, 23, 6};
		try {
			System.out.println(a[28]);//Exception Occurred though compiled
		} catch (ArrayIndexOutOfBoundsException exception)//exception is simply an identifier
		{
			//Your Code....Optional
			System.out.println("Exception Found");
		} finally {
			//Your code....Optional
			System.out.println("It is always executed");//No matter exception is there or not
		}
		try {
			int result = a[1] / 0;   //ArithmeticException
			System.out.println(a[28]);//Exception Occurred though compiled
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException exception)//exception is simply an identifier
		//catch(Exception exception) //It also works but approach isn't good if we know the name of exception
		{
			//Your Code....Optional
			System.out.println("Exception Found");
		}
		//So here though we are getting exception in between but our program is being executed until last so our exception is handled
		try {
			String s = null;//Null means no object in java i.e. no valid object is being created in the heap memory
            //String is a class and s is reference variable
			System.out.println(s.length());
		} catch (Exception ex)//As here we don't know the exception name so use general Exception keyword
		{
			System.out.println("exceptionnnn");
		}
		System.out.println("Program Ends");
	}
	//Now if there is a case that code must be executed, no matter if there is error or not then use finally block
	//Three possible case, when we catch an exception we use try catch block i.e. try the code and then catch the exception
	//If more than one exception is there then use multiple catch block
	//Third case is what if we don't know the name of exception
}