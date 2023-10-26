package DataStructures;

import java.util.*;
import java.util.LinkedList;

class BinaryTree
{
	static class Node
	{
		int data;
		Node left, right;
		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	Node root;
	void iterativeInOrder()
	{
		if (root == null)
			return;
		Stack<Node> s = new Stack<>();
		Node curr = root;
		while (curr != null || s.size() > 0)
		{
            /* Reach the left most Node of the curr Node */
			while (curr !=  null)
			{
                /* place pointer to a tree node on the stack before traversing the node's left subtree */
				s.push(curr);
				curr = curr.left;
			}
			/* Current must be NULL at this point */
			curr = s.pop();
			System.out.print(curr.data + " ");
            /* We have visited the node and its left subtree. Now, it's right subtree's turn */
			curr = curr.right;
		}
	}

	void iterativelevelOrder(){
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp= ((LinkedList<Node>) q).pop();
			System.out.print(temp.data+" ");
			if (temp.left != null)
			q.add(temp.left);
			if (temp.right != null)
			q.add(temp.right);
		}
	}

	void iterativePreOrder()
	{
		if (root == null) {
			return;
		}
		Stack<Node> nodeStack = new Stack<>();
		nodeStack.push(root);
        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
		while (nodeStack.empty() == false) {
			Node mynode = nodeStack.pop();
			System.out.print(mynode.data + " ");
			if (mynode.right != null) {
				nodeStack.push(mynode.right);
			}
			if (mynode.left != null) {
				nodeStack.push(mynode.left);
			}
		}
	}

	void iterativePostOrder()
	{
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		if (root == null)
			return;
		s1.push(root);

		// Run while first stack is not empty
		while (!s1.isEmpty()) {
			// Pop an item from s1 and push it to s2
			Node temp = s1.pop();
			s2.push(temp);

			// Push left and right children of removed item to s1
			if (temp.left != null)
				s1.push(temp.left);
			if (temp.right != null)
				s1.push(temp.right);
		}
		while (!s2.isEmpty()) {
			Node temp = s2.pop();
			System.out.print(temp.data + " ");
		}
	}

	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.right=new Node(6);
		tree.iterativeInOrder();
		System.out.println();
		tree.iterativePreOrder();
		System.out.println();
		tree.iterativePostOrder();
		System.out.println();
		tree.iterativelevelOrder();
	}
}