package Avishkar;

import java.util.Scanner;
public class CountChar {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Count1(str);
		Count2(str);
	}
	static void Count1(String str){
		int count=0,k,l=str.length();
		for(int i=0;i<l;i++){
			k=0;
			for(int j=i+1;j<l;j++)
				if(str.charAt(i)==str.charAt(j)) {
					k = 1;
					break;
				}
			if(k==0)
			{
				for(int j=0;j<=i;j++)
					if(str.charAt(j)==str.charAt(i))
						count++;
				System.out.println("Frequency of "+str.charAt(i)+" is "+count);
				count=0;
			}
		}
	}

	static void Count2(String str){
		int count=0,k,l=str.length();
		for(int i=0;i<l;i++){
			k=0;
			for(int j=0;j<i;j++)
				if(str.charAt(i)==str.charAt(j)) {
					k = 1;
					break;
				}
			if(k==0)
			{
				for(int j=i;j<l;j++)
					if(str.charAt(j)==str.charAt(i))
						count++;
				System.out.println("Frequency of "+str.charAt(i)+" is "+count);
				count=0;
			}
		}
	}
}