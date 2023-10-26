/*When you use multiple catch statements, it is important to remember that exception subclasses must come before any of their superclasses.
This is because a catch statement that uses a superclass will catch exceptions of that type plus any of its subclasses. Thus, a subclass would
never be reached if it came after its superclass. Further, in Java, unreachable code is an error. For example, consider the following program:

This program contains an error.
A subclass must come before its superclass in a series of catch statements.
If not, unreachable code will be created and a compile-time error will result.
*/
/* Program has compile time error.
class SuperSubCatch {
	public static void main(String args[]) {
		try {
			int a = 0;
			int b = 42 / a;
		} catch(Exception e) {
			System.out.println("Generic Exception catch.");
		}
//This catch is never reached because ArithmeticException is a subclass of Exception.
		catch(ArithmeticException e) { // ERROR - unreachable
			System.out.println("This is never reached.");
		}
	}
}
*/
/*	If you try to compile this program, you will receive an error message stating that the
		second catch statement is unreachable because the exception has already been caught. Since
		ArithmeticException is a subclass of Exception, the first catch statement will handle all
		Exception-based errors, including ArithmeticException. This means that the second catch
		statement will never execute. To fix the problem, reverse the order of the catch statement. */
