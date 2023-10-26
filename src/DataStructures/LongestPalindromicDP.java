package DataStructures;

public class LongestPalindromicDP {
	public static void main(String args[]) {
		String str = "abeebac";
		System.out.println(lpSubsequence(str,0,str.length()-1));

		Integer[][] arr = new Integer[str.length()][str.length()];
		System.out.println(lpSubsequenceTopDown(str,0,str.length()-1,arr));


		String str2 = "adadda";
		System.out.println(lpSubstring(str2,0,str2.length()-1));

		Integer[][] arr2 = new Integer[str2.length()][str2.length()];
		System.out.println();
	}

	static int lpSubsequence(String str, int start, int end){
		if(start>end)
			return 0;
		if(start==end)
			return 1;
		if(str.charAt(start)==str.charAt(end))
			return 2 + lpSubsequence(str,start+1,end-1);
		return Math.max(lpSubsequence(str,start+1,end), lpSubsequence(str,start,end-1));
	}

	static int lpSubsequenceTopDown(String str, int start,  int end, Integer[][] arr){
		if(start>end)
			return 0;
		if(start==end)
			return 1;
		if(arr[start][end]==null){
			if(str.charAt(start)==str.charAt(end))
				arr[start][end] = 2 + lpSubsequenceTopDown(str,start+1,end-1,arr);
			else
				arr[start][end] = Math.max(lpSubsequenceTopDown(str,start+1,end,arr),lpSubsequenceTopDown(str,start,end-1,arr));
		}
		return arr[start][end];
	}

	static int lpSubstring(String str, int start, int end){
		if(start>end)
			return 0;
		if(start==end)
			return 1;
		if(str.charAt(start)==str.charAt(end)){
			int lpsRemaining = end-start-1;
			if(lpsRemaining == lpSubstring(str,start+1,end-1))
				return 2+lpsRemaining;
		}
		return Math.max(lpSubstring(str,start+1,end),lpSubstring(str,start,end-1));
	}

	/*static int lpSubstringTopDown(String str, int start, int end, Integer[][] arr){
		if(start>end)
			return 0;

	}
	*/
}