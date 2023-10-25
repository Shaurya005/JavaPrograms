package Avishkar;

import java.util.Scanner;
public class RemoveRepeated {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int l = sc.nextInt();
		int n[] = new int[l];
		System.out.println("Now enter all the "+ l + " elements of array separated by space");
		for (int i = 0; i < l; i++) {
			n[i] = sc.nextInt();
		}
		remove(n);
		System.out.println();
		remove_(n);
	}

	static void remove(int []n){
			int l=n.length;// 5
			for (int i = 0; i < l; i++) {
				//Input - 0 0 1 0 1 //Position of 1 here was 2
				//when i =0; j will traverse from 1 - 4
				for (int j = i + 1; j < l; j++)
					//j=1
					if (n[i] == n[j]) { //n[0]==n[1]  --> True
						for(int k = j; k < l-1 ; k++) {  //1-->4
							n[k] = n[k + 1];
						}
						//Array - 0 1 0  1 //Position of 1 is 1
						j-=1;
						l -= 1; //4
					}
			}
			for (int i = 0; i < l; i++) {
				System.out.print(n[i]+" ");
			}
		}

		static void remove_(int n[]) {
			int l = n.length;
			for (int i = 0; i < l; i++)
				for (int j = 0; j < i; j++) {
					if (n[i] == n[j]) {
						for (int k = j; k < l - 1; k++)
							n[k] = n[k + 1];
						i -= 1;
						l -= 1;
					}
				}
			for (int i = 0; i < l; i++) {
				System.out.print(n[i]+" ");
			}
		}
}