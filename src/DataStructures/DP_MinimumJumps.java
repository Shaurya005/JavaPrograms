package DataStructures;

public class DP_MinimumJumps {
	public static void main(String a[]) {
		int n = 8;
		int arr[] = new int[n+1];
		System.out.println(minimumJumps(n));
		System.out.println(minimumJumpsTopBottom(n,arr));
		System.out.println(minimumJumpsBottomUp(n));
	}

	static int minimumJumps(int n){
		if(n==0)
			return 0;
		if(n<=3)
			return 1;
		return 1 + Math.min(Math.min(minimumJumps(n-1), minimumJumps(n-2)), minimumJumps(n-3));
	}

	static int minimumJumpsTopBottom(int n,int arr[]){
		if(n==0)
			return 0;
		if(n<=3)
			return 1;
		if(arr[n]==0)
			arr[n] = 1 + Math.min(Math.min(minimumJumpsTopBottom(n-1,arr), minimumJumpsTopBottom(n-2,arr)), minimumJumpsTopBottom(n-3,arr));
		return arr[n];
	}

	static int minimumJumpsBottomUp(int n){
		int a[] = new int[n+1];
		a[0] = 0;
		a[1]=a[2]=a[3]=1;
		for(int i = 4;i<=n;i++)
			a[i] = 1 + Math.min(Math.min(a[i-1],a[i-2]),a[i-3]);
		return a[n];
	}
}