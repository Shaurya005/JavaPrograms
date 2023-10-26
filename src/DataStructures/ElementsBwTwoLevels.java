package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class ElementsBwTwoLevels {
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
		root.right.right.left = new Node(4);
		root.right.right.right = new Node(9);
		BtwTwoLevels(root, 1, 3);
		System.out.println("\n"+getMaxWidth(root));
		System.out.println(getWidthOfLevel(root, 3));

		Node root2 = new Node(7);
		root2.right = new Node(2);
		root2.right.left = new Node(3);
		root2.right.left.right = new Node(1);
		root2.right.left.right.right = new Node(12);
		root2.left = new Node(5);
		root2.left.left = new Node(8);
		root2.left.right = new Node(6);
		root2.left.right.left = new Node(11);
		root2.left.left.right = new Node(4);
		root2.left.left.left = new Node(9);
		System.out.println(ifMirrorTree(root, root2));
		System.out.println(ifStructMirrorTree(root, root2));
	}

	static void BtwTwoLevels(Node node, int min, int max) {
		if (node == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		int l = 1;

		while (true) {
			int size = q.size();
			if (size == 0 || l > max)
				break;
			while (size > 0) {
				Node t = q.remove();
				if (l >= min && l <= max)
					System.out.print(t.data + " ");
				if (t.left != null)
					q.add(t.left);
				if (t.right != null)
					q.add(t.right);
				size--;
			}
			l++;
		}
	}

	static int getMaxWidth(Node node) {
		if (node == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		int max = 1;

		while (true) {
			int size = q.size();
			if (size == 0)
				break;
			if (size > max)
				max = size;
			while (size > 0) {
				Node t = q.remove();
				if (t.left != null)
					q.add(t.left);
				if (t.right != null)
					q.add(t.right);
				size--;
			}
		}
		return max;
	}
	
	static boolean ifMirrorTree(Node node1, Node node2){
		if(node1==null && node2==null)
			return true;
		if(node1==null || node2==null)
			return false;
		return (node1.data == node2.data) && ifMirrorTree(node1.left, node2.right) && ifMirrorTree(node1.right, node2.left);
	}

	static boolean ifStructMirrorTree(Node node1, Node node2){
		if(node1==null && node2==null)
			return true;
		if(node1==null || node2==null)
			return false;
		return ifStructMirrorTree(node1.left, node2.right) && ifStructMirrorTree(node1.right, node2.left);
	}

	static int getWidthOfLevel(Node node, int level){
		if(node == null)
			return 0;
		if(level == 1)
			return 1;
		return getWidthOfLevel(node.left,level-1) + getWidthOfLevel(node.right,level-1);
	}

	static void doubleTree(Node node){
		if(node == null)
			return;

		doubleTree(node.left);
		doubleTree(node.right);

		Node newNode = new Node(node.data);
		newNode.left = node.left;
		node.left = newNode;
	}
}