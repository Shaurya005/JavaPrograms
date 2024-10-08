package DataStructures;/*
Conversion of Postfix expression directly to Prefix without going through the process of converting them first to Infix and then to Prefix is much
better in terms of computation and better understanding the expression (Computers evaluate using Postfix expression).

 Algorithm for Postfix to Prefix:

		Read the Postfix expression from left to right
		If the symbol is an operand, then push it onto the Stack

		If the symbol is an operator, then pop two operands from the Stack
		Create a string by concatenating the two operands and the operator before them.
		string = operator + operand2 + operand1
		And push the resultant string back to Stack

		Repeat the above steps until end of Prefix expression.
*/
		import java.util.*;

class PostfixToPrefix {
	// function to check if character is operator or not
	static boolean isOperator(char x)
	{
		switch (x) {
			case '+':
			case '-':
			case '/':
			case '*':
				return true;
		}
		return false;
	}
	// Convert postfix to Prefix expression
	static String postToPre(String post_exp)
	{
		Stack<String> s = new Stack<String>();
		int length = post_exp.length();
		// reading from right to left
		for (int i = 0; i < length; i++) {
			// check if symbol is operator
			if (isOperator(post_exp.charAt(i))) {
				// pop two operands from stack
				String op1 = s.peek();
				s.pop();
				String op2 = s.peek();
				s.pop();
				// concat the operands and operator
				String temp = post_exp.charAt(i) + op2 + op1;
				s.push(temp);
			}
			// if symbol is an operand
			else {
				// push the operand to the stack
				s.push(post_exp.charAt(i) + "");
			}
		}
		// concatenate all strings in stack and return the answer
		String ans = "";
		for (String i : s)
			ans += i;
		return ans;
	}
	public static void main(String args[])
	{
		String post_exp = "ABC/-AK/L-*";
		System.out.println("Prefix : " + postToPre(post_exp));
	}
}