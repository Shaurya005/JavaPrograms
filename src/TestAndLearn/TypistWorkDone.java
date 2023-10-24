package TestAndLearn;

import java.text.DecimalFormat;
import java.util.Scanner;
public class TypistWorkDone {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];double sum=0.0;
		for(int i=0;i<n;i++) {
			ar[i] = s.nextInt();
			sum+=(1.0/ar[i]);
		}
		sum=1/sum;
		System.out.println(sum);
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.print(df.format(sum));

		double d=2343.5476;
		double roundedDouble = Math.round(d * 100.0) / 100.0;
		System.out.println("Rounded double: "+roundedDouble);

		float f=2343.5476f;
		float roundedFloat = (float) (Math.round(f * 100.0) / 100.0);
		System.out.println("Rounded float: "+roundedFloat);
	}
}

