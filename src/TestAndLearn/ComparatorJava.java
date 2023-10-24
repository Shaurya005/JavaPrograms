package TestAndLearn;/*
	A comparator interface is used to order the objects of user-defined classes. A comparator object is capable of comparing two objects of two different classes.
	Following function compare obj1 with obj2

	Syntax: public int compare(Object obj1, Object obj2):
	Suppose we have an Array/ArrayList of our own class type, containing fields like roll no, name, address, DOB, etc, and we need to sort the array based on Roll no or name?

	Method 1: One obvious approach is to write our own sort() function using one of the standard algorithms. This solution requires rewriting the whole sorting code for different criteria like Roll No. and Name.

	Method 2: Using comparator interface- Comparator interface is used to order the objects of a user-defined class. This interface is present in java.util package and contains 2 methods
	compare(Object obj1, Object obj2) and equals(Object element). Using a comparator, we can sort the elements based on data members. For instance, it may be on roll no, name, age, or anything else.

	Method of Collections class for sorting List elements is used to sort the elements of List by the given comparator.

	// To sort a given list. ComparatorClass must implement Comparator interface.
	public void sort(List list, ComparatorClass c)

	How does Collections.Sort() work?
	Internally the Sort method does call Compare method of the classes it is sorting. To compare two elements, it asks “Which is greater?”
	Compare method returns -1, 0, or 1 to say if it is less than, equal, or greater to the other. It uses this result to then determine if they should be swapped for their sort.
*/
// Java program to demonstrate working of Comparator interface
import java.lang.*;
import java.util.*;

class Student_ {
	int rollno;
	String name, address;

	public Student_(int rollno, String name, String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString()
	{
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class Sortbyroll implements Comparator<Student_> {
	// Used for sorting in ascending order of roll number
	public int compare(Student_ a, Student_ b)
	{
		return a.rollno - b.rollno;
	}
}

class Sortbyname implements Comparator<Student_> {
	// Used for sorting in ascending order of name
	public int compare(Student_ a, Student_ b)
	{
		return a.name.compareTo(b.name);
	}
}

public class ComparatorJava {
	public static void main(String[] args)
	{
		ArrayList<Student_> ar = new ArrayList<>();
		ar.add(new Student_(111, "bbbb", "london"));
		ar.add(new Student_(131, "aaaa", "nyc"));
		ar.add(new Student_(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyroll());

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyname());

		System.out.println("\nSorted by name");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		/*
		By changing the return value inside compare method, you can sort in any order that you wish to. Eg. for descending order just change positions of ‘a’ and ‘b’ in the above compare method.

		Sort collection by more than one field:

		In previous articles, we have discussed how to sort the list of objects on the basis of a single field using Comparable and Comparator interface But, what if we have a
		requirement to sort ArrayList objects in accordance with more than one fields like firstly, sort according to the student name and secondly, sort according to student age.
		Below is the implementation of the above approach:
		*/
	}
}
