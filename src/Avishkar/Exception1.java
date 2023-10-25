package Avishkar;

/*
An exception is an abnormal condition that arises in a code sequence at run time. In other words, an exception is a run-time error.
A Java exception is an object that describes an exceptional (that is, error) condition that has occurred in a piece of code.
When an exceptional condition arises, an object representing that exception is created and thrown in the method that caused the error.

Java exception handling is managed via five keywords: try, catch, throw, throws, and finally. Program statements that you want to
monitor for exceptions are contained within a try block. If an exception occurs within the try block, it is thrown.
Your code can catch this exception (using catch) and handle it in some rational manner. System-generated exceptions are automatically
thrown by the Java run-time system. To manually throw an exception, use the keyword throw. Any exception that is thrown out of a method
must be specified as such by a throws clause. Any code that must be executed after a try block completes is put in a finally block.

This is the general form of an exception-handling block:

try {
// block of code to monitor for errors
}
catch (ExceptionType1 exOb) {
// exception handler for ExceptionType1
}
catch (ExceptionType2 exOb) {
// exception handler for ExceptionType2
}
// ...
finally {
// block of code to be executed after try block ends
}

									                                                        EXCEPTION TYPES

All exception types are subclasses of the built-in class Throwable. Thus, Throwable is at the top of the exception class hierarchy.
Immediately below Throwable are two subclasses that partition exceptions into two distinct branches. One branch is headed by Exception.
This class is used for exceptional conditions that user programs should catch. This is also the class that you will subclass to
create your own custom exception types. There is an important subclass of Exception, called RuntimeException. Exceptions of this type
are automatically defined for the programs that you write and include things such as division by zero and invalid array indexing.

The other branch is topped by Error, which defines exceptions that are not expected to be caught under normal circumstances by your program.
Exceptions of type Error are used by the Java run-time system to indicate errors having to do with the run-time environment, itself.
Stack overflow is an example of such an error. This chapter will not be dealing with exceptions of type Error, because these are typically created
in response to catastrophic failures that cannot usually be handled by your program.

Let's see what happens when you don’t handle exceptions. This small program includes an expression that intentionally causes a divide-by-zero error:

class Demo {
	public static void main(String args[]) {
		int d = 0;
		int a = 42 / d;
		}
}

When the Java run-time system detects the attempt to divide by zero, it constructs a new exception object and then throws this exception.
This causes the execution of Demo to stop, because once an exception has been thrown, it must be caught by an exception handler and dealt with immediately.
In this example, we haven’t supplied any exception handlers of our own, so the exception is caught by the default handler provided by the Java run-time system.
Any exception that is not caught by your program will ultimately be processed by the default handler. The default handler displays a string describing the exception,
prints a stack trace from the point at which the exception occurred, and terminates the program.

The exception generated when this example is executed:

java.lang.ArithmeticException: / by zero
at Exc0.main(Exc0.java:4)

Notice that the type of exception thrown is a subclass of Exception called ArithmeticException, which more specifically describes what type of error happened.
Java supplies several built-in exception types that match the various sorts of run-time errors that can be generated.


																	USING TRY AND CATCH
Although the default exception handler provided by the Java run-time system is useful for debugging, you will usually want to handle an exception yourself.
Doing so provides two benefits. First, it allows you to fix the error. Second, it prevents the program from automatically terminating.
To guard against and handle a run-time error, simply enclose the code that you want to monitor inside a try block.
Immediately following the try block, include a catch clause that specifies the exception type that you wish to catch.

The following program includes a try block and a catch clause that processes the ArithmeticException generated by the division-by-zero error:

class Exc2 {
public static void main(String args[]) {
int d, a;
try { // monitor a block of code.
d = 0;
a = 42 / d;
System.out.println("This will not be printed.");
} catch (ArithmeticException e) { // catch divide-by-zero error
System.out.println("Division by zero.");
}
System.out.println("After catch statement.");
}
}
This program generates the following output:
Division by zero.
After catch statement

Notice that the call to println( ) inside the try block is never executed. Once an exception is thrown, program control transfers out of the try block into the catch block.
Once the catch statement has executed, program control continues with the next line in the program following the entire try/catch mechanism.
A try and its catch statement form a unit. The scope of the catch clause is restricted to those statements specified by the immediately preceding try statement.
A catch statement cannot catch an exception thrown by another try statement (except in the case of nested try statements)
 */
/*
   public class Exception1{
   static int anyFunction(int x,int y){
   int a=x/y;//Scope of exception if second argument is 0.
   return a;
   }
   public static void main(String args[]){
   int a,b,result;
   a=0;b=0;
   a=Integer.parseInt(args[0]);//Possibilities of Exception if non integer parameter is passed or no argument is passed
   b=Integer.parseInt(args[1]);//Possibilities of Exception if non integer parameter is passed or only one integer argument is passed
   result=anyFunction(a,b);
   System.out.println("Result: "+result);
   }
   }
Note:
Run this program with the following input:
1 2        //No error
10 0      //ArithmeticException: / by zero
45 5      //It will run successfully.
4.6 9     //NumberFormatException
9           //ArrayIndexOutOfBoundsException
So, this is not so robust program so we use simple try catch to handle exception
*/
public class Exception1{
	static int anyFunction(int x,int y){
		try{
			int a=x/y;
			return a;
		}
		catch(ArithmeticException e){
			System.out.println("Division By Zero");}
		return 0; }
	public static void main(String args[]){
		int a,b,result;
		String s[]=new String[0];
		a=0;b=0;
		try{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			System.out.println("Value of a and b is :"+a+" "+b);
		}
		catch(Exception e){}
		result=anyFunction(a,b);
		System.out.println("\nResult: "+result);
	}
}
//Now this program will run for whatever inputs. In this exception is caught and handled successfully.