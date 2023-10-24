package TestAndLearn;

public class gg {
	public static void main(String[] args) {
		/*
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i,j,count=0;
		int n[]=new int[num];
		for(i=0;i<num;i++)
			n[i]=sc.nextInt();
		System.out.println("yguyug");
		for(i=0;i<num;i++){
			for(j=0;j<num-i;j++){
				int sum=0;
				for(int k=j;k<=j+i;k++)
					sum+=n[k];
				if(sum<0)
					count++;
			}
		}
		System.out.println(count);
		*/
		String s1="Java";
		String s2="java";
		System.out.println(s1.substring(0,1));
		boolean b1=s1==s2,b2=s1.equals(s2);
		System.out.println(b1+" "+b2);
		if(s1==s2)
			System.out.println("True");
		if(s1.equals(s2))
			System.out.println("true");
		int n=Integer.parseInt(Character.toString('5'));

		int arr[]={4,-10,4,4,4};
		System.out.println(minEnergy(arr,5));
	}

	public static int minEnergy(int a[], int n)
	{
		// Your code goes here
		int k=0;int energy=1;
		for(int i=n-1;i>=0;i--){
			if(a[i]<0 && k==0){
				energy=energy-a[i];
				System.out.println(energy);
				k=1;
			}
			else if(k==1) {
				energy -= a[i];
				System.out.println(energy);
			}
		}
		return energy;
	}
}