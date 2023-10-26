package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class isCompleteTree {
	public static void main(String a[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		System.out.println(isCompleteBT(root));
		System.out.println(isCompleteTree(root));
	}
	/*
	The method of level order traversal can be easily modified to check whether a tree is Complete or not. To understand the approach, let us first define the term ‘Full Node’.
	A node is ‘Full Node’ if both left and right children are not empty (or not NULL).
	The approach is to do a level order traversal starting from the root. In the traversal, once a node is found which is NOT a Full Node, all the following nodes must be leaf nodes.
	Also, one more thing needs to be checked: If a node has an empty left child, then the right child must be empty.
	 */
	static boolean isCompleteBT(Node root)
	{
		if(root == null)
			return true;
		Queue<Node> queue =new LinkedList<>();
		boolean flag = false;
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp_node = queue.remove();
			if (temp_node.left != null) {
				if (flag == true) // If we have seen a non full node, and we see a node with non-empty left child, then the given tree is not a complete Binary Tree.
					return false;
				queue.add(temp_node.left);
			}
			else
				flag = true;
			if (temp_node.right != null) {
				if (flag == true) // If we have seen a non full node, and we see a node with non-empty right child, then the given tree is not a complete Binary Tree.
					return false;
				queue.add(temp_node.right);
			}
			else
				flag = true;
		}
		return true;
	}

	/*
	Method 2 :  A more simple approach would be to check whether the NULL Node encountered is the last node of the Binary Tree. If the null node encountered in the
	binary tree is the last node then it is a complete binary tree and if there exists a valid node even after encountering a null node then the tree is not a complete binary tree.
	 */
	static boolean isCompleteTree(Node root)
	{
		if (root == null)
			return true;
		Queue<Node> q =new LinkedList<>();
		q.add(root);
		boolean flag = false;

		while(!q.isEmpty())
		{
			Node temp =q.remove();
			if(temp == null)
				flag = true; // If we have seen a NULL node, we set the flag to true.
			else{
				if(flag == true) // If that NULL node is not the last node then return false.
					return false;
				// Push both nodes even if there are null
				q.add(temp.left) ;
				q.add(temp.right) ;
			}
		}
		return true;
	}
}