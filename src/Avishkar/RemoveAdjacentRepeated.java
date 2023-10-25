package Avishkar;//Program to remove repeated adjacent repeated element.
//Input - 0 0 1 0 1 1 0 2 2 1
//Output - 0 1 0 1 0 2 1

import java.util.Scanner;
public class RemoveAdjacentRepeated {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int l = sc.nextInt();
		int n[] = new int[l];
		System.out.println("Now enter all the " + l + " elements of array separated by space");
		for (int i = 0; i < l; i++)
			n[i] = sc.nextInt();
		remove(n);
	}
// 0 0 0 0 0 1 1 1 1
	static void remove(int[] n){
		int l=n.length;
		for (int i = 0; i < l-1; i++)
			while(i<l-1 && n[i]==n[i+1]){
				for(int j=i+1;j<l-1;j++) {
					n[j] = n[j + 1];//when i becomes l-1 then this statement becomes n[l-1] = n[l] and it is ArrayIndexOutOfBound
				}
				l-=1;
			}
		for(int i=0;i<=l-1;i++)
			System.out.println(n[i]);
	}
}