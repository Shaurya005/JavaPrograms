package DataStructures;

import java.util.*;
class AllSubSequences {
	static List<String> al = new ArrayList<>();

	public static void main(String[] args)
	{
		String s = "aabcd";
		findsubsequences(s, "");
		System.out.println(al);
		subsequence(s);
		System.out.println(st);
		printSubSeq(s);
	}

	static HashSet<String> st = new HashSet<>();
	static void subsequence(String str) {

		// Iterate over the entire string
		for (int i = 0; i < str.length(); i++) {

			// Iterate from the end of the string to generate substrings
			for (int j = str.length(); j > i; j--) {
				String sub_str = str.substring(i, j);

				if (!st.contains(sub_str))
					st.add(sub_str);

				// Drop kth character in the substring and if its not in the set then recur
				for (int k = 1; k < sub_str.length() - 1; k++) {
					StringBuffer sb = new StringBuffer(sub_str);

					// Drop character from the string
					sb.deleteCharAt(k);
					if (!st.contains(sb))
						;
						subsequence(sb.toString());
				}
			}
		}
	}

	static void printSubSeqRec(String str, int n, int index, String curr)
	{
		// base case
		if (index == n) {
			return;
		}
		if (curr != null && !curr.trim().isEmpty()) {
			System.out.print(curr+" ");
		}
		for (int i = index + 1; i < n; i++) {
			curr += str.charAt(i);
			printSubSeqRec(str, n, i, curr);

			// backtracking
			curr = curr.substring(0, curr.length() - 1);
		}
	}

	// Generates power set in lexicographic order.
	static void printSubSeq(String str)
	{
		int index = -1;
		String curr = "";
		printSubSeqRec(str, str.length(), index, curr);
	}

	private static void findsubsequences(String s, String ans)
	{
		if (s.length() == 0) {
			al.add(ans);
			return;
		}

		findsubsequences(s.substring(1), ans + s.charAt(0)); // We are adding 1st character in string
		// Not adding first character of the string because the concept of subsequence either character will present or not.
		findsubsequences(s.substring(1), ans);
	}
}