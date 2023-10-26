package DataStructures;

import java.util.Arrays;
class BalancedBST
{
	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	public static Node convert(int[] keys, int low, int high, Node root)
	{
		if (low > high) {
			return root;
		}
		int mid = (low + high) / 2;
		root = new Node(keys[mid]);

		// left subtree of the root will be formed by keys less than middle element
		root.left = convert(keys, low, mid - 1, root.left);

		// right subtree of the root will be formed by keys more than the middle element
		root.right = convert(keys, mid + 1, high, root.right);
		return root;
	}

	public static void main(String[] args)
	{
		int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
		Arrays.sort(keys);
		Node root =  convert(keys, 0, keys.length - 1, null);
		inorder(root);
	}
}