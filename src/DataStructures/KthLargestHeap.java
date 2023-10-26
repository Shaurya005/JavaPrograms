package DataStructures;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestHeap {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		Solutio n = new Solutio();
		int a[] = n.kthLargest(4,arr,6);
		for(int i:a)
			System.out.print(i+" ");
		int a1[]={7,10,4,20,15};
		System.out.println(n.kthSmallest(a1,5,4));
	}
}

class Solutio {
	static int[] kthLargest(int k, int[] arr, int n) {
		// code here
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int a[] = new int[n];
		int i;
		for(i=0;i<k;i++)
			minHeap.offer(arr[i]);
		for(i=0;i<k-1;i++)
			a[i]=-1;
		a[i]=minHeap.peek();
		for(i=k;i<n;i++)
		{
			if(minHeap.peek()<arr[i])
			{
				minHeap.poll();
				minHeap.add(arr[i]);
			}
			a[i]=minHeap.peek();
		}
		return a;
	}

	static int kthSmallest(int[] arr, int n, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		int i;
		for (i = 0; i < k; i++)
			maxHeap.offer(arr[i]);
		for (i = k; i < n; i++) {
			if (maxHeap.peek() > arr[i]) {
				maxHeap.poll();
				maxHeap.offer(arr[i]);
			}
		}
		return maxHeap.peek();
	}
}
