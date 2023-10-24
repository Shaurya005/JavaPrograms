package TestAndLearn;

public class Coprime {
	static int gcd(int a, int b)
	{
		if (a == 0 || b == 0)
			return 0;
		if (a == b)
			return a;
		if (a > b)
			return gcd(a-b, b);
		return gcd(a, b-a);
	}
	public static void main(String args[])
	{
		int input1=25;
		int count=0;
		for(int i=1;i<input1;i++){
			if(gcd(input1,i)==1)
				count++;
		}
		System.out.println(count);
	}
}