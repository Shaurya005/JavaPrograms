package DataStructures;

import java.util.*;
	public class BST_Operations {
		public static void main(String a[]) {
			Node root = null;
			root = create(root);
			preOrder(root); System.out.println();
			inOrder(root); System.out.println();
			postOrder(root); System.out.println();
			System.out.println("Total number of nodes: " + numberOfnodes(root));
			System.out.println("Largest node is: "+findLargestElement(root).data);
			root=delete(root,54);
			inOrder(root); System.out.println();
			root=deleteRec(root,56);
			inOrder(root); System.out.println();
			System.out.println(heightOfNode(root));
			System.out.println("Total Number of Leaf Nodes "+numberOfLeafNodes(root));
			printAtGivenLevel(root,3);
			levelOrder(root);
		}

		static Node create(Node root) {
			System.out.println("Enter the first data to enter");
			Scanner sc = new Scanner(System.in);
			int data = sc.nextInt();
			while (data != -1) {
				if (root == null)
					root = new Node(data);
				else {
					Node preptr = null, ptr =   root;
					while (ptr != null) {
						preptr = ptr;
						if (data <= ptr.data)
							ptr = ptr.left;
						else
							ptr = ptr.right;
					}
					if (data <= preptr.data)
						preptr.left = new Node(data);
					else
						preptr.right = new Node(data);
				}
				System.out.println("Enter the next data");
				data = sc.nextInt();
			}
			return root;
		}

		static Node delete(Node root,int val){
			if(root==null)
				return root;
			if(root.data==val) {
				if (root.left == null && root.right == null)
					return null;
				else if (root.left == null)
					return root.right;
				else if (root.right == null)
					return root.left;
			     else{
					Node largest=findLargestElement(root.left);
					root.data=largest.data;
					delete(root.left, largest.data);
					return root;
				}
			}
			Node parent=root;
			Node node = root;
			while(node!=null){
				if(val<node.data){
					parent=node; node=node.left;
				}
				else if(val>node.data){
					parent=node; node=node.right;
				}
				else{
					if(node.left==null && node.right==null){
						if(parent.left==node)
							parent.left=null;
						else
							parent.right=null;
					}
					else if(node.left==null){
						if(parent.left==node)
							parent.left=node.right;
						else
							parent.right=node.right;
					}
					else if(node.right==null){
						if(parent.left==node)
							parent.left=node.left;
						else
							parent.right=node.left;
					}
					else{
						Node temp=findLargestElement(node.left);
						node.data=temp.data;
						node.left=delete(node.left,temp.data);
					}
					break;
				}
			}
			return root;
		}

		static Node deleteRec(Node root, int key)
		{
			if (root == null)
				return root;

			if (key < root.data)
				root.left = deleteRec(root.left, key);
			else if (key > root.data)
				root.right = deleteRec(root.right, key);
			else {
				// node with only one child or no child
				if (root.left == null)
					return root.right;
				else if (root.right == null)
					return root.left;

				root.data = findLargestElement(root.left).data;
				root.left = deleteRec(root.left, root.data);
			}
			return root;
		}

		static void preOrder(Node root) {
			if (root != null) {
				System.out.print(root.data + " ");
				preOrder(root.left);
				preOrder(root.right);
			}
		}

		static void inOrder(Node root) {
			if (root != null) {
				inOrder(root.left);
				System.out.print(root.data + " ");
				inOrder(root.right);
			}
		}

		static void postOrder(Node root) {
			if (root != null) {
				postOrder(root.left);
				postOrder(root.right);
				System.out.print(root.data + " ");
			}
		}

		static void levelOrder(Node root){
			if(root==null)
				return;
			int h=heightOfNode(root);
			for(int i=0;i<=h;i++){
				printAtGivenLevel(root,i+1);
			}
		}

		static Node findLargestElement(Node root) {
			if (root.right == null)
				return root;
			else
				return findLargestElement(root.right);
		}

		static int numberOfnodes(Node root) {
			if (root == null)
				return 0;
			return numberOfnodes(root.left) + numberOfnodes(root.right) + 1;
		}

		static int numberOfLeafNodes(Node root){
			if(root==null)
				return 0;
			if(root.left==null && root.right==null)
				return 1;
			return numberOfLeafNodes(root.left) + numberOfLeafNodes(root.right);
		}

		static void printAtGivenLevel(Node node,int level){
			if(node==null)
				return;
			if(level==1){
				System.out.print(node.data+" ");
			    return;
			}
			printAtGivenLevel(node.left,level-1);
			printAtGivenLevel(node.right,level-1);
		}

		static int heightOfNode(Node node){
			if(node==null)
				return -1;
			return Math.max(heightOfNode(node.left), heightOfNode(node.right))+1;
		}
}