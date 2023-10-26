package DataStructures;

public class OddEvenLinkedList {
	public static void main(String args[]){
		LinkedList head = new LinkedList(1);
		head.next = new LinkedList(2);
		head.next.next = new LinkedList(3);
		head.next.next.next = new LinkedList(4);
		head.next.next.next.next = new LinkedList(5);
		LinkedList h = oddEvenList(head);
	}

	public static LinkedList oddEvenList(LinkedList head) {
		if(head.next==null || head.next.next==null)
			return head;
		LinkedList oddHead = head,evenHead = head.next;
		LinkedList even = evenHead,odd = oddHead;
		if(odd.next!=null && even.next!=null){
			System.out.println(even.data);
			System.out.println(odd.data);
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd=odd.next;
			even=even.next;
			System.out.println(odd.data);
			System.out.println(even.data);
		}
		odd.next = evenHead;
		if(even!=null)
			even.next=null;
		return oddHead;
	}
}
