package DataStructures;/*
        Initialize a list in a single line with a specified value. Given a value N, the task is to create a List having this value N in a single line in Java using Collection Framework only.

		Examples:
		Input: N = 5
		Output: [5]

		Input: N = GeeksForGeeks
		Output: [GeeksForGeeks]

		Approach:
		Get the value N
		Generate a Collection with a single value N using Collections.nCopies() method
		Store this collection as a List.
*/
//Java program to initialize a list in a single line with a specified value using Collection Framework only

import java.util.*;
import java.util.List;

class Initialize_List_In_Single_Line {
	// Function to create a List with the specified value
	public static <T> List <T> createList(T N)
	{
		// Currently only one value is taken
		int size = 1;
		// Generate a Collection with a single value N
		List<T> list = Collections.nCopies(size, N);
		return list;
	}

	public static void main(String[] args)
	{
		int N = 1024;
		System.out.println("List with element " + N + ": " + createList(N));
		String str = "GeeksForGeeks";
		System.out.println("List with element " + str + ": " + createList(str));
	}
}