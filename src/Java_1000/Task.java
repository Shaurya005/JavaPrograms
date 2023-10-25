package Java_1000;

import java.util.Scanner;
public class Task {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();//Taking input of no. of query
		String[] str=new String[q];
		int[] n=new int[q];
		int input,flag,i=0; String s; char ch;
		while (q!= 0) {
			input = sc.nextInt();
			if (input == 1) {
				s = sc.next();
				flag=0;
				for(int j=0;j<i;j++){
					if(s==str[j]){
						n[j]++;
						flag=1;
					}}
					if(flag==0){
						str[i]=s;
					    n[i]=1;
					    i++;
				}
			}
			else if (input == 2) {
				ch = sc.next().charAt(0);
				for(int k=1;k<=3;k++){
				while (--i >= 0) {
					if (str[i].charAt(0) == ch) {
						System.out.println(str[i]);
					}
				}}}
				q--;
		}
	}
}
//Could not solve completely and hence submitting that much I have done before the deadline time given.