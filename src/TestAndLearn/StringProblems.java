package TestAndLearn;

import javax.swing.text.html.Option;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class StringProblems {
	public static void main(String a[]) {
		Optional<String> opt = Optional.ofNullable(null);
		System.out.println(opt.isPresent());
		System.out.println(Optional.empty().equals(opt));
	}
}
	/*
		//isPalindrome("AVUVUY hgyubhiu 3544*@ A654!u, uigui . iuguihgu LLLL");
		char ch[] ;
		List l = new LinkedList<>();

		String str="Shaurya".concat("shauud").concat("\n").concat("ssdfa");
		System.out.println("Concatenation of multiple String: "+str);
		String st = "mouse";
		System.out.println(st.indexOf("ma"));
		System.out.println(Math.log(Integer.MAX_VALUE)/Math.log(3));
	}

	static void isPalindrome(String s) {
		s=s.toLowerCase();String str="";
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if((c >='a' && c <= 'z') || (c>='A' && c<='Z') || (c>='0' && c<='9'))
			str+=Character.toString(c);
		}
		System.out.println(str);
	}
}

*/