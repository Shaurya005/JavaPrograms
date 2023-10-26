package DataStructures;

import java.util.Scanner;
import java.util.TreeSet;
public class PanditCapgemini
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
			set.add(arr1[i]);
		}
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
			if (!set.contains(arr2[i]))
				set.add(arr2[i]);
		}
		int size = set.size();
		float result;
		Object a[] = set.toArray();
		if (size % 2 != 0)
			System.out.println(a[size / 2]);
		else {
			result = (float) ((int) a[size / 2] + (int) a[size / 2 - 1]) / 2;
			System.out.println(result);
		}
	}
}