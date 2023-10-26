package DataStructures;

import java.util.*;
public class kFrequentElements {

	static List<Integer> topKFrequentlyOccurredNumbersUsingMaxHeap(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < arr.length; i++)
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
				(n1, n2) -> n2.getValue() - n1.getValue());

		maxHeap.addAll(map.entrySet());
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < k && !maxHeap.isEmpty(); i++)
			list.add(maxHeap.poll().getKey());

		return list;
	}

	static List<Integer> topKFrequentlyOccurredNumbersUsingMinHeap(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < arr.length; i++)
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
				(n1, n2) -> n1.getValue() - n2.getValue());

		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(minHeap.size() < k)
				minHeap.add(entry);
			else
				if(entry.getValue() > minHeap.peek().getValue()) {
					minHeap.poll();
					minHeap.add(entry);
				}
		}

		List<Integer> list = new ArrayList<>();
		while(!minHeap.isEmpty())
			list.add(minHeap.poll().getKey());
		return list;
	}

	static List<Character> sortStringBasedOnFrequencyOfCharacters(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for(int i = 0; i < str.length(); i++)
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
				(n1, n2) -> n2.getValue() - n1.getValue());

		maxHeap.addAll(map.entrySet());
		/*
		StringBuilder sb = new StringBuilder();
		while(!maxHeap.isEmpty()) {
			Map.Entry<Character, Integer> entry = maxHeap.poll();
			for(int i = 0;i<entry.getValue();i++)
				sb.append(entry.getKey());
		}
		*/
		List<Character> list = new ArrayList<>();
		while(!maxHeap.isEmpty()) {
			Map.Entry<Character, Integer> entry = maxHeap.poll();
			list.add(entry.getKey());
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = {8, 10, 7, 8, 11, 30, 11, 8, 38, 11, 2, 45, 2, 8};
		int k = 3;
		System.out.println(topKFrequentlyOccurredNumbersUsingMinHeap(arr, k));
		System.out.println(topKFrequentlyOccurredNumbersUsingMaxHeap(arr, k));

		String str = "codingsimplified";
		System.out.println(sortStringBasedOnFrequencyOfCharacters(str));
	}
}