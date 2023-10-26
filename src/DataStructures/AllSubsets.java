package DataStructures;

public class AllSubsets {
	public static void main(String[] args) {
		String s = "abcd";
		subsetsBitwise(s);
		subsetsRecursion(s);
	}

	private static void subsetsRecursion(String s) {
		String str = "";
		 solve(s,s.length(),str);
	}

	private static void solve(String s, int length, String str) {
		if(length==0){
			System.out.println(str);
			return;
		}
		solve(s,length-1,str);
		solve(s,length-1,s.charAt(length-1)+str);
	}


	private static void subsetsBitwise(String s) {
		int l = s.length();
		for(int i=0;i<(1<<l);i++){
			int n = i,j=0;
			String str = "";
			while(n>0){
				if((n&1)==1)
					str+=s.charAt(j);
				n>>=1;
				j++;
			}
			System.out.println(str);
		}
	}
}