package DataStructures;

public class ReverseList {
	public static void main(String a[]){
		ListNode n=new ListNode();

	}
}
	 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 public ListNode rotateRight(ListNode head, int k) {
		if(head==null || head.next==null)
			return head;
		ListNode preptr=null,tail=head,ptr=head;int i=1;
		while(ptr.next!=null){
			if(i<k){
				ptr=ptr.next;
			}
			else if(i==k){
				preptr=head;
			}
			else{
				tail=preptr;
				preptr=preptr.next;
				ptr=ptr.next;}
			i++;
		}
		ptr.next=head;
		tail.next=null;
		return preptr;
	}
}