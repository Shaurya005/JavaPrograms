package DataStructures;

public class CompareStringWithBackspace {
	public static void main(String args[]) {
		String s1 = "abcd##e";
		String s2 = "abe#e";
		System.out.println(compare(s1,s2));
	}

	static boolean compare(String s1,String s2) {
		int end1 = s1.length() - 1, end2 = s2.length() - 1;
		while (end1 >= 0 && end2 >= 0) {
			int count = 0;
			while (s1.charAt(end1) == '#') {
				end1--;
				count++;
			}
			end1 = end1 - count;
			count = 0;
			while (s2.charAt(end2) == '#') {
				end2--;
				count++;
			}
			end2 = end2 - count;
			if (s1.charAt(end1) != s2.charAt(end2))
				return false;
			end1--;
			end2--;
		}
		if(end1==-1 && end2==-1)
			return true;
		return false;
	}
}
