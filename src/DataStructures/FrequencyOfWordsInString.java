package DataStructures;

import java.util.*;
import java.util.LinkedList;

class MostFrequentItemAfterExcluding {

	public static Map<String, Integer> wordFrequency(String str) {

		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		String[] allWords = str.split(" +");

		Map<String, Integer> countingMap = new HashMap<>();

		for (String word : allWords) {
			word = word.toLowerCase();
			countingMap.put(word, countingMap.getOrDefault(word, 0) + 1);
		}

		TreeMap<String, Integer> mostFrequentMap = new TreeMap<>((e1, e2) -> {
			int freq1 = countingMap.get(e1);
			int freq2 = countingMap.get(e2);

			if (freq1 != freq2)
				return freq2 - freq1;
			return e1.compareTo(e2);
		});
		mostFrequentMap.putAll(countingMap);
		return mostFrequentMap;
	}

	public static List<String> mostFrequent(String str, String[] excludingItems) {

		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		String[] allWords = str.split(" +");

		Map<String, Integer> countingMap = new HashMap<>();
		for (String word : allWords) {
			word = word.toLowerCase();
			countingMap.put(word, countingMap.getOrDefault(word, 0) + 1);
		}

		for(String excluded: excludingItems)
			if (countingMap.containsKey(excluded))
				countingMap.remove(excluded);

		TreeMap<String, Integer> mostFrequentMap = new TreeMap<>((e1, e2) -> {
			int freq1 = countingMap.get(e1);
			int freq2 = countingMap.get(e2);

			if (freq1 != freq2)
				return freq2 - freq1;
			return e1.compareTo(e2);
		});
		mostFrequentMap.putAll(countingMap);
		List<String> mostFrequentWords = new ArrayList<>();
		int topFreq = mostFrequentMap.firstEntry().getValue();

		while (!mostFrequentMap.isEmpty()) {
			Map.Entry<String, Integer> word = mostFrequentMap.pollFirstEntry();
			if (word.getValue() == topFreq)
				mostFrequentWords.add(word.getKey());
			else
				break;
		}
		return mostFrequentWords;
	}

	private static boolean isVowel(char c) {
		if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
			return true;
		return false;
	}

	static String reverseVowelsInString(String str) {
		int start = 0;
		int end = str.length() - 1;
		char[] charArr = str.toCharArray();
		while (start < end) {
			if (!isVowel(charArr[start])) {
				start++;
				continue;
			}
			if (!isVowel(charArr[end])) {
				end--;
				continue;
			}
			char c = charArr[start];
			charArr[start] = charArr[end];
			charArr[end] = c;
			start++;
			end--;
		}
		return String.valueOf(charArr);
	}

	public static int longestSubstringLengthWithSameLettersWithKLettersAllowedToReplace(String str, int k) {
		if(str == null || str.length() == 0 || k <= 0 || k > str.length())
			return -1;
		int maxLength = 0;
		int start, end;
		start = end = 0;
		int maxFreq = 0;
		Map<Character, Integer> map = new HashMap<>();

		while(end < str.length()) {
			char currentChar = str.charAt(end);
			map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

			maxFreq = Math.max(maxFreq, map.get(currentChar));

			if(end - start + 1 - maxFreq > k) {
				char startChar = str.charAt(start);
				map.put(startChar, map.get(startChar) - 1);
				start++;
			}
			maxLength = Math.max(end - start + 1, maxLength);
			end++;
		}
		return maxLength;
	}

	static String smallestSubstringWithAllPatternCharacters(String str, String pattern) {
		if (str == null || str.length() == 0 || pattern == null || pattern.length() == 0)
			return "";

		Map<Character, Integer> map = new HashMap<>();
		int matchedElement = 0;
		int start = 0;
		int minSubstringLength = Integer.MAX_VALUE;
		int minSubStringStart = 0;

		for (int i = 0; i < pattern.length(); i++)
			map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0) + 1);

		for (int end = 0; end < str.length(); end++) {
			char currentChar = str.charAt(end);
			if (map.containsKey(currentChar)) {
				map.put(currentChar, map.get(currentChar) - 1);
				if (map.get(currentChar) >= 0)
					matchedElement++;
			}

			while (matchedElement == pattern.length()) {
				if(end - start + 1 < minSubstringLength) {
					minSubstringLength = end - start + 1;
					minSubStringStart = start;
				}
				char charAtStart = str.charAt(start++);
				if (map.containsKey(charAtStart)) {
					if (map.get(charAtStart) == 0)
						matchedElement--;
					map.put(charAtStart, map.get(charAtStart) + 1);
				}
			}
		}
		if (minSubstringLength > str.length())
			return "";
		return str.substring(minSubStringStart, minSubStringStart + minSubstringLength);
	}

	public static List<Integer> getAllAnagrams(String str, String pattern) {
		if(str == null || str.length() == 0 || pattern == null || pattern.length() == 0)
			return new ArrayList<>();

		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < pattern.length(); i++)
			map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0) + 1);

		int matchedElement = 0;
		int start = 0;
		List<Integer> anagramStartingIndexes = new ArrayList<>();

		for(int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			if(map.containsKey(currentChar)) {
				map.put(currentChar, map.get(currentChar) - 1);
				if(map.get(currentChar) == 0)
					matchedElement++;
			}

			if(matchedElement == map.size())
				anagramStartingIndexes.add(start);

			if(i >= pattern.length() - 1) {
				char charAtStart = str.charAt(start++);
				if(map.containsKey(charAtStart)) {
					if(map.get(charAtStart) == 0)
						matchedElement--;
					map.put(charAtStart, map.get(charAtStart) + 1);
				}
			}
		}
		return anagramStartingIndexes;
	}

	public static void main(String[] args) {
		String str = "Best items in category are Samsung lenovo. Samsung items are nice. Lenovo are cool";
		String[] excludingItems = {"in", "are"};
		System.out.println(wordFrequency(str));
		System.out.println(mostFrequent(str,excludingItems));

		String s = "equation";
		System.out.println(reverseVowelsInString(s));

		String st = "bccbababd";
		int k = 2;
		System.out.println(longestSubstringLengthWithSameLettersWithKLettersAllowedToReplace(st, k));

		String ss = "badeabcaae";
		String patt = "aabc";
		System.out.println(smallestSubstringWithAllPatternCharacters(ss, patt));

		String sst = "bcdcbabcbd";
		String pattern = "abc";
		System.out.println(getAllAnagrams(sst, pattern));
	}
}