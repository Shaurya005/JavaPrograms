package DataStructures;

public class DP_WaysToReachStairs {
	public static void main(String a[]){
		int n = 6;
		System.out.println(totalWaysToReachNthStair(n));
		int[] arr = new int[n+1];
		System.out.println(totalWaysToReachNthStairTopDown(arr,n));
		System.out.println(totalWaysToReachNthStairBottomUp(n));
	}

	static int totalWaysToReachNthStair(int n){
		if(n==0)
			return 1;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return totalWaysToReachNthStair(n-1)+totalWaysToReachNthStair(n-2)+totalWaysToReachNthStair(n-3);
	}

	static int totalWaysToReachNthStairTopDown(int arr[], int n){
		if(n==0)
			return 1;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(arr[n]==0)
			arr[n] = totalWaysToReachNthStairTopDown(arr,n-1)+totalWaysToReachNthStairTopDown(arr,n-2)+totalWaysToReachNthStairTopDown(arr,n-3);
		return arr[n];
	}

	static int totalWaysToReachNthStairBottomUp(int n){
		int arr[] = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		for(int i = 3;i<=n;i++)
			arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
		return arr[n];
	}
}
