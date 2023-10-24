package TestAndLearn;/*
We often come across 2D arrays where most of the part in the array is empty. Since space is a huge problem, we try different things to reduce the space.
One such solution is to use jagged array when we know the length of each row in the array,
but the problem arises when we do not specifically know the length of each of the rows. Here we use ArrayList since the length is unknown.
*/
// Java code to demonstrate the concept of array of ArrayList

import java.util.*;
public class ArrayOfArrayList {
	public static void main(String[] args)
	{
		int n = 5;
		// Here al is an array of arraylist having n number of rows.The number of columns on each row depends on the user.al[i].size() will give the size of the i'th row
		ArrayList<Integer>[] al = new ArrayList[n];
		// ArrayList<Integer> al[ ]  = new ArrayList[n]; It also works fine
		// If we would have written int in place of Integer then error shows "Type argument cannot be of primitive type".
		for (int i = 0; i < n; i++) {
			al[i] = new ArrayList<Integer>();
		}
		// We can add any number of columns to each rows as per our wish
		al[0].add(1);
		al[0].add(2);
		al[1].add(5);
		al[2].add(10);
		al[2].add(20);
		al[2].add(30);
		al[3].add(56);
		al[4].add(34);
		al[4].add(67);
		al[4].add(89);
		al[4].add(12);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < al[i].size(); j++)
				System.out.print(al[i].get(j) + " ");
			System.out.println();
		}
	}
}
/*
The above code works fine, but shows below warning.

prog.java:15: warning: [unchecked] unchecked conversion
        ArrayList[] al = new ArrayList[n];
                                  ^
  required: ArrayList[]
  found:    ArrayList[]
1 warning

The warning comes basically due to below line.
ArrayList<Integer>[] al = new ArrayList[n];

How to fix above warning? We cannot use array of ArrayList without warning. We basically need to use ArrayList of ArrayList.
 */