package Avishkar;

import java.util.Scanner;
public class RemoveRepChar {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = sc.nextLine();
		int l=str.length();
		System.out.println(str.substring(l,l));
		System.out.println(rem1(str));
		System.out.println(rem2(str));
	}

	static String rem1(String str) {
		int l = str.length();
		String s = "";
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					if (j != (l - 1))
						str = str.substring(0, j) + str.substring(j + 1, l);
					else
						str = str.substring(0, j);
					l = str.length();
				}
			}
		}
		return str;
	}

	static String rem2(String str) {
		int l = str.length();
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < i && i<l; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					if (j != (l - 1))
						str = str.substring(0, j) + str.substring(j + 1, l);
					else
						str = str.substring(0, j);
					l = str.length();
				}
			}
		}
		return str;
	}
}