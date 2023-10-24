package TestAndLearn;

import java.util.*;
public class ConsecutiveNumbers {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int key, i, j;
		int n[] = new int[num];
		for (i = 0; i < num; i++)
			n[i] = sc.nextInt();

		System.out.println(checkConsecutive(num,n));
	}
	static public int  checkConsecutive(int input1,int[] input2){
		int i,j,key;
		for (i = 1; i <input1; i++) {
			key = input2[i];
			j = i - 1;
			while (j >= 0 && input2[j] > key) {
				input2[j + 1] = input2[j];
				j--;
			}
			input2[j + 1] = key;
		}
		for (i = 0; i < input1-1; i++)
			if((input2[i]+1) != input2[i+1])
				return 0;
		return 1;
	}
	*/
		String input1="Lord Of Rings",input2="o";
		int l=input1.length();
		for(int i=0;i<l-1;i++){
			if(input1.charAt(i)==input2.charAt(0))
			{
				input1=input1.substring(0,i)+input1.substring(i+1,l);
			}
		}
		System.out.println(input1);
	}
}