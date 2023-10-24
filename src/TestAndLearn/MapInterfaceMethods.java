package TestAndLearn;/*
Map Interface is present in Java.util package, which provides mainly three methods KeySet(),entrySet() and values().
These methods are used to retrieve the keys of the map, key-value pairs of the map, and values of the map respectively.
Since these methods are part of Map Interface, so we can use these methods with all the classes implementing map interface like TreeMap, HashMap, and LinkedHashMap.

keySet() Method:   The java.util.HashMap.keySet() method in Java is used to create a set out of the key elements contained in the hash map.
								It basically returns a set view of the keys or we can create a new set and store the key elements in them.

Syntax:     hash_map.keySet()
Parameters: The method does not take any parameter.
Return Value: The method returns a set having the keys of the hash map.
 */
import java.util.*;
import java.util.stream.Stream;

public class MapInterfaceMethods {
	public static void main(String args[]){
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Geeks");
		map.put(2, "For");
		map.put(3, "Geeks");

		// below are the different and simple ways out of many  to iterate over the keySet()

		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();

		// iterating the keySet() using for loop
		for (Integer key : map.keySet())
			System.out.print(key + " ");
		System.out.println();

		// iterating over the keySet() by converting the map to the string
		System.out.println(map.keySet().toString());

		/*
		entrySet() Method: The java.util.HashMap.entrySet() method in Java is used to create a set out of the same elements contained in the hash map.
										 It basically returns a set view of the hash map or we can create a new set and store the map elements into them.
		Syntax: hash_map.entrySet()
		Parameters: The method does not take any parameter.
		Return Value: The method returns a set having same elements as the hash map.
		 */
		// below are the different and simple ways out of many  to iterate over the entrySet()
		System.out.println();
		for (Map.Entry<Integer, String> entry :map.entrySet())
		{
			Integer key = (Integer)entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}

		// iterating the key-value pairs using iterator
		Iterator<Map.Entry<Integer, String> > itr2 = map.entrySet().iterator();

		while (itr2.hasNext())
			System.out.println(itr2.next());

		// iterating the key-value pairs using Stream.of() method
		Stream.of(map.entrySet().toArray()).forEach(System.out::println);
		/*
		Method 1: values() method
		The java.util.HashMap.values() method of HashMap class in Java is used to create a collection out of the values of the map. It basically returns a Collection view of the values in the HashMap.

		Syntax: Hash_Map.values()
		Parameters: The method does not accept any parameters.
		Return Value: The method is used to return a collection view containing all the values of the map.
		*/

		// Showcasing different ways to illustrate values() method

		// Way 1 - Using iterator
		// Iterating over the object elements of the showcasing the values() method using iterator
		Iterator<String> itr3 = map.values().iterator();

		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();

		// Way 2 - Using loops
		// Iterating over the elements using for-each loop to show case value() method
		for (String value : map.values())
			System.out.println(value);
		System.out.println();

		// Iterating over the values() method by converting the Map to the string
		System.out.println(map.values().toString());
	}
}
/*
											keySet()	                                                                                                                                                                 entrySet()
	This method returns the Set view of all the keys                                                                                            This method returns the Set view of all the mappings present in the map, i.e. it returns a set of keys.	                                                                                                the map, ie it returns a set of key, value pairs.

	If any changes happen to the map, then they can be                                                                                     For entrySet() method also, If any changes happen to the map,
	observed in the set also,as set is backed up by the map. 	                                                                            then they can be observed in the set also,as set is backed up by the map.

	If iterating through all the pairs of maps using keySet(), then the performance                                            When Iterating through all the pairs of the map using entrySet(),
	of keySet() is poorer as compared to entrySet(), as for each key,                                                              then the performance of entrySet() is much better as compared to keySet().
	we have to access its corresponding value by using get() function.
 */
