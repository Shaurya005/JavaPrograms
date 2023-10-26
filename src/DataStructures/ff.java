package DataStructures;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;
public class ff{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] epamers = sc.nextLine().split(",");
		int ticketValue = sc.nextInt();
		int[] array = new int[epamers.length];
		for(int i=0;i<epamers.length;i++)
			array[i] = Integer.parseInt(epamers[i]);
		Vector<Integer> A = new Vector(Arrays.asList(array));
		winnersOfGame(A, ticketValue);
	}
	static void unique_combination(int l, int sum, int K, Vector<Integer> local, Vector<Integer> A)
	{
		if (sum == K) {
			System.out.print("[");
			for (int i = 0; i < local.size(); i++) {
				if (i != 0)
					System.out.print(" ");
				System.out.print(local.get(i));
				if (i != local.size() - 1)
					System.out.print(", ");
			}
			System.out.println("]");
			return;
		}
		for (int i = l; i < A.size(); i++) {
			if (sum + A.get(i) > K)
				continue;
			if (i > l && A.get(i) == A.get(i - 1) )
				continue;
			local.add(A.get(i));
			unique_combination(i + 1, sum + A.get(i), K, local, A);
			local.remove(local.size() - 1);
		}
	}
	static void winnersOfGame(Vector<Integer> A, int K)
	{
		Collections.sort(A);
		Vector<Integer> local = new Vector();
		unique_combination(0, 0, K, local, A);
	}
}