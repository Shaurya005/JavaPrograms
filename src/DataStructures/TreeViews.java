package DataStructures;

import java.util.*;
import java.util.LinkedList;

class Node1{
	int data;
	Node1 left;
	Node1 right;
	int height;
	Node1(int data){
		left=null; right=null;
		this.data=data;
	}
}

public class TreeViews {
	public static void main(String s[]) {
		Node1 root = new Node1(7);
		root.left = new Node1(2);
		root.left.right = new Node1(3);
		root.left.right.left = new Node1(1);
		root.left.right.left.left = new Node1(12);
		root.right = new Node1(5);
		root.right.right = new Node1(8);
		root.right.left = new Node1(6);
		root.right.left.right = new Node1(11);
		root.right.right.right = new Node1(9);
		// Initially all node have by default height value 0.
		System.out.println("Top View - "); topView(root);
		System.out.println("Bottom View - "); bottomView(root);
		System.out.println("\nLeft View - "); leftView(root, 0);
		max = 0;
		System.out.println("\nRight View"); rightView(root, 0);
		System.out.println("\nVertical Order - "); verticalOrder(root, 2);
		System.out.println("\nVertical Order Of Tree"); printVerticalOrder(root);
	}

	static void topView(Node1 node) {
		if (node == null) {
			return;
		}
		TreeMap<Integer, Integer> m = new TreeMap<>();
		Queue<Node1> q = new LinkedList<>();
		q.add(node);
		while (!q.isEmpty()) {
			Node1 temp = q.remove();
			int h = temp.height;

			if (m.get(h) == null)
				m.put(h, temp.data);
			if (temp.left != null) {
				temp.left.height = h - 1;
				q.add(temp.left);
			}
			if (temp.right != null) {
				temp.right.height = h + 1;
				q.add(temp.right);
			}
		}
		System.out.println(m.values());
	}

	static void bottomView(Node1 node) {
		if (node == null) {
			return;
		}
		TreeMap<Integer, Integer> m = new TreeMap<>();
		Queue<Node1> q = new LinkedList<>();
		q.add(node);
		while (!q.isEmpty()) {
			Node1 temp = q.remove();
			int h = temp.height;

			m.put(h, temp.data);

			if (temp.left != null) {
				temp.left.height = h - 1;
				q.add(temp.left);
			}
			if (temp.right != null) {
				temp.right.height = h + 1;
				q.add(temp.right);
			}
		}
		System.out.println(m.values());
	}

	static int max; // It is by default initialised to 0.

	static void leftView(Node1 node, int level) {
		if (node == null)
			return;
		if (level == max) {
			System.out.print(node.data + " ");
			max++;
		}
		leftView(node.left, level + 1);
		leftView(node.right, level + 1);
	}

	static void rightView(Node1 node, int level) {
		if (node == null)
			return;
		if (level == max) {
			System.out.print(node.data + " ");
			max++;
		}
		rightView(node.right, level + 1);
		rightView(node.left, level + 1);
	}

	static void verticalOrder(Node1 node, int i) {
		if (node == null)
			return;
		Queue<Node1> q = new LinkedList();
		q.add(node);
		while (!q.isEmpty()) {
			Node1 n = q.remove();
			int h = n.height;
			if (h == i)
				System.out.println(n.data);
			if (n.left != null) {
				n.left.height = h - 1;
				q.add(n.left);
			}
			if (n.right != null) {
				n.right.height = h + 1;
				q.add(n.right);
			}
		}
	}

	static void printVerticalOrder(Node1 node) {
		if (node == null)
			return;
		TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
		Queue<Node1> q = new LinkedList();
		q.add(node);
		while (!q.isEmpty()) {
			Node1 n = q.remove();
			int h = n.height;
			if (tm.get(h) == null) {
				ArrayList<Integer> a = new ArrayList();
				a.add(n.data);
				tm.put(h, a);
			} else {
				ArrayList ar = tm.get(h);
				ar.add(n.data);
			}
			if (n.left != null) {
				n.left.height = h - 1;
				q.add(n.left);
			}
			if (n.right != null) {
				n.right.height = h + 1;
				q.add(n.right);
			}
		}
		for (Map.Entry<Integer, ArrayList<Integer>> e : tm.entrySet())
			System.out.print(" " + e.getValue());
	}
}