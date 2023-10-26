package DataStructures;

import java.util.*;
import java.util.LinkedList;

public class NewTreeViews {
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
		System.out.println("Top View - "); topView(root);
		System.out.println(tm);
		System.out.println("Bottom View - "); bottomView(root,0);
		System.out.println(tm_);
		System.out.println("Left View - " + leftView(root));
		System.out.print("Recursive Left View - "); recursiveLeftView(root);
		System.out.println("\nRight View - " + rightView(root));
		System.out.print("Recursive Right View - "); recursiveRightView(root);
		//System.out.println("\nVertical Order - "); verticalOrder(root, 2);
		//System.out.println("\nVertical Order Of Tree"); printVerticalOrder(root);
	}

	static Map<Integer, Integer> mp1 = new TreeMap<>();
	static Map<Integer, Integer> mp2 = new TreeMap<>();

	static ArrayList<Integer> leftView(Node node) {
		if(node ==null)
			return null;
		findLeft(node,0);
		return new ArrayList<Integer>(mp1.values());
	}

	static void findLeft(Node node,int level){
		if(node==null)
			return;
		if(!mp1.containsKey(level))
			mp1.put(level,node.data);
		//else
		//	mp1.replace(level,node.data);
		findLeft(node.left,level+1);
		findLeft(node.right,level+1);
	}

	static void recursiveLeftView(Node root)
	{
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int n = queue.size(); 	// number of nodes at current level
			for (int i = 1; i <= n; i++) {
				Node temp = queue.poll();
				if (i == 1)
					System.out.print(temp.data + " ");
				if (temp.left != null)
					queue.add(temp.left);
				if (temp.right != null)
					queue.add(temp.right);
			}
		}
	}

	static ArrayList<Integer> rightView(Node node) {
		if (node == null)
			return null;
		findRight(node, 0);
		return new ArrayList<Integer>(mp2.values());
	}

	static void findRight(Node node, int level) {
		if (node == null)
			return;
		if (!mp2.containsKey(level))
			mp2.put(level, node.data);
		//else
		//	mp2.replace(level, node.data);
		findRight(node.right, level + 1);
		findRight(node.left, level + 1);
	}

	static void recursiveRightView(Node root) {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int n = queue.size();    // number of nodes at current level
			for (int i = 1; i <= n; i++) {
				Node temp = queue.poll();
				if (i == 1)
					System.out.print(temp.data + " ");
				if (temp.right != null)
					queue.add(temp.right);
				if (temp.left != null)
					queue.add(temp.left);
			}
		}
	}
	/*
	static TreeMap<Integer, Integer> tm = new TreeMap<>();
	static void topView(Node root, int height){
		if(root==null)
			return;
		if(tm.get(height)==null)
			tm.put(height,root.data);
		topView(root.left,height-1);
		topView(root.right,height+1);
	}*/
	static ArrayList<Integer> topView(Node root)
	{
		ArrayList<Integer> ar = new ArrayList<>();
		topViewHelp(root, 0);
		for(Map.Entry<Integer,Integer> e:tm.entrySet())
			ar.add(e.getValue());
		return ar;
	}

	static TreeMap<Integer, Integer> tm = new TreeMap<>();
	static void topViewHelp(Node root, int height){
		if(root==null)
			return;
		if(tm.get(height)==null)
			tm.put(height,root.data);
		topViewHelp(root.left,height-1);
		topViewHelp(root.right,height+1);
	}

	static TreeMap<Integer, Integer> tm_ = new TreeMap<>();
	static void bottomView(Node root, int height){
		if(root==null)
			return;
		tm_.put(height,root.data);
		bottomView(root.left,height-1);
		bottomView(root.right,height+1);
	}
}