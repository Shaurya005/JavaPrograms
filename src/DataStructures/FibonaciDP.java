package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class FibonaciDP {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		Arrays.fill(arr,0);
		System.out.println(fibboTopDown(n,arr));
		System.out.println(fibboBottomUp(n));
	}

	static int fibboTopDown(int num,int arr[]){
		if(num<2)
			return num;
		if(arr[num]==0)
			arr[num] = fibboTopDown(num-1,arr)+fibboTopDown(num-2,arr);
		return arr[num];
	}

	static int fibboBottomUp(int num){
		int n[] = new int [num+1];
		n[0] = 0;
		n[1] = 1;
		for(int i = 2;i<=num;i++)
			n[i] = n[i-1]+n[i-2];
		return n[num];
	}
}