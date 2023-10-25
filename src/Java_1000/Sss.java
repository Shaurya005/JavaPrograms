import java.util.*;

class testClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			StringBuffer s = new StringBuffer(str[i]);
			s.reverse();
			if(str[i].contentEquals(s)){
				int l=str[i].length();
				if(l%2!=0)
					System.out.println(str[i].substring(0,l/2+1));
				else
					System.out.println(str[i].substring(0,l/2));
			}
			else
					System.out.println(partition(str[i]));
			}
		}

	public static List<List<String>> partition(String s) {
		List<List<String>> result = new ArrayList<List<String>>();
		dfs(0, result, new ArrayList<String>(), s);
		return result;
	}

	static void dfs(int start, List<List<String>> result, List<String> currentList, String s) {
		if (start >= s.length()) result.add(new ArrayList<String>(currentList));
		for (int end = start; end < s.length(); end++) {
			if (isPalindrome(s, start, end)) {
				// add current substring in the currentList
				currentList.add(s.substring(start, end + 1));
				dfs(end + 1, result, currentList, s);
				// backtrack and remove the current substring from currentList
				currentList.remove(currentList.size() - 1);
			}
		}
	}

	static boolean isPalindrome(String s, int low, int high) {
		while (low < high) {
			if (s.charAt(low++) != s.charAt(high--)) return false;
		}
		return true;
	}
}