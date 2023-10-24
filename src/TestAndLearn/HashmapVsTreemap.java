package TestAndLearn;

import java.util.*;
public class HashmapVsTreemap {
	/* Java program to print frequencies of all elements using HashMap */
	static void printFreq(int arr[])
	{
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++)
		{
			Integer c = hmap.get(arr[i]);
			if (hmap.get(arr[i]) == null) // If this is first occurrence of element
				hmap.put(arr[i], 1);
			else
				hmap.put(arr[i], ++c); // If elements already exists in hash map
		}
		for (Map.Entry m:hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}

	public static void main (String[] args)
	{
		int arr[] = {10, 34, 5, 10, 3,4,6,10,3, 5, 10};
		printFreq(arr);
	}
}
/*
HashMap does not maintain any order neither based on key nor on basis of value, If we want the keys to be maintained in a sorted order, we need to use TreeMap.
Complexity: get/put/containsKey() operations are O(1) in average case but we can’t guarantee that since it all depends on how much time does it take to compute the hash.

Application:
HashMap is basically an implementation of hashing. So wherever we need hashing with key value pairs, we can use HashMap.
For example, in Web Applications username is stored as a key and user data is stored as a value in the HashMap, for faster retrieval of user data corresponding to a username.

TreeMap can be a bit handy when we only need to store unique elements in a sorted order.
Java.util.TreeMap uses a red-black tree in the background which makes sure that there are no duplicates; additionally it also maintains the elements in a sorted order.
 TreeMap<K, V> hmap = new TreeMap<K, V>();
Below is TreeMap based implementation of same problem. This solution has more time complexity O(nLogn) compared to previous one which has O(n).
The advantage of this method is, we get elements in sorted order.

import java.util.*;
class Main
{
	static void printFreq(int arr[])
	{
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++)
		{
			Integer c = tmap.get(arr[i]);
			if (tmap.get(arr[i]) == null)
				tmap.put(arr[i], 1);
			else
				tmap.put(arr[i], ++c);
		}
		for (Map.Entry m:tmap.entrySet())
			System.out.println("Frequency of " + m.getKey() +	" is " + m.getValue());
	}
	public static void main (String[] args)
	{
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
		printFreq(arr);
	}
}

Key Points

For operations like add, remove, containsKey, time complexity is O(log n where n is number of elements present in TreeMap. TreeMap always keeps the elements in a
sorted(increasing) order, while the elements in a HashMap have no order. TreeMap also provides some cool methods for first, last, floor and ceiling of keys.

Overview:
HashMap implements Map interface while TreeMap implements SortedMap interface. A Sorted Map interface is a child of Map.
HashMap implements Hashing, while TreeMap implements Red-Black Tree(a Self Balancing Binary Search Tree). Therefore all differences between Hashing and Balanced Binary Search Tree apply here.
Both HashMap and TreeMap have their counterparts HashSet and TreeSet. HashSet and TreeSet implement Set interface. In HashSet and TreeSet,
we have only key, no value, these are mainly used to see presence/absence in a set. For above problem, we can’t use HashSet (or TreeSet) as we can’t store counts.
An example problem where we would prefer HashSet (or TreeSet) over HashMap (or TreeMap) is to print all distinct elements in an array.
*/