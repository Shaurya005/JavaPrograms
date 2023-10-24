package TestAndLearn;/*
Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.

Hierarchy of LinkedList class
Java LinkedList class extends AbstractSequentialList class and implements List and Deque interfaces.

Doubly Linked List
In the case of a doubly linked list, we can add or remove elements from both sides.
 */
import java.util.*;
import java.util.LinkedList;

public class ListInJava {
	public static void main(String[] args) {
		//Java LinkedList example to add elements

		LinkedList list=new LinkedList();
		list.add(7);
		list.add("g");
		list.addFirst(5.5);
		list.addLast("dsgd");
		System.out.println(list);

		LinkedList<String> ll=new LinkedList<String>();
		// LinkedList ll=new LinkedList(); It'll also act fine without specifying <string> but in that case values of different data type can also be added to the list.
		System.out.println("Initial list of elements: "+ll);
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		System.out.println("After invoking add(E e) method: "+ll);
		ll.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: "+ll);
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Sonoo");
		ll2.add("Hanumat");

		ll.addAll(ll2); //Adding second list elements to the first list
		System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);
		LinkedList<String> ll3=new LinkedList<String>();
		ll3.add("John");
		ll3.add("Rahul");

		ll.addAll(1, ll3); //Adding second list elements to the first list at specific position
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);
		ll.addFirst("Lokesh");
		System.out.println("After invoking addFirst(E e) method: "+ll);
		ll.addLast("Harsh");
		System.out.println("After invoking addLast(E e) method: "+ll);

		// Java LinkedList example to remove elements
		LinkedList<String> l = new LinkedList<String>();

		l.add("Ravi");       l.add("Vijay");
		l.add("Ajay");        l.add("Anuj");
		l.add("Gaurav");  l.add("Harsh");
		l.add("Virat");       l.add("Gaurav");
		l.add("Harsh");     l.add("Amit");
		Iterator itr = l.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("Initial list of elements: " + l);
		l.remove("Vijay"); //Removing specific element from arraylist
		System.out.println("After invoking remove(object) method: " + ll);
		l.remove(0); //Removing element on the basis of specific position
		System.out.println("After invoking remove(index) method: " + ll);
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Ravi");
		l2.add("Hanumat");

		l.addAll(l2); // Adding new elements to arraylist
		System.out.println("Updated list : " + l);
		l.removeAll(l2); //Removing all the new elements from arraylist
		System.out.println("After invoking removeAll() method: " + l);
		l.removeFirst();
		System.out.println("After invoking removeFirst() method: " + l);
		l.removeLast();
		System.out.println("After invoking removeLast() method: " + l);
		l.removeFirstOccurrence("Gaurav"); //Removing first occurrence of element from the list
		System.out.println("After invoking removeFirstOccurrence() method: " + l);
		l.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method: " + l);
		l.clear(); //Removing all the elements available in the list
		System.out.println("After invoking clear() method: " + l);

		//Java LinkedList Example to reverse a list of elements
		//Traversing the list of elements in reverse order
		Iterator i=ll.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
