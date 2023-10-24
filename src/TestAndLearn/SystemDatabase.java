package TestAndLearn;

import java.util.*;
public class SystemDatabase {
	static int i=0; static String s;
	static String data[]=new String[10];
	public static void main(String a[]) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		while (N-- > 0) {
			s = sc.next();
			solve();
			System.out.println();
		}
	}

	static void solve(){
		if(i==0){
			data[0]=s;
			System.out.println("NO");
			i++;
		}
		else{
			int k=0,flag=0;
			while(k < i){
				if(s.equals(data[k])){
					System.out.println("YES");
					flag=1;break;
				}
				k++;
			}
			if(flag==0){
				System.out.println("NO");
				data[i++]=s;
			}
		}
	}
}