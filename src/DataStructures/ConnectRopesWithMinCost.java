package DataStructures;

import java.util.PriorityQueue;
import java.util.Stack;

public class ConnectRopesWithMinCost
{
	public static void main(String[] args) {
		int arr[] = {3, 4, 7, 2};
		System.out.println(connectRopeWithMinimumCost(arr));
	}

	public static int connectRopeWithMinimumCost(int[] ropes) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i = 0; i < ropes.length; i++)
			minHeap.add(ropes[i]);

		int minCost = 0;
		Stack st = new Stack();
		while(minHeap.size() > 1) {
			int tempCost = minHeap.poll() + minHeap.poll();
			minCost = minCost + tempCost;
			minHeap.add(tempCost);
		}
		return minCost;
	}
}