package TestAndLearn;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueHeap {
	public static void main(String[] args) {
		int arr[] = {7, 3, 8, 25, 5, 2, 20, 30, 9, 12};
		maxHeap(arr);
		minHeap(arr);
		heapSortAsc(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();

		heapSortDesc(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	static void minHeap(int a[]) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		for (int i = 0; i < a.length; i++) {
			p.add(a[i]);
			System.out.print(p.peek() + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++)
			System.out.print(p.poll() + " ");

		System.out.println();
	}

	static void maxHeap(int a[]) {
		PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < a.length; i++) {
			p.add(a[i]);
			System.out.print(p.peek() + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++)
			System.out.print(p.poll() + " ");

		System.out.println();
	}

	static void heapSortAsc(int a[]) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < a.length; i++)
			minHeap.add(a[i]);
		for (int i = 0; i < a.length; i++)
			a[i] = minHeap.poll();
	}

	static void heapSortDesc(int a[]) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < a.length; i++)
			minHeap.add(a[i]);
		for (int i = 0; i < a.length; i++)
			a[i] = minHeap.poll();
	}
}