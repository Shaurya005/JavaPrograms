package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class StringCodingSimplified {
	public static void main(String args[]) {
		String str = "bccbababd";
		int k = 3;
		System.out.println(LongestSubstringLengthWithKDistinctCharacters(str,k));

		String st = "bcdcbababd";
		System.out.println(LongestSubstringWithNoRepeatingCharater(st));

		int a = 1;
		int b = 2;
		String s = a+"+"+b+"i";
		String s1 = a+""+b;
		System.out.println(s1);
	}

	static int LongestSubstringLengthWithKDistinctCharacters(String str,int k){
		if(str==null || str.length()==0 || k<=0 || k>str.length())
			return 0;

		int maxLength = 0;
		int start = 0, end = 0;
		Map<Character,Integer> map = new HashMap<>();

		while(end<str.length()){
			char ch = str.charAt(end);
			map.put(ch,map.getOrDefault(ch,0)+1);

			while(map.size()>k){
				char frontChar = str.charAt(start);
				map.put(frontChar, map.get(frontChar)-1);

				if(map.get(frontChar)==0)
					map.remove(frontChar);
				start++;
			}
			maxLength = Math.max(end-start+1,maxLength);
			end++;
		}
		return maxLength;
	}

	static int LongestSubstringWithNoRepeatingCharater(String str){
		if(str==null || str.length()==0)
			return -1;

		int maxLength = 0;
		int start=0, end=0;
		Map<Character,Integer> map = new HashMap<>();

		while(end<str.length()){
			char ch = str.charAt(end);
			if(map.containsKey(ch))
				start = Math.max(start, map.get(ch)+1);
			map.put(ch, end);
			maxLength = Math.max(end-start+1,maxLength);
			end++;
		}
		return maxLength;
	}
}