package DataStructures;

public class CheckIfBST
{
		public static void main(String a[]) {
			Node root = new Node(7);
			root.left = new Node(2);
			root.left.right = new Node(3);
			root.left.right.right = new Node(5);
			root.right = new Node(10);
			root.right.right = new Node(12);
			root.right.left = new Node(9);
			System.out.println(isBST1(root));
			System.out.println(isBST2(root));
			System.out.println(isBST3(root,null,null));
			System.out.println(isBST4(root,null));
		}

	static boolean isBST1(Node node)
	{
		if (node==null)
			return true;
		if (node.left!=null && (maxValue(node.left) >= node.data))
			return false;
		if (node.right!=null && minValue(node.right) <= node.data)
			return false;
		if (!isBST1(node.left) || !isBST1(node.right))
			return false;
		return true;
	}

	static int maxValue(Node root)
	{
		if(root==null)
			return Integer.MIN_VALUE;
		if(root.left==null && root.right==null)
			return root.data;
		return Math.max(maxValue(root.left),maxValue(root.right));
	}

	static int minValue(Node root)
	{
		if(root==null)
			return Integer.MAX_VALUE;
		if(root.left==null && root.right==null)
			return root.data;
		return Math.min(minValue(root.left),minValue(root.right));
	}
	/*
	Method above runs slowly since it traverses over some parts of the tree many times. A better solution looks at each node only once.
	The trick is to write a utility helper function isBSTUtil(Node node, int min, int max) that traverses down the tree keeping track of the narrowing min and max allowed
	values as it goes, looking at each node only once. The initial values for min and max should be INT_MIN and INT_MAX — they narrow from there.
	 */
	static boolean isBST2(Node root)  {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/* Returns true if the given tree is a BST and its values are >= min and <= max. */
	static boolean isBSTUtil(Node node, int min, int max)
	{
		if (node == null)
			return true;
		if (node.data < min || node.data > max)
			return false;
        /* Otherwise check the subtrees recursively tightening the min/max constraints. Allow only distinct values. */
		return (isBSTUtil(node.left, min, node.data-1) && isBSTUtil(node.right, node.data+1, max));
	}

	// We can simplify above method using NULL pointers instead of INT_MIN and INT_MAX values.
	static boolean isBST3(Node root, Node l, Node r)
	{
		if (root == null)
			return true;
		if (l != null && root.data <= l.data)
			return false;
		if (r != null && root.data >= r.data)
			return false;
		return isBST3(root.left, l, root) && isBST3(root.right, root, r);
	}
	/*
	1) Do In-Order Traversal of the given tree and store the result in a temp array.
	2) This method assumes that there are no duplicate values in the tree
	3) Check if the temp array is sorted in ascending order, if it is, then the tree is BST.
	Time Complexity: O(n)
	We can avoid the use of a Auxiliary Array. While doing In-Order traversal, we can keep track of previously visited node.
	If the value of the currently visited node is less than the previous value, then tree is not BST.
	*/
	static boolean isBST4(Node node, Node prev)
	{
		// traverse the tree in inorder fashion and keep a track of previous node
		if (node != null)
		{
			if (!isBST4(node.left, prev))
				return false;
			// allows only distinct values node
			if (prev != null && node.data <= prev.data )
				return false;
			prev = node;
			return isBST4(node.right,prev);
		}
		return true;
	}
}