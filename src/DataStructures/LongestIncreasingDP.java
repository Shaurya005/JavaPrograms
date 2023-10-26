package DataStructures;

public class LongestIncreasingDP {
	public static void main(String arg[]) {
		int a[] = {7,1,4,8,11,2,14,3};
		System.out.println(longestSubsequenceLength(a));
		System.out.println(longestSubsequenceLength2(a));
		System.out.println(MaxSumIncreasingSubsequence(a));
	}

	static int longestSubsequenceLength(int a[]){
		int[] lis = new int[a.length];
		for(int i=0;i<lis.length;i++)
			lis[i] = 1;

		int maxLisLength = 1;

		for(int i=1;i<lis.length;i++)
			for(int j=0; j<i; j++)
				if(a[i]>a[j] && 1+lis[j]  > lis[i]){
					lis[i] = 1 + lis[j];
					maxLisLength = Math.max(maxLisLength,lis[i]);
				}
		return maxLisLength;
	}

	static int longestSubsequenceLength2(int a[]){
		int[] lis = new int[a.length];
		for(int i=0;i<lis.length;i++)
			lis[i] = 1;

		int maxLisLength = 1;

		for(int i=a.length-2;i>=0;i--)
			for(int j=i+1; j<a.length; j++)
				if(a[i]<a[j] && 1+lis[j]  > lis[i]){
					lis[i] = 1 + lis[j];
					maxLisLength = Math.max(maxLisLength,lis[i]);
				}
		return maxLisLength;
	}

	static int MaxSumIncreasingSubsequence(int a[]){
		int[] mis = new int[a.length];
		for(int i=0;i<mis.length;i++)
			mis[i] = a[i];

		int maxIncreasingSubsequenceSum = mis[0];
		for(int i=1;i<mis.length;i++)
			for(int j=0; j<i; j++)
				if(a[i]>a[j] && a[i]+mis[j]  > mis[i]){
					mis[i] = a[i] + mis[j];
					maxIncreasingSubsequenceSum  = Math.max(maxIncreasingSubsequenceSum ,mis[i]);
				}
		return maxIncreasingSubsequenceSum;
	}
}