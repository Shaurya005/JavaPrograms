package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LCATree {
	public static void main(String args[]) {
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);

		System.out.println(LCA(root, 10, 14).data);
		System.out.println(LCA(root, 8, 14).data);
		System.out.println(LCA(root, 10, 20).data);

		System.out.println(LCAIterative(root, 10, 14).data);
		System.out.println(LCAIterative(root, 8, 14).data);
		System.out.println(LCAIterative(root, 10, 20).data);

		root = new Node(20);
		root.left = new Node(28);
		root.right = new Node(22);
		root.left.left = new Node(4);
		root.left.right = new Node(32);
		root.left.right.left = new Node(8);
		root.left.right.right = new Node(24);
		System.out.println(LCABinaryTree(root, 4, 24));
	}

	static Node LCA(Node root, int n1, int n2) {
		if (root == null)
			return null;
		if (root.data > n1 && root.data > n2)
			return LCA(root.left, n1, n2);
		if (root.data < n1 && root.data < n2)
			return LCA(root.right, n1, n2);
		return root;
	}

	static Node LCAIterative(Node root, int n1, int n2) {
		if (root == null)
			return null;
		while (root != null) {
			if (root.data > n1 && root.data > n2)
				root = root.left;
			if (root.data < n1 && root.data < n2)
				root = root.right;
			else
				break;
		}
		return root;
	}

	static Node LCABinaryTree(Node root, int n1, int n2)
	{
		List<Node> path1 = new ArrayList<>();
		List<Node> path2 = new ArrayList<>();
		if (!findPath(root, n1, path1) || !findPath(root, n2, path2))
			return null;
		int i;
		for (i = 0; i < path1.size() && i < path2.size(); i++)
			if (!path1.get(i).equals(path2.get(i)))
				break;
		return path1.get(i-1);
	}

	static boolean findPath(Node root, int n, List<Node> path)
	{
		if (root == null)
			return false;
		path.add(root); // Store this node. The node will be removed if not in path from root to n.
		if (root.data == n)
			return true;
		if (root.left != null && findPath(root.left, n, path))
			return true;
		if (root.right != null && findPath(root.right, n, path))
			return true;
		path.remove(path.size()-1); // If not present in subtree rooted with root, remove root from path[] and return false
		return false;
	}

	Node findLCA(Node node, int n1, int n2)
	{
		if (node == null)
			return null;

		// If either n1 or n2 matches with root's key, report the presence by returning root (Note that if a key is ancestor of other, then the ancestor key becomes LCA.
		if (node.data == n1 || node.data == n2)
			return node;

		// Look for keys in left and right subtrees
		Node left_lca = findLCA(node.left, n1, n2);
		Node right_lca = findLCA(node.right, n1, n2);

		// If both of the above calls return Non-NULL, then one key is present in one subtree and other is present in other, So this node is the LCA.
		if (left_lca!=null && right_lca!=null)
			return node;
		Queue<Integer> q= new LinkedList<>();
		((LinkedList<Integer>) q).removeLast();
		// Otherwise check if left subtree or right subtree is LCA
		return (left_lca != null) ? left_lca : right_lca;
	}
}