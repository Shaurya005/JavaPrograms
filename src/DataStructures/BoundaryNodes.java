package DataStructures;

public class BoundaryNodes {
	public static void main(String arg[]){
		Node root=new Node(7);
		root.left=new Node(2);
		root.left.right=new Node(3);
		root.left.right.left=new Node(1);
		root.left.right.left.left = new Node(12);
		root.right=new Node(5);
		root.right.right = new Node(8);
		root.right.left= new Node(6);
		root.right.left.right= new Node(11);
		root.right.right.right = new Node(9);
		root.right.right.right.left = new Node(20);
		root.right.right.right.left.right = new Node(21);
		boundaryNodes(root);
	}

	static void boundaryNodes(Node node){
		if(node==null)
			return;
		System.out.println(node.data);

		printLeftView(node.left);

		printLeaves(node.left);
		printLeaves(node.right);

		printRightView(node.right);
	}

	static void printLeftView(Node node){
		if(node==null)
			return;

		if(node.left!=null) {
			System.out.println(node.data);
			printLeftView(node.left);
		}
		else if(node.right!=null){
			System.out.println(node.data);
			printLeftView(node.right);
		}
	}

	static void printLeaves(Node node){
		if(node==null)
			return;
		if(node.left==null && node.right==null)
			System.out.println(node.data);
		printLeaves(node.left);
		printLeaves(node.right);
	}

	static void printRightView(Node node){
		if(node==null)
			return;
		if(node.right!=null) {
			printRightView(node.right);
			System.out.println(node.data);
		}
		else if(node.left!=null) {
			printRightView(node.left);
			System.out.println(node.data);
		}
	}
}
