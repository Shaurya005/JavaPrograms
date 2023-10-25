package Avishkar;/*
Inside the standard package java.lang, Java defines several exception classes. The most general of these exceptions are subclasses
of the standard type RuntimeException. These exceptions need not be included in any method’s throws list. In the language of Java, these are called
unchecked exceptions because the compiler does not check to see if a method handles or throws these exceptions.
Those exceptions defined by java.lang that must be included in a method’s throws list if that method can generate one of these exceptions and does
not handle it itself. These are called checked exceptions. Examples are -

ClassNotFoundException
CloneNotSupportedException
IllegalAccessException
InstantiationException
InterruptedException
NoSuchFieldException
NoSuchMethodException

The Java throw keyword is used to explicitly throw an exception. We can throw either checked or unchecked exception in java by throw keyword.
The throw keyword is mainly used to throw custom exception.

The syntax of java throw keyword is given below.
throw Instance;

Let's see the example of throw IOException.
throw new IOException("sorry device error");

But this exception i.e, Instance must be of type Throwable or a subclass of Throwable.
For example Exception is a sub-class of Throwable and user defined exceptions typically extend Exception class.

The flow of execution of the program stops immediately after the throw statement is executed and the nearest enclosing try block is checked
to see if it has a catch statement that matches the type of exception.
If it finds a match, controlled is transferred to that statement otherwise next enclosing try block is checked and so on.
If no matching catch is found then the default exception handler will halt the program.
 */

class ThrowClass
{
    static void fun()
    {
        try
        {
        throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            // Another way of throwing exception explicitely
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[])
    {
        try
        {
        	fun();
        }
        catch(NullPointerException e)
        { System.out.println("Caught in main."); }
    }
}
/*
Output:

Caught inside fun().
Caught in main.
 */

// If the age is less than 18, we are throwing the ArithmeticException otherwise print a message welcome to vote.
/*
public class ThrowClass {
	static void validate(int age) {
		try {
			if (age < 18)
				throw new ArrayIndexOutOfBoundsException("Don't enter the age less than 18 please");
			else
				System.out.println("welcome to vote");
		}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception is there sir");
	}
}
	public static void main(String args[]){
		validate(13);
		System.out.println("rest of the code...");
	}
}
*/