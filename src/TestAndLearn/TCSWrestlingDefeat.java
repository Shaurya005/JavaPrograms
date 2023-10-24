package TestAndLearn;

import java.util.Scanner;

public class TCSWrestlingDefeat {
	public static void main(String a[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count=0,i=1,pow=1;
		while(n>=pow){
			count++;
			n=n-pow;
			i+=1;
			pow=i*i;
		}
		System.out.print(count);
	}
}
