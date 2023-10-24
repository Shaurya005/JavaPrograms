package TestAndLearn;

import java.util.*;
public class QueueInJava {
	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < 5; i++) // Adds elements {0, 1, 2, 3, 4} to the queue
			q.add(i);
		System.out.println("Elements of queue " + q); // Display contents of the queue.
		int removedel = q.remove(); // To remove the head of queue.
		System.out.println("removed element-" + removedel);
		System.out.println(q);
		int head = q.peek(); // To view the head of queue
		System.out.println("head of queue-" + head);
		// Rest all methods of collection interface like size and contains can be used with this implementation.
		int size = q.size();
		System.out.println("Size of queue-" + size);

		ArrayDeque ad=new ArrayDeque(); // On LHS adding only <> will prompt error as 'identifier expected' while on RHS only putting <> will not show any error.
		ad.add("F");
		ad.add(3);
		ad.add('c');
		ad.addFirst(4);
		ad.addLast(5);
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.pop());
		System.out.println(ad.peek());
		System.out.println(ad.size());
		Iterator i=ad.iterator();
		while(i.hasNext())
			System.out.println(i.next());

		PriorityQueue pq=new PriorityQueue();
		pq.add(5);
		pq.add('6');
		pq.add("shaurya");
		pq.add("786");
		pq.add(578);
		System.out.println(pq);
		pq.remove();
		Iterator it=pq.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}