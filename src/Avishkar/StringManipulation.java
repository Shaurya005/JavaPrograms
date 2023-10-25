package Avishkar;// Input - Ashish Kumar Modi
// Output - A. K. Modi

import java.util.Scanner;
public class StringManipulation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = sc.nextLine().trim();
		String s1 = Initials1(str);
		System.out.println(s1);
		s1=Initials2(str);
		System.out.println(s1);
	}
// Ashish Kumar Modi
	static String Initials1(String str) {
		String s = "", result = "";
		str = str + " ";
		int l = str.length();
		for (int i = 0; i < l; i++) { //At i=6 space is encountered
			char ch = str.charAt(i); // ' '
			if (ch != ' ')
				s = s + ch;//Ashish
			else if (i == l - 1)
				result += s;//A.K. Modi

			else {
				result = result + s.charAt(0) + ". ";// A. K.
				s = "";
			}
		}
		return result;
	}

	static String Initials2(String str){
		String s="", result="";
		int l=str.length();
		for(int i=0;i<l;i++){
			char ch=str.charAt(i);
			s=s+ch;
			if(ch == ' ') {
				result += s.charAt(0)+". ";
				s="";
			}}
		result+=s;
		return result;
	}
}