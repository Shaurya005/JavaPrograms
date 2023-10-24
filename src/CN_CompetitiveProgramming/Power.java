package CN_CompetitiveProgramming;

public class Power {
	public static void main(String[] args) {
		System.out.println(power(12,21));
		System.out.println(fastpower(2,7));
		int a[] = {2,6,3,1,8,5};
		recursive_bubble_sort(a,0,a.length);
		for(int i:a)
			System.out.print(i+" ");
	}
	static long power(int N,int R)
	{
		//Your code here
		long ans = 1L;
		long n=N;
		while(R>0){
			if((R&1)==1)
				ans=(ans*n)%1000000007;
			R>>=1;
			n=(n*n)%1000000007;
			System.out.println(n);
			System.out.println(ans);
		}
		return ans;
	}

	static int fastpower(int a,int n){
		if(n==0)
			return 1;
		if(n==1)
			return a;
		int smaller_ans = fastpower(a,n/2);
		smaller_ans*=smaller_ans;
		if((n&1)==1)
			smaller_ans*=a;
		return smaller_ans;
	}
	// Numbers in 1 to 1000 divisible by prime numbers between 1 and 20.

	static void iterative_bubble_sort(int a[],int n){
		if(n==1)
			return;
		for(int i = 0;i<n-1;i++)
			if(a[i]>a[i+1]){
				int t = a[i];
				a[i] = a[i+1];
				a[i+1] = t;
			}
		iterative_bubble_sort(a,n-1);
	}

	static void recursive_bubble_sort(int a[], int j, int n){
		if(n==1)
			return;
		if(j==n-1) {
			recursive_bubble_sort(a, 0, n - 1);
			return;
		}
		if(a[j]>a[j+1]){
			int t = a[j];
			a[j] = a[j+1];
			a[j+1] = t;
		}
		recursive_bubble_sort(a,j+1,n);
	}
}
