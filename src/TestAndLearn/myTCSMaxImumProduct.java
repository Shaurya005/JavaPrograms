package TestAndLearn;

// Java program to find maximum product by breaking the Integer
class GFG {
	// method return x^a in log(a) time
	static int power(int x, int a)
	{
		int res = 1;
		while (a > 0)
		{
			if ((a & 1) > 0)
				res = res * x;
			x = x * x;
			a >>= 1;
		}
		return res;
	}

	// Method returns maximum product obtained by breaking N
	static int breakInteger(int N)
	{
		if (N == 2) // base case 2 = 1 + 1
			return 1;
		if (N == 3) // base case 3 = 2 + 1
			return 2;
		int maxProduct = -1;

		// breaking based on mod with 3
		switch (N % 3) {
			// If divides evenly, then break into all 3
			case 0:
				maxProduct = power(3, N / 3); break;

			// If division gives mod as 1, then break as 4 + power of 3 for remaining part
			case 1:
				maxProduct = 2 * 2 * power(3, (N / 3) - 1); break;

			// If division gives mod as 2, then break as 2 + power of 3 for remaining part
			case 2:
				maxProduct = 2 * power(3, N / 3); break;
		}
		return maxProduct;
	}

	public static void main(String[] args)
	{
		//int maxProduct = breakInteger(10);
		//System.out.println(maxProduct);
		System.out.println(55 & 1);
	}
}