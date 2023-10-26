package DataStructures;

public class LongestCommonDP {
	public static void main(String args[]){
		String s1 = "abde";
		String s2 = "acde";
		System.out.println(lcs(s1,s2,s1.length(),s2.length()));

		Integer[][] arr = new Integer[s1.length()+1][s2.length()+1];
		System.out.println(lcsTopDown(s1,s2,s1.length(),s2.length(),arr));

		System.out.println(lcsBottomUp(s1,s2,s1.length(),s2.length()));

		String s1_ = "abcdefg";
		String s2_ = "acddefg";
		System.out.println(lcSubstring(s1_, s2_, s1_.length(), s2_.length(),0));
	}

	static int lcs(String s1, String s2, int l1, int l2){
		if(l1==0 || l2==0)
			return 0;
		if(s1.charAt(l1-1) == s2.charAt(l2-1))
			return 1+lcs(s1,s2,l1-1,l2-1);
		return Math.max(lcs(s1,s2,l1-1,l2), lcs(s1,s2,l1,l2-1));
	}

	static int lcsTopDown(String s1, String s2, int l1, int l2, Integer[][] arr){
		if(l1==0 || l2==0)
			return 0;
		if(arr[l1][l2] == null) {
			if(s1.charAt(l1-1)==s2.charAt(l2-1))
				arr[l1][l2] = 1+lcsTopDown(s1,s2,l1-1,l2-1,arr);
			else
				arr[l1][l2] = Math.max(lcsTopDown(s1,s2,l1-1,l2,arr), lcsTopDown(s1,s2,l1,l2-1,arr));
		}
		return arr[l1][l2];
	}

	static int lcsBottomUp(String s1, String s2, int l1, int l2){
		if(l1==0 || l2==0)
			return 0;
		int[][] arr = new int[l1+1][l2+1];
		for(int i = 1;i<=l1;i++)
			for(int j=1;j<=l2;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1))
					arr[i][j] = 1+arr[i-1][j-1];
				else
					arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
			}
			return arr[l1][l2];
	}

	static int lcSubstring(String s1, String s2, int n, int m, int countLCS){
		if(n==0 || m==0)
			return countLCS;

		if(s1.charAt(n-1) == s2.charAt(m-1))
			countLCS = lcSubstring(s1,s2,n-1,m-1, countLCS+1);

		int count1 = lcSubstring(s1,s2,n-1,m,0);
		int count2 = lcSubstring(s1, s2, n,m-1,0);
		return Math.max(countLCS,Math.max(count1,count2));
	}
}