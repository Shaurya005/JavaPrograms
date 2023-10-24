package TestAndLearn;/*
Iterators are used in the Collection framework in Java to retrieve elements one by one. There are three iterators in Java -

Enumeration
Iterator
ListIterator

1. Enumeration
It is an interface used to get elements of legacy collections(Vector, Hashtable). Enumerations are also used to specify the input streams to a SequenceInputStream.
We can create an Enumeration object by calling elements() method of vector class on any vector object.

// Here "v" is an Vector class object. e is of type Enumeration interface and refers to "v"
Enumeration e = v.elements();

There are two methods in the Enumeration interface namely :

// Tests if this enumeration contains more elements
public boolean hasMoreElements();

// Returns the next element of this enumeration  It throws NoSuchElementException if no more element present
public Object nextElement();
 */
import java.util.*;

public class JavaIterators
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		for (int i = 0; i < 10; i++)
			v.addElement(i);
		System.out.println(v);
		Enumeration e = v.elements(); // At beginning e(cursor) will point to index just before the first element in v
		while (e.hasMoreElements()) // Checking the next element availability where condition holds true till if there is a single element remaining in the List
		{
			int i = (Integer)e.nextElement();
			System.out.print(i + " ");
		}
/*
	There are certain limitations of enumeration which are as follows:

	Enumeration is for legacy classes(Vector, Hashtable) only. Hence it is not a universal iterator.
	Remove operations can’t be performed using Enumeration.
	Only forward direction iterating is possible.

Iterator - It is a universal iterator as we can apply it to any Collection object. By using Iterator, we can perform both read and remove operations.
It is an improved version of Enumeration with the additional functionality of remove-ability of an element. Iterator must be used whenever we want to enumerate elements
in all Collection framework implemented interfaces like Set, List, Queue, Deque, and also in all implemented classes of Map interface.
Iterator is the only cursor available for the entire collection framework. Iterator object can be created by calling iterator() method present in Collection interface.

Syntax: Iterator itr = c.iterator(); Note: Here “c” is any Collection object. itr is of type Iterator interface and refers to “c”.

Iterator interface defines three methods as listed below:

1. public boolean hasNext(); Returns true if the iteration has more elements
2. public Object next(); Returns the next element in the iteration. It throws NoSuchElementException if no more element present
3. public void remove(); Remove the next element in the iteration. This method can be called only once per call to next()

Note: remove() method can throw two exceptions namely as follows:

UnsupportedOperationException : If the remove operation is not supported by this iterator
IllegalStateException : If the next method has not yet been called, or the remove method has already been called after the last call to the next method.
*/
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			al.add(i);
		System.out.println(al);

		Iterator itr = al.iterator(); // At the beginning itr(cursor) will point to index just before the first element in al

		// Checking the next element  where condition holds true till there is single element in the List using hasnext() method
		while (itr.hasNext()) {
			int i = (Integer)itr.next();
			System.out.print(i + " "); // Getting even elements one by one
			if (i % 2 != 0) // Removing odd elements
				itr.remove();
		}
		System.out.println();
		System.out.println(al);
/*
		Also, there are certain limitations of Iterator which are listed as follows:

		Only forward direction iterating is possible.
		Replacement and addition of new element is not supported by Iterator.

		3. ListIterator
		It is only applicable for List collection implemented classes like ArrayList, LinkedList, etc. It provides bi-directional iteration. ListIterator must be used when we want to
		enumerate elements of List. This cursor has more functionality(methods) than iterator. ListIterator object can be created by calling listIterator() method present in the List interface.


		ListIterator ltr = l.listIterator();
		Note: Here “l” is any List object, ltr is of type. ListIterator interface and refers to “l”. ListIterator interface extends the Iterator interface. So all three methods of Iterator interface are available for ListIterator. In addition, there are six more methods.

		1. Forward direction

		1.1 Returns true if the iteration has more elements
		public boolean hasNext();

		1.2 Same as next() method of Iterator
		public Object next();

		1.3 Returns the next element index or list size if the list iterator is at the end of the list.
		public int nextIndex();

		2. Backward direction

		2.1 Returns true if the iteration has more elements while traversing backward.
		public boolean hasPrevious();

		2.2 Returns the previous element in the iteration and can throw NoSuchElementException if no more element present.
		public Object previous();

		2.3 Returns the previous element index or -1 if the list iterator is at the beginning of the list
		public int previousIndex();

		3. Other Methods

		3.1 Same as remove() method of Iterator
		public void remove();

		3.2 Replaces the last element returned by next() or previous() with the specified element.
		public void set(Object obj);

		3.3 Inserts the specified element into the list at the position before the element that would be returned by next()
		public void add(Object obj);

		Clearly, the three methods that ListIterator inherits from Iterator (hasNext(), next(), and remove()) do exactly the same thing in both interfaces. The hasPrevious() and the previous operations are exact analogues of hasNext() and next(). The former operations refer to the element before the (implicit) cursor, whereas the latter refers to the element after the cursor. The previous operation moves the cursor backward, whereas the next moves it forward.
		ListIterator has no current element; its cursor position always lies between the element that would be returned by a call to previous() and the element that would be returned by a call to next().

		1. set() method can throw 4 exceptions.

		UnsupportedOperationException: if the set operation is not supported by this list iterator
		ClassCastException: If the class of the specified element prevents it from being added to this list
		IllegalArgumentException: If some aspect of the specified element prevents it from being added to this list
		IllegalStateException: If neither next nor previous have been called, or remove or add have been called after the last call to next or previous

		2. add() method can throw 3 exceptions.

		UnsupportedOperationException: If the add method is not supported by this list iterator
		ClassCastException: If the class of the specified element prevents it from being added to this list
		IllegalArgumentException: If some aspect of this element prevents it from being added to this list
			*/
		// At beginning ltr(cursor) will point to index just before the first element in al
		ListIterator ltr = al.listIterator();

		while (ltr.hasNext()) {
			int i = (Integer)ltr.next();

			// Getting even elements one by one
			System.out.print(i + " ");

			// Changing even numbers to odd and adding modified number again in iterator
			if (i % 2 == 0) {
				// Change to odd
				i++;
				// Set method to change value
				ltr.set(i);
				// To add
				ltr.add(i);
			}
		}
		System.out.println();
		System.out.println(al);
		/*
		Note: Similarly, there are certain limitations with ListIterator. It is the most powerful iterator but it is only applicable for List implemented classes, so it is not a universal iterator.

		Important Points
		Please note that initially, any iterator reference will point to the index just before the index of the first element in a collection.
		We don’t create objects of Enumeration, Iterator, ListIterator because they are interfaces. We use methods like elements(), iterator(), listIterator() to create objects.
		These methods have an anonymous Inner Class that extends respective interfaces and return this class object. This can be verified by the below code.
		 */

		// Creating three iterators
		Enumeration e2 = v.elements();
		Iterator itr2 = v.iterator();
		ListIterator ltr3 = v.listIterator();

		// Print class names of iterators using getClass() and getName() methods
		System.out.println(e2.getClass().getName());
		System.out.println(itr2.getClass().getName());
		System.out.println(ltr3.getClass().getName());
		/*
		Output
		java.util.Vector$1
		java.util.Vector$Itr
		java.util.Vector$ListItr

		Note: The $ symbol in reference class name is a proof that concept of inner classes is used and these class objects are created.
		 */
	}
}