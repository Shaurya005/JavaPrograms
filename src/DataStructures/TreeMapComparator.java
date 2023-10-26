package DataStructures;

import java.util.*;
class TreeMapComparator {
	static <K, V extends Comparable<V> > Map<K, V> valueSort(final Map<K, V> map)
	{
		// Static Method with return type Map and extending comparator class which compares values associated with two keys
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) // return comparison results of values of two keys
			{
				int comp = map.get(k1).compareTo(map.get(k2));
				if (comp == 0)
					return 1;
				else
					return comp;
			}
		};

		// SortedMap created using the comparator
		Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
		sorted.putAll(map);
		return sorted;
	}

	public static void main(String[] args)
	{
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Anshu", 2);
		map.put("Rajiv", 4);
		map.put("Chhotu", 3);
		map.put("Golu", 5);
		map.put("Sita", 1);

		Map sortedMap = valueSort(map); // Calling the method valueSort
		Set set = sortedMap.entrySet(); // Get a set of the entries on the sorted map
		Iterator i = set.iterator(); // Get an iterator

		while (i.hasNext()) {
			Map.Entry mp = (Map.Entry)i.next();
			System.out.print(mp.getKey() + ": ");
			System.out.println(mp.getValue());
		}
	}
}