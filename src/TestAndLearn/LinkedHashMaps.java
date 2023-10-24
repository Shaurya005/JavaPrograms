package TestAndLearn;/*
LinkedHashMap is a predefined class in Java which is similar to HashMap, contain key and its respective value unlike HashMap, In LinkedHashMap insertion order is preserved.
The task is to get value from LinkedHashMap by their Index in other words, an order of their insertion. As an advantage of LinkedHashMap we know that the order of their insertion
is preserved, their order will be the same as inserted.

Example :

Input :   Key - 2 : Value - 5
             Key - 4 : Value - 3
             Key - 1 : Value - 10
             Key - 3 : Value - 12
             Key - 5 : Value - 6

Input Index ( assuming index from 1-N ) :

Index - 2
Output :  3 ( Value 3 is at Index 2 )

Method 1(Using keys array):

 You can convert all the keys of LinkedHashMap to a set using Keyset method and then convert the set to an array by using toArray method now
 using array index access the key and get the value from LinkedHashMap.

Syntax:

Object[] toArray()
Parameters: The method does not take any parameters.

Return Value: The method returns an array containing the elements similar to the Set.
 */
// Java program to get a value from LinkedHashMap by index Using Array
import java.util.*;
import java.util.LinkedHashMap;
public class LinkedHashMaps {
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap();
		lhm.put(2, 5);
		lhm.put(4, 3);
		lhm.put(1, 10);
		lhm.put(3, 12);
		lhm.put(5, 6);

		Set<Integer> keySet = lhm.keySet();

		Integer[] keyArray = keySet.toArray(new Integer[keySet.size()]);
		Integer index = 2;
		Integer key = keyArray[index - 1];

		// get value from the LinkedHashMap for the key
		System.out.println("Value at index " + index + " is : " + lhm.get(key));
	}
}
/*
Method 2(Using the List):

This method is similar to the first method, you can convert the Keys to an Arraylist or LinkedList instead of converting to an array.

Example:

// Java program to get a value from LinkedHashMap by index Using ArrayList

import java.util.*;
import java.io.*;

public class GFG {

    public static void main(String[] args)
    {
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();

        lhm.put(2, 5);
        lhm.put(4, 3);
        lhm.put(1, 10);
        lhm.put(3, 12);
        lhm.put(5, 6);

        Set<Integer> keySet = lhm.keySet();

        // Integer[] keyArray = keySet.toArray(new Integer[keySet.size()]); replacing array with ArrayList here.
        List<Integer> listKeys = new ArrayList<Integer>(keySet);

        Integer index = 2; // taking input of index
        Integer key = listKeys.get(index - 1);

        // get value from the LinkedHashMap for the key
        System.out.println("Value at index " + index + " is : " + lhm.get(key));
    }
}
Output
Value at index 2 is : 3
Method 3(Using an Iterator):

We can get all the entries of LinkedHashMap using entrySet() method and iterate through them using For-each loop take count until it is equal to index, break and print the value.

Example

// Java program to get a value from LinkedHashMap by index Using iterator

import java.util.*;
import java.io.*;
class GFG {
    public static void main(String[] args)
    {
        // create an instance of linked hashmap
        LinkedHashMap<Integer, Integer> lhm  = new LinkedHashMap<Integer, Integer>();

        // Add mappings
        lhm.put(2, 5);
        lhm.put(4, 3);
        lhm.put(1, 10);
        lhm.put(3, 12);
        lhm.put(5, 6);

        // get all entries from the LinkedHashMap
        Set<Map.Entry<Integer, Integer> > entrySet = lhm.entrySet();

        // create an iterator
        Iterator<Map.Entry<Integer, Integer> > iterator = entrySet.iterator();

        int i = 0;
        int index = 1;
        int value = 0;

        while (iterator.hasNext()) {
            if (index - 1 == i) {
                value = iterator.next().getValue(); // index is found
                                         // get value
                break; // at that index and break
            }
            iterator.next();
            i++;
        }
        System.out.println("Value at index " + index + " : " + value);
    }
}
Output
Value at index 1 : 5
Time Complexity: O(n)

Note: Method 1 and Method 2 are not recommended to use as they require allocating a new array or
ArrayList to perform this task which cost more space instead use the iterator method (Direct method) which only require Iterating.
 */