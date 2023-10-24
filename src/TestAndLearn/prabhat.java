package TestAndLearn;

import java.util.Scanner;

public class prabhat {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 7;i<=100;i+=10){
			int k = 0;
			for(int j = 2;j*j<=i;j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}
			}
			if(k==0)
				sum+=i;
		}
		System.out.println(sum);
	}
}