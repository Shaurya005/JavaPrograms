package TestAndLearn;

public class BinaryStringAddition {
	public static void main(String[] args)
	{
		String s=addBinary("11","1");
		System.out.println(s);
	}
	public static String addBinary(String a, String b) {
		String s="";char c[]=new char[2];
		int l1=a.length()-1;
		int l2=b.length()-1;
		char carry='0';
		while(l1>=0 || l2>=0){  // Never use two postfix or prefix operation with two variable separated with && or || because in case of || if first condition is true it's not going to second operation to
			// check and hence your increment or decrement operation will not be performed and similarly in case of && if your first condition is false then it's not going to second operation to check
			if(l1>=0 && l2>=0){
				c=add(a.charAt(l1),b.charAt(l2));
				if(carry=='1')
					c=add(c[0],carry);
				carry=c[1];
				s=Character.toString(c[0])+s;
			}
			else if(carry=='0')
				break;
			else if(l1>=0){
				c=add(a.charAt(l1),carry);
				carry=c[1];
				s=Character.toString(c[0])+s;
			}
			else{
				c=add(b.charAt(l2),carry);
				carry=c[1];
				s=Character.toString(c[0])+s;
			}
			l1--;l2--;
		}
		if (carry=='1')
			s=Character.toString('1')+s;
		else if(l1>=0)
			s=a.substring(0,l1)+s;
		else if(l2>=0)
			s=b.substring(0,l2)+s;
		return s;
	}

	public static char[] add(char a,char b){
		char ch[]=new char[2];
		if(a=='0' && b=='0'){
			ch[0]='0';ch[1]='0';
		}
		else if(a=='1' && b=='1'){
			ch[0]='0';ch[1]='1';
		}
		else{
			ch[0]='1';ch[1]='0';
		}
		return ch;
	}
}