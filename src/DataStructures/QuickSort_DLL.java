class DLL{
	int data;
	DLL next, prev;
	DLL(int key){
		data = key;
		prev = next = null;
	}
}
public class QuickSort_DLL {
	public static void main(String arg[]) {
		DLL head = new DLL(9);
		head = insert(head, 20);
		head = insert(head, 2);
		head = insert(head, 10);
		head = insert(head, 11);
		head = insert(head, 22);
		head = insert(head, 30);
		head = insert(head, 1);

		head = partition(head);
		printList(head);
	}

	public static void printList(DLL node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	static DLL insert (DLL head, int data){
		DLL node = new DLL(data);
		if(head==null)
			return node;
		node.next = head;
		head.prev = node;
		head = node;
		return head;
	}

	public static DLL partition(DLL l)
	{
		if(l==null || l.next==null)
			return l;
		return partitionUtil(l)[0];
	}

	public static DLL[] partitionUtil(DLL l)
	{
		if(l==null || l.next == null)
			return new DLL[]{l,l};
		DLL pivot = l;
		DLL node = l.next;
		DLL small = new DLL(-1);
		DLL large = new DLL(-1);
		DLL sh = small, lh = large;
		while(node!=null){
			if(node.data <= pivot.data){
				small.next = node;
				small.next.prev = small;
				small = small.next;
			}
			else{
				large.next = node;
				large.next.prev = large;
				large = large.next;
			}
			node = node.next;
		}
		small.next = null;
		if(sh.next!=null)
			sh.next.prev = null;
		large.next = null;
		if(lh.next!=null)
			lh.next.prev = null;
		pivot.next = null;
		pivot.prev = null;

		DLL left[] = partitionUtil(sh.next);
		DLL right[] = partitionUtil(lh.next);

		if(left[0]!=null && right[0]!=null){
			left[1].next = pivot;
			pivot.prev = left[1];
			pivot.next = right[0];
			right[0].prev = pivot;
			return new DLL[]{left[0],right[1]};
		}
		else if(left[0]==null){
			pivot.next = right[0];
			right[0].prev = pivot;
			return new DLL[]{pivot,right[1]};
		}
		else{
			left[1].next = pivot;
			pivot.prev = left[1];
			return new DLL[]{left[0],pivot};
		}
	}
}