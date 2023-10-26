package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

class QuickSortLL
{
	public static ListNode[] mergeElements(ListNode[] left, ListNode pivotNode, ListNode[] right) {
		ListNode head, tail;
		if (left[0] != null && right[0] != null) {
			head = left[0];
			tail = right[1];
			left[1].next = pivotNode;
			pivotNode.next = right[0];
		} else if (left[0] != null) {
			head = left[0];
			tail = pivotNode;
			left[1].next = pivotNode;
		} else if (right[0] != null) {
			head = pivotNode;
			tail = right[1];
			pivotNode.next = right[0];
		} else
			head = tail = pivotNode;
		return new ListNode[] { head, tail };  // This recursive function is returning array of two nodes i.e. head and tail of merged node.
	}

	public static ListNode[] quickSort_(ListNode head) { // Basically this recursive function is returning array of two nodes i.e. head and tail node.
		if (head == null || head.next == null)
			return new ListNode[ ] { head, head };

		ListNode small = new ListNode(-1);
		ListNode large = new ListNode(-1);
		ListNode pivotNode = head, sp = small, lp = large, curr = head;

		while (curr != null) {
			if (curr != pivotNode) {
				if (curr.val <= pivotNode.val) {
					sp.next = curr;
					sp = sp.next;
				} else {
					lp.next = curr;
					lp = lp.next;
				}
			}
			curr = curr.next;
		}
		pivotNode.next = null;
		sp.next = null;
		lp.next = null;

		ListNode[] left = quickSort_(small.next);
		ListNode[] right = quickSort_(large.next);

		return mergeElements(left, pivotNode, right);
	}

	public static ListNode quickSort(ListNode head) {
		return quickSort_(head)[0];
	}

	public static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	public static ListNode myQuickSort(ListNode l)
	{
		//code here.
		if(l==null || l.next==null)
			return l;
		return myQuickSortUtil(l)[0];
	}

	public static ListNode[] myQuickSortUtil(ListNode l)
	{
		//code here.
		if(l==null || l.next == null)
			return new ListNode[]{l,l};
		ListNode pivot = l;
		ListNode ListNode = l.next;
		ListNode small = new ListNode(-1);
		ListNode large = new ListNode(-1);
		ListNode sh = small, lh = large;
		while(ListNode!=null){
			if(ListNode.val <= pivot.val){
				small.next = ListNode;
				small = small.next;
			}
			else{
				large.next = ListNode;
				large = large.next;
			}
			ListNode = ListNode.next;
		}
		small.next = null;
		large.next = null;
		pivot.next = null;
		ListNode left[] = myQuickSortUtil(sh.next);
		ListNode right[] = myQuickSortUtil(lh.next);
		if(left[0]!=null && right[0]!=null){
			left[1].next = pivot;
			pivot.next = right[0];
			return new ListNode[]{left[0],right[1]};
		}
		else if(left[0]==null){
			pivot.next = right[0];
			return new ListNode[]{pivot,right[1]};
		}
		else{
			left[1].next = pivot;
			pivot.next = null;
			return new ListNode[]{left[0],pivot};
		}
	}

	public static void main(String[] args) {
		ListNode l = new ListNode(30);
		l.next = new ListNode(2);
		l.next.next = new ListNode(1);
		l.next.next.next = new ListNode(30);
		l.next.next.next.next = new ListNode(15);
		l.next.next.next.next.next = new ListNode(8);
		l.next.next.next.next.next.next = new ListNode(5);

		//ListNode head = quickSort(l);
		ListNode head = myQuickSort(l);
		printList(head);
	}
}