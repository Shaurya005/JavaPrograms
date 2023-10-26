package DataStructures;/*     The TreeMap in Java is used to implement the Map interface and NavigableMap along with the AbstractMap Class. The TreeMap is sorted according to the natural
		ordering of its keys. The TreeMap class is a Red-Black tree implementation of the Map interface and thus does not expose any methods using which we can
		access the TreeMap keys or values using their indices.

		There are three simple ways to get key or TreeMap value using index in Java, which is the following :

		Using an Array
		Using a List
		Using iteration

		Method 1: Using an Array

		We can get a TreeMap key or TreeMap value using an index in Java by using an Array. The process is divided into three steps:

		Use the entrySet() method of the TreeMap class to get a Set view of all the entries stored in the TreeMap object.
		Convert the entry set to an array using the toArray() method.
		And get TreeMap key or TreeMap value using index with the help of getKey() and getValue() method.

		Syntax:

		Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
		Map.Entry<Integer, String>[] entryArray = entrySet.toArray(new Map.Entry[entrySet.size()]);
*/
import java.util.*;
public class KeyValueUsingIndices {
	public static void main(String[] args)
	{
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Welcome");
		treeMap.put(2, "geeks");
		treeMap.put(3, "on");
		treeMap.put(4, "geeksforgeeks");

		// Get entry set of the TreeMap using entrySet method
		Set<Map.Entry<Integer, String> > entrySet = treeMap.entrySet();

		// Convert entrySet to Array using toArray method
		Map.Entry<Integer, String>[] entryArray = entrySet.toArray(new Map.Entry[entrySet.size()]);
		for (int i = 0; i < 4; i++)
		{
			System.out.println("Key at " + i + ":" + entryArray[i].getKey()); // Get Key using index and print
			System.out.println("Value at " + i + ":" + entryArray[i].getValue()); // Get value using index and print
		}
	}
}
/*
Method 2: Using a List

We can get TreeMap key or TreeMap value using index in Java by using a List instead of Array. The process is divided into three steps:

Using entrySet() method of the TreeMap class to get a set view of all the entries stored in the TreeMap object.
Now, converting the entry set to an array using the toArray() method.
Finally, getting TreeMap key or TreeMap value using index with the help of get(), getKey() and getValue() methods.

Syntax:

Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
List<Map.Entry<Integer, String>> entryList = new ArrayList<Map.Entry<Integer, String>>(entrySet);

import java.util.*;
public class GFG {
    public static void main(String[] args)
    {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Welcome");
        treeMap.put(2, "geeks");
        treeMap.put(3, "on");
        treeMap.put(4, "geeksforgeeks");

        // Get entry set of the TreeMap using entrySet method
        Set<Map.Entry<Integer, String> > entrySet = treeMap.entrySet();

        // Converting entrySet to ArrayList
        List<Map.Entry<Integer, String> > entryList = new ArrayList<>(entrySet);

        // For each loop for iteration
        for (int i = 0; i < 4; i++) {
            // Get Key using index
            System.out.println("Key at " + i + ":" + entryList.get(i).getKey());

            // Get value using index
            System.out.println( "Value at " + i + ":" + entryList.get(i).getValue());
        }
    }
}
*/

/*
Method 3: Using iteration

We can get TreeMap key or TreeMap value using index in Java by using an iteration. The process is divided into two steps:

Using the entrySet() method of the TreeMap class to get a Set view of all the entries stored in the TreeMap object.
Iterating on entrySet to get TreeMap key or TreeMap value using index with the help of getKey() and getValue() methods.

Syntax:

Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();

import java.util.*;
public class GFG {
    public static void main(String[] args)
    {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Welcome");
        treeMap.put(2, "geeks");
        treeMap.put(3, "on");
        treeMap.put(4, "geeksforgeeks");

        // Get entry set of the TreeMap using entrySet method
        Set<Map.Entry<Integer, String> > entrySet = treeMap.entrySet();
        int index = 0;
        // For-each loop for iteration
        for (Map.Entry<Integer, String> currentEntry : entrySet) {
            // Get Key using index
            System.out.println("Key at " + index + ":" + currentEntry.getKey());

            // Get value using index
            System.out.println("Value at " + index + ":" + currentEntry.getValue());
            index++;
        }
    }
}
 */