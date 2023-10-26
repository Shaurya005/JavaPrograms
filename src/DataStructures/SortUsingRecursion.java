package DataStructures;

import java.util.ArrayList;
import java.util.Stack;

public class SortUsingRecursion {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(2);
		ar.add(1);
		ar.add(5);
		ar.add(10);
		ar.add(7);
		ar.add(4);
		sort(ar);
		System.out.println(ar);
		
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(5);
		st.push(1);
		st.push(7);
		st.push(4);
		sortStack(st);
		System.out.println(st);

		deleteMid(st,st.size()/2+1);
		System.out.println(st);
	}

	static void sort(ArrayList<Integer> ar){
		if(ar.size()==1)
			return;
		int a = ar.get(ar.size()-1);
		ar.remove(ar.size()-1);
		sort(ar);
		insert(ar,a);
	}

	static void insert(ArrayList<Integer> ar, int a){
		if(ar.size()==0 || ar.get(ar.size()-1)<=a) {
			ar.add(a);
			return;
		}
		int temp = ar.get(ar.size()-1);
		ar.remove(ar.size()-1);
		insert(ar,a);
		ar.add(temp);
	}
	
	static void sortStack(Stack<Integer> st){
		if(st.size()==1)
			return;
		int a = st.pop();
		sortStack(st);
		insertInStack(st,a);
	}
	
	static void insertInStack(Stack<Integer> st, int a){
		if(st.size()==0 || st.peek()<=a) {
			st.push(a);
			return;
		}
		int temp = st.pop();
		insertInStack(st,a);
		st.push(temp);
	}

	static void deleteMid(Stack<Integer> st, int k){
		if(k==1) {
			st.pop();
			return;
		}
		int temp = st.pop();
		deleteMid(st,k-1);
		st.push(temp);
	}
}