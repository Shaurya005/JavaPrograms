package DataStructures;

import java.util.HashMap;
import java.util.Map;

// Java program to find lowest common ancestor using parent pointer
// A tree Node2
class Node2
{
	int key;
	Node2 left, right, parent;
	Node2(int key)
	{
		this.key = key;
		left = right = parent = null;
	}
}

class BinaryTree2
{
	Node2 root, n1, n2, lca;

	// A utility function to insert a new Node2 with given key in Binary Search Tree. 
	Node2 insert(Node2 node, int key)
	{
		/* If the tree is empty, return a new Node2 */
		if (node == null)
			return new Node2(key);

		/* Otherwise, recur down the tree */
		if (key < node.key)
		{
			node.left = insert(node.left, key);
			node.left.parent = node;
		}
		else if (key > node.key)
		{
			node.right = insert(node.right, key);
			node.right.parent = node;
		}

		/* return the (unchanged) node pointer */
		return node;
	}
	
	Node2 LCA(Node2 n1, Node2 n2)
	{
		// Create a map to store ancestors of n1
		Map<Node2, Boolean> ancestors = new HashMap<Node2, Boolean>();

		// Insert n1 and all its ancestors in map
		while (n1 != null)
		{
			ancestors.put(n1, Boolean.TRUE);
			n1 = n1.parent;
		}
		// Check if n2 or any of its ancestors is in map.
		while (n2 != null)
		{
			if (ancestors.containsKey(n2))
				return n2;
			n2 = n2.parent;
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		BinaryTree2 tree = new BinaryTree2();
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 8);
		tree.root = tree.insert(tree.root, 22);
		tree.root = tree.insert(tree.root, 4);
		tree.root = tree.insert(tree.root, 12);
		tree.root = tree.insert(tree.root, 10);
		tree.root = tree.insert(tree.root, 14);

		tree.n1 = tree.root.left.right.left;
		tree.n2 = tree.root.left;
		tree.lca = tree.LCA(tree.n1, tree.n2);
		System.out.println("LCA of " + tree.n1.key + " and " + tree.n2.key + " is " + tree.lca.key);
	}
}