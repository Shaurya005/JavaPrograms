package Java_1000;

import java.util.*;
class test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		int rev_sum = 0;
		n = sum;
		while (n != 0) {
			rev_sum = rev_sum * 10 + n % 10;
			n /= 10;
		}
		if (rev_sum == sum)
			System.out.println("1");
		else
			System.out.println("0");
	}
}