package DataStructures;

public class MirrorBinaryTree {
	public static void main(String a[ ]){

		Node root=new Node(7);
		root.left=new Node(5);
		root.right=new Node(2);
		root.left.right=new Node(1);
		root.left.right.left=new Node(6);
		root.right.right=new Node(3);
		preOrder(root);
		System.out.println();
		//mirrorTree(root);
		//preOrder(root);

		Node root2=new Node(7);
		root2.left=new Node(5);
		root2.right=new Node(2);
		root2.left.right=new Node(1);
		root2.left.right.left=new Node(6);
		root2.right.right=new Node(3);
		System.out.println(isIdentical(root,root2));
		System.out.println(levelOfNode(root2,6,1));
	}

	static void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	static void mirrorTree(Node node){
		if(node==null)
			return;
		Node temp=node.left;
		node.left=node.right;
		node.right=temp;
		mirrorTree(node.left);
		mirrorTree(node.right);
	}

	static boolean isIdentical(Node node1,Node node2){
		if(node1==null && node2==null)
			return true;
		if(node1==null || node2==null)
			return false;
		return node1.data==node2.data && isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
	}

	static int levelOfNode(Node root, int data,int level){
		if(root==null)
			return -1;
		if(root.data==data)
			return level;
		int l;
		l=levelOfNode(root.left,data,level+1);
		if(l==-1)
			l=levelOfNode(root.right,data,level+1);
		return l;
	}
}