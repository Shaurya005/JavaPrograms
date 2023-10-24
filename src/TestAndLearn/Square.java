package TestAndLearn;

public class Square {
	public static void main(String a[]) {
		Solution s = new Solution();
		System.out.println(s.mySqrt(500));
	}

 static class Solution {
		public int mySqrt(int x) {
			if (x <= 3)
				return 1;
			int start = 1, end = x/2, mid = (1 + x) / 2;
			while (start <= end) {
				if (x == mid * mid)
					return mid;
				if (x > mid * mid)
					start = mid + 1;
				else
					end = mid - 1;
				mid = (start + end) / 2;
			}
			return mid;
		}
	}
}