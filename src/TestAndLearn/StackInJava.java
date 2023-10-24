package TestAndLearn;

import java.util.*;
import java.util.Stack;
public class StackInJava
{
	public static void main(String args[])
	{
		// Creating an object of Stack class
		Stack <Integer> stk = new Stack<>();
		// Stack <Integer> stk = new Stack<Integer>(); It also works fine
		System.out.println("stack: " + stk);
		// Here if we push item of any other data type then it'll show error as we have explicitly mentioned <Integer> there.
		pushelmnt(stk, 20);
		pushelmnt(stk, 13);
		pushelmnt(stk, 89);
		pushelmnt(stk, 90);
		pushelmnt(stk, 11);
		pushelmnt(stk, 45);
		pushelmnt(stk, 18);

		popelmnt(stk);
		popelmnt(stk);
		//throws exception if the stack is empty
		try { popelmnt(stk); }
		catch (EmptyStackException e) { System.out.println("empty stack"); }

		Stack<String> stk2= new Stack<>();
		stk2.push("Apple");
		stk2.push("Grapes");
		stk2.push("Mango");
		stk2.push("Orange");
		System.out.println("Stack: " + stk2);

		String fruits = stk2.peek();
		System.out.println("Element at top: " + fruits);
		// Search an element
		int location = stk2.search("Mango");
		System.out.println("Location of Mango: " + location);
		boolean rslt=stk.empty();
		System.out.println("Is the stack empty or not? " +rslt);
		int x=stk.size();
		System.out.println("The stack size is: "+x);
	}

	static void pushelmnt(Stack stk, int x)
	{
		stk.push(new Integer(x));
		// stk.push(x); We can also do it directly like this.
// stk.push('h'); Here if we push item of any other data type then it'll not show error because here in this function we haven't explicitly mention stk as <Integer>.
		System.out.println("push -> " + x);
		System.out.println("stack: " + stk);
	}

	static void popelmnt(Stack stk)
	{
		System.out.print("pop -> ");
		int x=(int)stk.pop();
		int x2=(Integer) stk.pop();
		Integer x3=(Integer) stk.pop();
		// Actually pop function returns Object that is it can be converted into any class type.
		System.out.println(x);
		System.out.println("stack: " + stk);
	}
}