package DataStructures;

public class CheckIfSumTree {
	public static void main(String a[ ]){
		Node root=new Node(84);
		root.left=new Node(31);
		root.left.left=new Node(8);
		root.left.left.left=new Node(2);
		root.left.left.right=new Node(6);
		root.left.right=new Node(15);
		root.right=new Node(11);
		root.right.left=new Node(5);
		root.right.right=new Node(3);
		root.right.right.left=new Node(2);
		root.right.right.right=new Node(1);
		System.out.println(isSumNaive(root));
		System.out.println(ifSumTree(root));
	}

	static boolean isSumNaive(Node root)
	{
		// Your code here
		if(root==null || (root.left==null && root.right==null))
			return true;
		int sum;
		sum = sum(root.left)+sum(root.right);
		if(sum==root.data)
			return isSumNaive(root.left) && isSumNaive(root.right);
		return false;
	}

	static int sum(Node root){
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return root.data;
		return root.data+sum(root.left)+sum(root.right);
	}

	static boolean ifSumTree(Node node) {
		int leftSum; int rightSum;
		if (node == null || ifLeafNode(node))
			return true;

		if (ifSumTree(node.left) && ifSumTree(node.right)) {
			if (node.left == null)
				leftSum = 0;
			else if (ifLeafNode(node.left))
				leftSum = node.left.data;
			else
				leftSum = 2 * (node.left.data);

			if (node.right == null)
				rightSum = 0;
			else if (ifLeafNode(node.right))
				rightSum = node.right.data;
			else
				rightSum = 2 * (node.right.data);

			if ((node.data == rightSum + leftSum))
				return true;
			else
				return false;
		}
		return false;
	}

	static boolean ifLeafNode(Node node) {
		if (node == null)
			return false;
		if (node.left == null && node.right == null)
			return true;
		return false;
	}
}