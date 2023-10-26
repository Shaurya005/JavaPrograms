package DataStructures;

public class TreeFromPreOrderInOrder {
	static int preIndex;

	 static Node buildTree(int preOrderArray[], int inOrderArray[],int start, int end){
		if(start>end)
			return null;
		Node node = new Node(preOrderArray[preIndex++]); // A static method/variable can be accessed inside a non-static method but a non-static method/variable can't be inside static method.
		if(start == end)
			return node;
		int inOrderIndex = getInorderIndex(node.data, inOrderArray,start,end);

		node.left = buildTree(preOrderArray, inOrderArray,start, inOrderIndex -1);
		node.right = buildTree(preOrderArray, inOrderArray,inOrderIndex +1, end);
		return node;
	}
	static int postIndex = 4;
	static Node buildTree_(int postOrderArray[], int inOrderArray[],int start, int end){
		if(start>end)
			return null;
		Node node = new Node(postOrderArray[postIndex--]); // A static method/variable can be accessed inside a non-static method but a non-static method/variable can't be inside static method.
		if(start == end)
			return node;
		int inOrderIndex = getInorderIndex(node.data, inOrderArray,start,end);

		node.right = buildTree_(postOrderArray, inOrderArray,inOrderIndex +1, end);
		node.left = buildTree_(postOrderArray, inOrderArray,start, inOrderIndex -1);
		return node;
	}

	static int getInorderIndex(int val, int in[], int start, int end){
	 	for(int i=start;i<=end;i++) {
		    if (in[i] == val)
			    return i;
	    }
	    return -1;
	    }

	public static void main(String a[]) {
		Node root1,root2;
		int preOrderArray[] = {2,4,7,3,8};
		int inOrderArray[] = {7,4,3,2,8};
		int postOrderArray[] = {7,3,4,8,2};
		root1 = buildTree(preOrderArray, inOrderArray, 0, inOrderArray.length - 1);
		root2 = buildTree_(postOrderArray, inOrderArray, 0, inOrderArray.length - 1);
		BST_Operations.postOrder(root1);
		System.out.println();
		BST_Operations.preOrder(root2);
	}
}
