package TestAndLearn;

import java.util.TreeSet;

public class threeDigitEven {
	public static void main(String[] args) {
		int a[] = {2,1,3,0};
		findEvenNumbers(a);
	}

	static TreeSet<Integer> ts;
	static int[] findEvenNumbers(int[] digits) {
		ts = new TreeSet<>();
		solve(digits,digits.length,0);
		int res[]=new int[ts.size()];
		int j = 0;
		for(int i:ts)
			res[j++]=i;
		return res;
	}

	static void solve(int[] digits,int n,int out){
		System.out.println(out);
		if(out>99){
			ts.add(out);
			return;
		}
		if(n==0)
			return;

		if(out>9){
			if(digits[n-1]%2==0)
				solve(digits,n-1,out*10+digits[n-1]);
			solve(digits,n-1,out);
		}
		else{
			solve(digits,n-1,out*10+digits[n-1]);
			solve(digits,n-1,out);
		}
	}
}