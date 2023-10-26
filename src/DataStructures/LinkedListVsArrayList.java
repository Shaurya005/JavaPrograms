package DataStructures;/*
ArrayList and LinkedList both implements List interface, maintains insertion order and their methods and results are almost identical. Both are non synchronized classes.
However, there are many differences between ArrayList and LinkedList classes which make one better over another depending on the requirement.

										ArrayList	                                                                                                                             LinkedList
1) ArrayList internally uses a dynamic array to store the elements.             	           LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array.	           Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
     If any element is removed from the array, all the bits are shifted in memory.
3) An ArrayList class can act as a list only because it implements List only.	       LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.	                                               LinkedList is better for manipulating data.

ArrayList Vs LinkedList
1) Search: ArrayList search operation is pretty fast compared to the LinkedList search operation. get(int index) in ArrayList gives the performance of O(1) while
LinkedList performance is O(n).

Reason: ArrayList maintains index based system for its elements as it uses array data structure implicitly which makes it faster for searching an element in the list.
On the other side LinkedList implements doubly linked list which requires the traversal through all the elements for searching an element.

2) Deletion: LinkedList remove operation gives O(1) performance while ArrayList gives variable performance: O(n) in worst case (while removing first element) and
O(1) in best case (While removing last element). Conclusion: LinkedList element deletion is faster compared to ArrayList.

Reason: LinkedList’s each element maintains two pointers (addresses) which points to the both neighbor elements in the list.
Hence removal only requires change in the pointer location in the two neighbor nodes (elements) of the node which is going to be removed.
While In ArrayList all the elements need to be shifted to fill out the space created by removed element.

3) Inserts Performance: LinkedList add method gives O(1) performance while ArrayList gives O(n) in worst case. Reason is same as explained for remove.

4) Memory Overhead: ArrayList maintains indexes and element data while LinkedList maintains element data and two
pointers for neighbor nodes hence the memory consumption is high in LinkedList comparatively.

There are few similarities between these classes which are as follows:

Both ArrayList and LinkedList are implementation of List interface.
They both maintain the elements insertion order which means while displaying ArrayList and LinkedList elements the result set would be having the same order in which the elements got inserted into the List.
Both these classes are non-synchronized and can be made synchronized explicitly by using Collections.synchronizedList method.
The iterator and listIterator returned by these classes are fail-fast (if list is structurally modified at any time after the iterator is created, in any way except through the
iterator’s own remove or add methods, the iterator will throw a ConcurrentModificationException).

When to use LinkedList and when to use ArrayList?
1) As explained above the insert and remove operations give good performance (O(1)) in LinkedList compared to ArrayList(O(n)).
Hence if there is a requirement of frequent addition and deletion in application then LinkedList is a best choice.

2) Search (get method) operations are fast in Arraylist (O(1)) but not in LinkedList (O(n)) so If there are less add
and remove operations and more search operations requirement, ArrayList would be your best bet.

Let's see a simple example where we are using ArrayList and LinkedList both.
 */

import java.util.*;
import java.util.LinkedList;

class TestArrayLinked{
	public static void main(String args[]){

		ArrayList<String> al=new ArrayList<String>();
		// This <String> denoting data type parameter can be used either on left or right hand side or both. It would work fine in all cases.
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
        int i=al.size();
        String s=al.toString();
		s+="Collection";
		System.out.println(al.indexOf("Vijay"));
		String str=al.get(3); // If we try to get the value of index which is out of 0 - n-1 then we'll be getting ArrayIndexOutOfBoundException
		al.add(4,"gh"); // We can not add beyond the index n i.e. till next to last index. If we try to do so then it'll throw IndexOutOfBoundsException
		al.remove(2);
		al.add("Ram");
		al.remove("Vijay");
		al.subList(0,4);
		if(al.contains("Ajay"))
			System.out.println(al.contains("Ajay"));
		System.out.println(al.size());
		al.ensureCapacity(10);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(i+" "+s+" "+str);

		LinkedList<String> al2=new LinkedList<>();
		al2.add("James");
		al2.add("Serena");
		al2.add("Swati");
		al2.add("Junaid");
		int ii=al2.size();
		String ss=al2.get(2);
		String st=al2.toString();
		int nn=al2.indexOf("Junaid");
		al2.remove("James");
		al2.addFirst("First");
		al2.addLast("Last");
		al2.add(1,"Index1");
		al2.remove();
		al2.indexOf("Serena");
		al2.removeFirst();

		System.out.println("arraylist: "+al);
		System.out.println("linkedlist: "+al2);
	}
}