package TestAndLearn;

import java.util.*;
public class minInsAndDel {
	public static void main(String args[]){
		int[] A = {1,2,5,3,1};
		int[] B = {1,3,5};
		System.out.println(minInsAndDel(A,B,5,3));
	}
	static int minInsAndDel(int[] A, int[] B, int N, int M) {
		// code here
		ArrayList<Integer> ar = new ArrayList<>();
		List a = Arrays.asList(B);
		System.out.println(a.get(0)+" "+a.get(1)+" "+a.get(2));
		for(int i=0;i<N;i++)
			if(a.contains(A[i]))
				ar.add(A[i]);
		System.out.println(ar);
		int lis = lis(ar);
		return M+N-2*lis;
	}

	static int lis(List<Integer> ar){
		ArrayList<Integer> res = new ArrayList<>();
		if(ar.size()>0)
			res.add(ar.get(0));
		for(int i=1;i<ar.size();i++){
			if(ar.get(i)>res.get(res.size()-1))
				res.add(ar.get(i));
			else{
				int k=Collections.binarySearch(res,ar.get(i));
				if(k<0){
					System.out.println(res);
					k=k*-1-1;
					res.remove(k);
					System.out.println(res);
					res.add(k,ar.get(i));
					System.out.println(res);
				}
			}
		}
		return res.size();
	}
}
