package DataStructures;

import java.util.HashSet;
import java.util.LinkedList;

/* Java Program to implement a stack that supports findMiddle() and deleteMiddle in O(1) time */
public class MiddleOfStack {

	class DLLNode {
		DLLNode prev;
		int data;
		DLLNode next;
		DLLNode(int d) { data = d; }
	}

	/* Representation of the stack data structure that supports findMiddle() in O(1) time. The Stack is implemented using Doubly Linked List. It maintains
	pointer to head node, pointer to middle node and count of nodes */
	class myStack {
		DLLNode head;
		DLLNode mid;
		int count;
	}

	myStack createMyStack()
	{
		myStack ms = new myStack();
		ms.count = 0;
		return ms;
	}

	void push(myStack ms, int new_data)
	{
		DLLNode new_DLLNode = new DLLNode(new_data);
		new_DLLNode.prev = null;
		new_DLLNode.next = ms.head;
		ms.count += 1;

		/* Change mid pointer in two cases
		1) Linked List is empty
		2) Number of nodes in linked list is odd */
		if (ms.count == 1)
			ms.mid = new_DLLNode;
		else {
			ms.head.prev = new_DLLNode;
			if (ms.count % 2 != 0)
				ms.mid = ms.mid.prev;
		}
		ms.head = new_DLLNode;
	}

	int pop(myStack ms)
	{
		if (ms.count == 0) {
			System.out.println("Stack is empty");
			return -1;
		}
		DLLNode head = ms.head;
		int item = head.data;
		ms.head = head.next;

		// If linked list doesn't become empty, update prev of new head as NULL
		if (ms.head != null)
			ms.head.prev = null;
		ms.count -= 1;

		// Update the mid pointer when we have even number of elements in the stack, i,e move down the mid pointer.
		if (ms.count % 2 == 0)
			ms.mid = ms.mid.next;
		return item;
	}

	int findMiddle(myStack ms)
	{
		if (ms.count == 0) {
			System.out.println("Stack is empty now");
			return -1;
		}
		return ms.mid.data;
	}

	public static void main(String args[])
	{
		MiddleOfStack ob = new MiddleOfStack();
		LinkedList l =new LinkedList();
		l.addFirst(1);
		myStack ms = ob.createMyStack();
		ob.push(ms, 11);
		ob.push(ms, 22);
		ob.push(ms, 33);
		ob.push(ms, 44);
		ob.push(ms, 55);
		ob.push(ms, 66);
		ob.push(ms, 77);
		System.out.println("Item popped is " + ob.pop(ms));
		System.out.println("Item popped is " + ob.pop(ms));
		System.out.println("Middle Element is " + ob.findMiddle(ms));
	}
}