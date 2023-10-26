package DataStructures;

public class CodingSimplifiedLL {
	public static void main(String arg[]) {
		LinkedList l = new LinkedList(3);
		l.next = new LinkedList(2);
		l.next.next = new LinkedList(1);
		l.next.next.next = new LinkedList(4);
		l.next.next.next.next = new LinkedList(6);
		l.next.next.next.next.next = new LinkedList(6);
		l.next.next.next.next.next.next = new LinkedList(2);

		printList(l); System.out.println();

		l = reverse(l);
		printList(l); System.out.println();

		l = removeDuplicate(l);
		printList(l); System.out.println();
	}

	static LinkedList reverse(LinkedList node) {
		if (node == null || node.next == null)
			return node;

		LinkedList temp = reverse(node.next);
		node.next.next = node;
		node.next = null;

		return temp;
	}

	static void printList(LinkedList node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		printList(node.next);
	}

	static LinkedList removeDuplicate(LinkedList node) {
		if (node == null)
			return node;

		node = mergeSort(node);
		return removeDuplicateSortedList(node);
	}

	static LinkedList removeDuplicateSortedList(LinkedList node) {
		if (node == null || node.next == null)
			return node;

		if (node.data == node.next.data) {
			node.next = node.next.next;
			removeDuplicateSortedList(node);
		} else
			removeDuplicateSortedList(node.next);

		return node;
	}

	static LinkedList mergeSort(LinkedList node) {
		if (node == null || node.next == null)
			return node;

		LinkedList middle = middleNode(node);
		LinkedList secondHalf = middle.next;
		middle.next = null;

		return merge(mergeSort(node), mergeSort(secondHalf));
	}

	static LinkedList middleNode(LinkedList node) {
		if (node == null)
			return null;

		LinkedList a = node;
		LinkedList b = node.next;

		while (b != null && b.next != null) {
			a = a.next;
			b = b.next.next;
		}
		return a;
	}

	static LinkedList merge(LinkedList a, LinkedList b) {
		LinkedList temp = new LinkedList (1);
		LinkedList finalList = temp;

		while (a != null && b != null) {
			if (a.data < b.data) {
				temp.next = a;
				a = a.next;
			} else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		temp.next = (a == null) ? b : a;
		return finalList.next;
	}
}