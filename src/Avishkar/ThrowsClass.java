package Avishkar;/*
If a method is capable of causing an exception that it does not handle, it must specify this behavior so that callers of the method can guard themselves against that exception.
We do this by including a throws clause in the method’s declaration. The caller to these methods has to handle the exception using a try-catch block.
A throws clause lists the types of exceptions that a method might throw. This is necessary for all exceptions, except those of type Error or RuntimeException,
or any of their subclasses. All other exceptions that a method can throw must be declared in the throws clause. If they are not, a compile-time error will result.

This is the general form of a method declaration that includes a throws clause:

type method-name(parameter-list) throws exception-list
{
// body of method
}
Here, exception-list is a comma-separated list of the exceptions that a method can throw.

In a program, if there is a chance of raising an exception then compiler always warn us about it and compulsorily we should handle that checked exception,
Otherwise we will get compile time error saying unreported exception XXX must be caught or declared to be thrown.

To prevent this compile time error we can handle the exception in two ways:

By using try catch
By using throws keyword

We can use throws keyword to delegate the responsibility of exception handling to the caller
(It may be a method or JVM) then caller method is responsible to handle that exception.

Java program to illustrate error in case of unhandled exception

class tst
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println("Hello Java");
	}
}

Output:

error: unreported exception InterruptedException; must be caught or declared to be thrown

Explanation: In the above program, we are getting compile time error because there is a chance of exception if the main thread is going to sleep,
other threads get the chance to execute main() method which will cause InterruptedException.

public class tst {
	// Java program to illustrate throws
		public static void main(String[] args)throws InterruptedException
		{
			Thread.sleep(10000);
			System.out.println("Hello Java");
		}
}
Explanation: In the above program, by using throws keyword we handled the InterruptedException and we will get the output as Hello Java.

*/

// Java program to demonstrate working of throws
class ThrowsClass
{
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught in main.");
		}
	}
}
/*
Important points to remember about throws keyword:

throws keyword is required only for checked exception and usage of throws keyword for unchecked exception is meaningless.
throws keyword is required only to convince compiler and usage of throws keyword does not prevent abnormal termination of program.
By the help of throws keyword we can provide information to the caller of the method about the exception.
*/