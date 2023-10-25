package Java_1000;

import java.util.Scanner;

public class Trial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// Write your code here.
		int l=s.length(),count=0;
		String str="";char ch;
		for(int i=0;i<l;i++){
			ch=s.charAt(i);
			if((65<=ch && ch<=90)||(97<=ch && ch<=122))
				str+=s.charAt(i);
			else{
				if(i==0)
					count--;
				while((i<l)&&!((65<=s.charAt(i) && s.charAt(i)<=90)||(97<=s.charAt(i) && s.charAt(i)<=122)))
					i++;
				i--;
				str+=" ";
				if(i==l-1||i==0);
				else
					count++;
			}
		}
		System.out.println(++count);
		int i,j;
		j=(str.charAt(0)==' ')?1:0;
		for(i=j;i<str.length();i++)
			if(str.charAt(i)==' '){
				System.out.println(str.substring(j,i));
				j=i+1;
			}
		if(str.charAt(i-1)!=' ')
			System.out.println(str.substring(j,i));
		sc.close();
	}
}