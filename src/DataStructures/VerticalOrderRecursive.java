package DataStructures;

import java.util.*;
import java.util.LinkedList;

public class VerticalOrderRecursive {
	public static void main(String s[]) {
		Node root = new Node(7);
		root.left = new Node(2);
		root.left.right = new Node(3);
		root.left.right.left = new Node(1);
		root.left.right.left.left = new Node(12);
		root.right = new Node(5);
		root.right.right = new Node(8);
		root.right.left = new Node(6);
		root.right.left.right = new Node(11);
		root.right.right.right = new Node(9);
		printVerticalOrderRec(root);
		System.out.println();
		getVerticalSum(root);
	}

	static void printVerticalOrderRec(Node node) {
		if (node == null)
			return;
		int hd = 0;
		TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
		getVerticalOrder(node, hd, m);
		System.out.println(m.values());
		for (Map.Entry<Integer, ArrayList<Integer>> e : m.entrySet())
			System.out.print(e.getValue()+" ");
	}

	static void getVerticalOrder(Node node, int hd, TreeMap<Integer, ArrayList<Integer>> m) {
		if (node == null)
			return;
		if (m.get(hd) == null) {
			ArrayList<Integer> a = new ArrayList();
			a.add(node.data);
			m.put(hd, a);
		} else {
			ArrayList ar = m.get(hd);
			ar.add(node.data);
		}
		getVerticalOrder(node.left, hd - 1, m);
		getVerticalOrder(node.right, hd + 1, m);
	}

	static void getVerticalSum(Node node) {
		if (node == null)
			return;
		Map<Integer, Integer> m = new TreeMap<>();
		verticalSum(node, 0, m);

		if(m != null)
		System.out.println(m.values());
	}

	static void verticalSum(Node node, int d, Map<Integer, Integer> m){
		if (node == null)
			return;
		int s = (m.get(d) == null) ? 0 : m.get(d);
		m.put(d, s+node.data);

		verticalSum(node.left, d-1, m);
		verticalSum(node.right, d+1, m);
	}

	static boolean recursiveSearch(Node node, int key){
		if(node==null)
			return false;
		if(node.data == key)
			return true;
		return (recursiveSearch(node.left, key) || recursiveSearch(node.right, key));
	}

	static boolean Search(Node node, int key){
		if(node==null)
			return false;

		Queue<Node> q=new LinkedList<>();
		q.add(node);

		while(!q.isEmpty()){
			Node temp= q.remove();
			if(node.data == key)
				return true;
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
		return false;
	}
}