package TestAndLearn;

import java.util.Arrays;

public class MagicNumber {
	public static void main(String args[]){
		int arr[]={3,4,-1,9,1,3,4,1,2,2};
		//System.out.println(getMagicValue(arr));
		System.out.println(solve(10,arr));
	}

	static long getMagicValue(int[] a){
		int arr[]= Arrays.copyOf(a,a.length);
		Arrays.sort(arr);
		long good=0,bad=0;
		for(int i=0;i<a.length;i++) {
				if(arr[i]==a[i])
					good+=a[i];
				else
					bad+=a[i];
		}
		return good-bad;
	}

	static int solve(int N,int[ ] A){
			int result=A[0];
			for(int i=1;i<A.length;i++){
				if(A[i]==0)
					return 0;
				else if(Math.abs(A[i])<Math.abs(result))
					result = A[i];
				else if(Math.abs(A[i])==Math.abs(result) && A[i]>result)
					result = A[i];
			}
			return result;
	}

	static String solve(String S){
		StringBuffer sb = new StringBuffer(S);
		sb.reverse();
		return sb.toString();
	}
}
