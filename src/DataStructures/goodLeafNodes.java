package DataStructures;

import java.util.*;
public class goodLeafNodes {
	public static void main(String args[]) {
		Node root=new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		System.out.println(countPairs(root,3));
	}

	static ArrayList<Node> l;
	static int countPairs(Node root, int distance) {
		l=new ArrayList<>();
		leafNodes(root);
		System.out.println(l.get(0).data+" "+l.get(1).data);
		int count = 0;
		for(int i=0;i<l.size();i++)
			for(int j=i+1;j<l.size();j++){
				int d = getDistance(root,l.get(i).data,l.get(j).data);
				System.out.println(d);
				if(d<=distance)
					count++;
			}
		return count;
	}

	static ArrayList<Integer> path1;
	static ArrayList<Integer> path2;
	static int getDistance(Node root,int a,int b){
		path1=new ArrayList<>();
		path2=new ArrayList<>();
		getPath(path1,root,a);
		getPath(path2,root,b);
		System.out.println(path1);
		System.out.println(path2);
		int i=0;
		int p1 = path1.size(), p2 = path2.size();
		while(i<p1 && i<p2){
			if(path1.get(i)!=path2.get(i))
				break;
			i++;
		}
		return p1-i+p2-i;
	}

	static boolean getPath(ArrayList<Integer> path,Node root,int a){
		if(root==null)
			return false;
		path.add(root.data);
		if(root.data==a)
			return true;
		boolean res = getPath(path,root.left,a) || getPath(path,root.right,a);
		if(res!=true)
			path.remove(path.size()-1);
		return res;
	}

	static void leafNodes(Node root){
		if(root==null)
			return;
		if(root.left==null && root.right==null){
			l.add(root);
			return;
		}
		leafNodes(root.left);
		leafNodes(root.right);
	}
}