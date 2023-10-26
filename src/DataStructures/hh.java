import java.util.*;
/*
public class hh {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		/*root.left.right.left = new Node(1);
		root.left.right.left.left = new Node(12);
		root.right = new Node(5);
		root.right.right = new Node(8);
		root.right.left = new Node(6);
		root.right.left.right = new Node(11);
		root.right.right.right = new Node(9);
		ArrayList<Integer> a=bottomView(root);
	}
		static ArrayList<Integer> bottomView (Node root)
		{
			// Code here
			ArrayList<Integer> ar = new ArrayList<>();
			TreeMap<Integer, Integer> tm = topView(root);
			for (Map.Entry<Integer, Integer> e : tm.entrySet())
				ar.add(e.getValue());
			return ar;
		}

		static TreeMap<Integer, Integer> topView (Node node)
		{
			TreeMap<Integer, Integer> m = new TreeMap<>();
			if (node == null) {
				return m;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(node);
			while (!q.isEmpty()) {
				Node temp = q.remove();
				int h = temp.hd;
				m.put(h, temp.data);
				if (temp.left != null) {
					temp.left.hd = h - 1;
					q.add(temp.left);
				}
				if (temp.right != null) {
					temp.right.hd = h + 1;
					q.add(temp.right);
				}
			}
			return m;
		}
}
*/