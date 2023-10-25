package Avishkar;//Use of throws clause in exception handling
//A throws clause can throw exceptions explicitly and those exceptions then can be caught in try catch block.
import java.lang.*;
public class UsingThrows{
	public static void main(String args[])throws Exception
	{
		int [ ]array=new int[3];
		try{
			for(int i=0;i<4;++i)
				array[i]=i;//For i=3 there will be ArrayIndexOutOfBoundsException
			System.out.println(array);
		}
		catch(ArrayIndexOutOfBoundsException e){
			//So this catch catches the ArrayIndexOutOfBoundException and for that exception, it'll give all the complete/detail information
			// about the exception that occurred here via different methods in Exception class of java.lang.throwable package.
			//Different methods in exception class is invoked here.
			System.out.println("filIn: "+e.fillInStackTrace());
			System.out.println("cause: "+e.getCause());
			System.out.println("local: "+e.getLocalizedMessage());
			System.out.println("message: "+e.getMessage());
			System.out.println("trace: ");e.getStackTrace();
			System.out.println();
			System.out.println();
			System.out.println("trace: ");e.printStackTrace();
			System.out.println();
			System.out.println("string: ");e.toString();
			System.out.println();
			System.out.println();
			//It is basically the implication of exception class in java.lang.throwable package.
			//printed just to inform that we have entered the catch block
			System.out.println("Oops, we went too far, better go back to 0!");
			//throw (Exception) new Exception().initCause(e);
			//Within this catch block we include the throw statement, it basically throw the exception to the caller
		}
		finally{
			System.out.println(array);
			//method call to continue program
		}
	}
}