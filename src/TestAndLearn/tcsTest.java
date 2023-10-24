package TestAndLearn;

import java.util.*;
public class tcsTest {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int numA = 0, numB = 0; int k=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				numA++;
			else if (s.charAt(i) == 'b')
				numB++;
			if(numA==n-1 && numB==n-1)
				k =1;
			if(k==0) {
				if (numA == n){
					System.out.println("Team A won");break;}
				else if (numA == n){
					System.out.println("Team B won");break;}
			}
			else{
				if(numA-numB == 2){
					System.out.println("Team A won");break;}
				else if(numB-numA == 2){
					System.out.println("Team B won");break;}
			}
		}
	}
}