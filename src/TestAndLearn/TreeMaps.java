package TestAndLearn;/*
The TreeMap in Java is used to implement Map interface and NavigableMap along with the AbstractMap Class.
The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
This proves to be an efficient way of sorting and storing the key-value pairs. The storing order maintained by the treemap must be consistent with equals just
like any other sorted map, irrespective of the explicit comparators. The treemap implementation is not synchronized in the sense that if a map is accessed
by multiple threads, concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally.

However, the insertion order is not retained in the TreeMap. Internally, for every element, the keys are compared and sorted in the ascending order.
After adding the elements if we wish to change the element, it can be done by again adding the element with the put() method.
Since the elements in the treemap are indexed using the keys, the value of the key can be changed by simply inserting the updated value for the key for which we wish to change.

In order to remove an element from the TreeMap, we can use the remove() method.
This method takes the key value and removes the mapping for the key from this treemap if it is present in the map.

There are multiple ways to iterate through the Map. The most famous way is to use a for-each loop and get the keys. The value of the key is found by using the getValue() method.
 */
// Java code to show creation, insertion, searching, and traversal in a TreeMap
import java.util.*;
public class TreeMaps {
	static TreeMap<Integer, String> tree_map;
	static void create()
	{
		tree_map = new TreeMap<Integer, String>();
		System.out.println("TreeMap successfully" + " created");
	}

	static void insert()
	{
		tree_map.put(10, "Geeks");
		tree_map.put(15, "4");
		tree_map.put(20, "Geeks");
		tree_map.put(25, "Welcomes");
		tree_map.put(30, "You");
		System.out.println("\nElements successfully" + " inserted in the TreeMap");
	}

	static void search(int key)
	{
		System.out.println("\nIs key \"" + key + "\" present? " + tree_map.containsKey(key));
	}
	static void search(String value)
	{
		System.out.println("\nIs value \"" + value + "\" present? " + tree_map.containsValue(value));
	}
	static void display()
	{
		System.out.println("\nDisplaying the TreeMap:");
		System.out.println("TreeMap: " + tree_map);
	}
	static void traverse()
	{
		System.out.println("\nTraversing the TreeMap:");
		for (Map.Entry<Integer, String> e : tree_map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}

	public static void main(String[] args)
	{
		create();
		insert();
		search(50);// Search key "50" in the TreeMap
		search("Geeks");// Search value "Geeks" in the TreeMap
		display();
		traverse();

		TreeMap tm1 = new TreeMap();

		// Initialization of a TreeMap using Generics
		TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();

		tm1.put(3, "Geeks");
		tm1.put(2, "Of");
		tm1.put(1, "Geeks");
		tm1.put(4, "For");
		System.out.println(tm1);
		tm1.put(2,"For");
		System.out.println(tm1);
		tm1.remove(4);
		System.out.println(tm1);

		tm2.put(3, "Geeks"); // It's not necessary to do like new Integer(3)
		tm2.put(new Integer(2), "For");
		tm2.put(new Integer(1), "Geeks");

		for (Map.Entry mapElement : tm2.entrySet()) {
			int key = (int)mapElement.getKey();
			String value = (String)mapElement.getValue();
			System.out.println(key + " : " + value);
		}
	}
}
/*
Some important features of the treemap are:

This class is a member of Java Collections Framework.
The class implements Map interfaces including NavigableMap, SortedMap and extends AbstractMap class.
TreeMap in Java does not allow null keys (like Map) and thus a NullPointerException is thrown. However, multiple null values can be associated with different keys.
Entry pairs returned by the methods in this class and its views represent snapshots of mappings at the time they were produced. They do not support the Entry.setValue method.
 */