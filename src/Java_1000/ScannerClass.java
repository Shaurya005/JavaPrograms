package Java_1000;/*There are several ways of using a Scanner throughout a program.
We show three implementations of a program that prompts the user for two integers and displays the results.
Method 1: A Scanner constant
Define a class constant:
public static final Scanner CONSOLE = new Scanner(System.in);
This can now be used anywhere in the class.

import java.util.*;
public class Scanner1 {
	public static final Scanner CONSOLE = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the first integer");
		int value1 = CONSOLE.nextInt();
		System.out.println("The first value was "+value1);
		showSecondValue("Enter the second integer");
	}

	public static void showSecondValue(String prompt) {
		System.out.println(prompt);
		int value2 = CONSOLE.nextInt();
		System.out.println("The second value was "+value2);
	}
}

Method 2: A Scanner variable used only in main
Declare a Scanner variable in main and do all input in main.
Pass values received to methods.
This is what was done in Project 1.

import java.util.*;
public class Scanner2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int value1 = console.nextInt();
		System.out.println("The first value was "+value1);
		System.out.println("Enter the second integer");
		int value2 = console.nextInt();
		showSecondValue(value2);
	}

	public static void showSecondValue(int value) {
		System.out.println("The second value was "+value);
	}
}

Method 3: A Scanner object passed as a parameter
Declare a Scanner variable in main as before, but allow methods to get keyboard input by passing that variable as a parameter.

   import java.util.*;
   public class Scanner3 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int value1 = console.nextInt();
		System.out.println("The first value was "+value1);
		showSecondValue("Enter the second integer", console);
	}

	public static void showSecondValue(String prompt, Scanner console) {
		System.out.println(prompt);
		int value2 = console.nextInt();
		System.out.println("The second value was "+value2);
	}
}
*/