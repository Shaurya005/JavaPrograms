package DataStructures;

import java.util.*;
public class IssuesWithMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("red", 23);
		hm.put("orange", 1);
		hm.put("yellow", 32);
		hm.put("green", 32); // Yellow and Green have same values.
		hm.put("red", 20);
		for (String key : hm.keySet())
			System.out.println(key + "  " + hm.get(key));

		TreeMap<String, Integer> tm = new TreeMap<>(
				(e1,e2)->hm.get(e1)-hm.get(e2));
		tm.putAll(hm);
		System.out.println();
		for (String key : tm.keySet())
			System.out.println(key + "  " + tm.get(key));

		HashSet<int[]> hs = new HashSet<>();
		int a[] = {-1,0,-1};
		hs.add(a);
		int b[] = {-1,0,-1};
		hs.add(b);
		int c[] = {0,-1,-1};
		hs.add(c);
		Iterator<int[]> itr = hs.iterator();
		while(itr.hasNext()){
			int n[]=itr.next();
			System.out.println(n[0]+" "+n[1]+" "+n[2]);
		}
		// So here HashSet isn't able to remove arrays entering with duplicate values as it is checking on object reference and not on array values.
	}
	// So if we let the sorting happen on keys then only duplicate keys will be deleted, duplicate values will have no issue.
	// But when we sort the map based on value then both entries containing duplicate keys as well as that containing duplicate values will be removed.
	// So if we sort based on value then it's better to use PriorityQueue there.
}