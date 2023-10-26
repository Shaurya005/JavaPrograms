package DataStructures;

public class MultiplyString {
	public static void main(String a[]) {
		System.out.println(multiply("653","93"));
	}

	static public String multiply(String num1, String num2) {
		if(num1.equals("0") || num2.equals("0"))
			return "0";
		String str="",s="";
		int l1 = num1.length(), l2 = num2.length();
		int i = l1, j, prod, carry=0;
		while(i-->0){
			j = l2;
			s = "";carry = 0;
			while(j-->0){
				prod = Integer.parseInt(String.valueOf(num1.charAt(i)))*Integer.parseInt(String.valueOf(num2.charAt(j)))+carry;
				carry = prod/10;
				prod = prod%10;
				s = String.valueOf(prod)+s;
				if(j==0 && carry!=0)
					s = String.valueOf(carry)+s;
			}
			for(int k=l1-i-1;k>0;k--)
				s=s+"0";
			str = sum(str,s);
		}
		return str;
	}

	static String sum(String num1,String num2){
		int carry=0;String res="";
		int sum,l1=num1.length(),l2=num2.length();
		int i=l1-1,j=l2-1;
		while(i>=0 || j>=0){
			if(i>=0 && j>=0){
				sum=Integer.parseInt(Character.toString(num1.charAt(i)))+
						Integer.parseInt(Character.toString(num2.charAt(j)))+carry;
				carry=sum/10;
				sum=sum%10;
				res=Integer.toString(sum)+res;
				i--;j--;
			}
			else if(carry==0){
				if(i>=0)
					return num1.substring(0,i+1)+res;
				if(j>=0)
					return num2.substring(0,j+1)+res;
			}
			else{
				if(i>=0){
					sum=Integer.parseInt(Character.toString(num1.charAt(i)))+carry;
					carry=sum/10;
					sum=sum%10;
					res=Integer.toString(sum)+res;
					i--;
				}
				if(j>=0)
				{
					sum=Integer.parseInt(Character.toString(num2.charAt(j)))+carry;
					carry=sum/10;
					sum=sum%10;
					res=Integer.toString(sum)+res;
					j--;
				}
			}
		}
		if(carry!=0){
			res="1"+res;
		}
		return res;
	}
}