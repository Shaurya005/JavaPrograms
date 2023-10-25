package Avishkar;

/*      Although Java’s built-in exceptions handle most common errors, you will probably want to create your own exception types to handle situations specific to your applications.
        This is quite easy to do: just define a subclass of Exception.
        Your subclasses don’t need to actually implement anything—it is their existence in the type system that allows you to use them as exceptions.
		The Exception class does not define any methods of its own. It does, of course, inherit those methods provided by Throwable.
		Thus, all exceptions, including those that you create, have the methods defined by Throwable available to them.

		Exception defines four constructors. Two were added by JDK 1.4 to support chained exceptions. The other two are:
       Exception( )
       Exception(String msg)

The first form creates an exception that has no description. The second form lets you specify a description of the exception.
Although specifying a description when an exception is created is often useful, sometimes it is better to override toString( ).
It's so because the version of toString( ) defined by Throwable (and inherited by Exception) first displays the name of the exception followed by a colon, which
is then followed by your description. By overriding toString( ), you can prevent the exception name and colon from being displayed.
This makes for a cleaner output, which is desirable in some cases.
The following example declares a new subclass of Exception and then uses that subclass to signal an error condition in a method. It overrides the toString( ) method,
*/
// This program creates a custom exception type.
class MyException extends Exception {
	private int detail;
	MyException(int a) {
		detail = a;
	}
	// Here we are overriding the toString method of Throwable class.
	public String toString() {
		return "MyException[" + detail + "]"; // You can change it.
	}
}
class CustomExceptions {
	static void compute(int a) throws MyException
	{
		System.out.println("Called compute(" + a + ")");
		if(a > 10)
			throw new MyException(a);
		System.out.println("Normal exit");
	}
	public static void main(String args[]) {
		try {
			compute(1);
			compute(20);
		} catch (MyException e) {
			System.out.println("Caught " + e);
		}
	}
}
/*	This example defines a subclass of Exception called MyException. This subclass is quite simple: it has only a constructor plus an overloaded toString( )
method that displays the value of the exception. The ExceptionDemo class defines a method named compute( ) that throws a MyException object.
The exception is thrown when compute( )’s integer parameter is greater than 10. The main( ) method sets up an exception handler for MyException, then
calls compute( ) with a legal value (less than 10) and an illegal one to show both paths through the code.
*/