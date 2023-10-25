package Java_1000;

import java.util.Scanner;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		System.out.println(q<=(int)(Math.pow(2,31)-1));
		boolean n=q<=(int)(Math.pow(2,31)-1)&&q>=(int)Math.pow(2,-31);
		System.out.println(n);
		//System.out.println(reverse(q));
	}
	/*
	public static int reverse(int x) {
		int rem,rev=0;
		boolean n=rev<=(int)(Math.pow(2,31)-1)&&rev>=(int)Math.pow(2,-31);
		System.out.println(n);
		if(x>0){
			while(x!=0){
				rem=x%10;
				x/=10;
				rev=rev*10+rem;
			}
			if(rev<=(Math.pow(2,31)-1)&&rev>=Math.pow(2,-31))
				return rev;
			else
				return 0;
		}
		else{
			x*=-1;
			while(x!=0){
				System.out.println(x);
				rem=x%10;
				x/=10;
				rev=rev*10+rem;
				System.out.println(rev);
			}
			rev*=-1;
			System.out.println(rev);
			if(rev<=(int)(Math.pow(2,31)-1)&&rev>=(int)Math.pow(2,-31)) {
				System.out.println(rev);
				return rev;
			}
			else
				return 0;
		}
		*/
	}
	/*
	class Solution {
    public boolean isValid(String s) {
        int l=s.length();
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'||s.charAt(l-1)=='('||s.charAt(l-1)=='['||s.charAt(l-1)=='{')
            return false;
        else
        {
            char ch;int k=0;
            for(int i=0;i<l-1;i++){
                ch=s.charAt(i);
                if(ch=='('){
                for(int j=i+1;j<l;j++)
                if(s.charAt(j)=='}'||s.charAt(j)==']')
                {
                    k=1;
                    break;
                }
                    else if(s.charAt(j)==')')
                        break;
            }
        }
    }
}
	 */