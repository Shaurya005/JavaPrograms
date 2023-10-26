package DataStructures;/*
Given a list in Java, the task is to remove all the elements in the sublist whose index is b/w fromIndex, inclusive, and toIndex, exclusive. Range of the index is defined by the user.

Example:
Input list = [1, 2, 3, 4, 5, 6, 7, 8], fromIndex = 2, endIndex = 4
Output [1, 2, 5, 6, 7, 8]

Input list = [‘G’, ‘E’, ‘E’, ‘G’, ‘G’, ‘K’, ‘S’], fromIndex = 3, endIndex = 5
Output [‘G’, ‘E’, ‘E’, ‘K’, ‘S’]

Method 1: Using subList() and clear() method
Syntax: List.subList(int fromIndex, int toIndex).clear()
Java code to remove a subList using subList(a, b).clear() method
 */
import java.util.AbstractList;
import java.util.LinkedList;
public class DeleteSublist {
	public static void main(String args[])
	{
		// Creating an empty AbstractList
		AbstractList<String> list = new LinkedList<String>();
		list.add("GFG");
		list.add("for");
		list.add("Geeks");
		list.add("computer");
		list.add("portal");
		System.out.println("Original List: " + list);
		// subList and clear method to remove elements specified in the range
		list.subList(1, 3).clear();
		System.out.println("Final List: " + list);
	}
}
/*
// Java code to remove a subList using removeRange() method
import java.util.*;

// since removeRange() is a protected method ArrayList has to be extend the class
public class GFG extends ArrayList<Integer> {
    public static void main(String[] args)
    {
        // create an empty array list
        GFG arr = new GFG();
        // use add() method to add values in the list
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        // prints the list before removing
        System.out.println("Original List: " + arr);
        // removing elements in the list from index 2 to 4
        arr.removeRange(2, 4);
        System.out.println("Final List: " + arr);
    }
}
*/