/*
 Any time a method is about to return to the caller from inside a try/catch block, via an uncaught exception or an explicit return statement,
 the finally clause is also executed just before the method returns. The finally clause is optional. However, each try statement requires at
least one catch or a finally clause.
Here is an example program that shows three methods that exit in various ways, none without executing their finally clauses.
 */
class Finally3 {
	// Through an exception out of the method.
	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("procA's finally");
		}
	}
	// Return from within a try block.
	static void procB() {
		try {
			System.out.println("inside procB");
			return;
		} finally {
			System.out.println("procB's finally");
		}
	}
	// Execute a try block normally.
	static void procC() {
		try {
			System.out.println("inside procC");
		} finally {
			System.out.println("procC's finally");
		}
	}
	public static void main(String args[]) {
		try {
			procA();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		procB();
		procC();
	}
}
/*      In this example, procA( ) prematurely breaks out of the try by throwing an exception. The finally clause is executed on the way out.
         procB( )’s try statement is exited via a return statement. The finally clause is executed before procB( ) returns.
        In procC( ), the try statement executes normally, without error. However, the finally block is still executed.
*/
