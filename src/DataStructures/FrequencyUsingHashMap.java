package DataStructures;

import java.util.TreeMap;
public class FrequencyUsingHashMap {
	public static void main(String a[]) {
		String s = "occurence is count";
		count(s);
		count_(s);
	}

	static void count(String s) {
		TreeMap hm = new TreeMap();
		int count;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hm.get(ch) == null) {
				count = 0;
				for (int j = i; j < s.length(); j++) {
					if (s.charAt(j) == ch)
						count++;
				}
				hm.put(ch, count);
			}
		}
		System.out.println(hm);
	}

	static void count_(String s) {
		TreeMap hm = new TreeMap();
		int count;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			count = 0;
			for (int j = 0; j <= i; j++) {
				if (s.charAt(j) == ch)
					count++;
			}
			hm.put(ch, count);
		}
		System.out.println(hm);
	}
}