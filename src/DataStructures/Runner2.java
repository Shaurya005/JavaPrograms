package DataStructures;

public class Runner2 {
	public static void main(String a[]){
		LinkedList2 l=new LinkedList2();

		l.insert(18);
		l.insert(45);
		l.insert(12);
		l.insertAtStart(25);
		l.show();
	}
}

class LinkedList2 {
	class Node {
		int data;
		Node next;
	}
	Node head;

	public void insert(int data) { // Inserting data at last
		Node node = new Node();
		node.data = data;
		node.next = null; // Even if we don't make it null, by default the object value is null.

		if (head == null)
			head = node;
		else {
			Node n = head;
			while (n.next != null)
				n = n.next;
			n.next = node;
		}
	}

	public void show() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void insertAtStart(int data) { // Inserting data at last
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
}