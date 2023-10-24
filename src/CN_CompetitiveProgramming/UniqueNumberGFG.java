package CN_CompetitiveProgramming;

public class UniqueNumberGFG {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1,3,-4,3,2,-4,-5,1,-4};
		//System.out.println(singleElement(arr,13));
		int n = -5;
		for(int i = 1;i<=32;i++){
			System.out.println(n&1);
			n>>=1;
		}
	}
	static int singleElement(int[] arr , int N) {
		// code here
		int a[] = new int[32];
		int i,j,num;
		for(i=0;i<N;i++){
			num = arr[i]; j = 0;
			while(num!=0){
				a[j]+=(num&1);
				num>>=1;
				j++;
			}
		}
		int res=0;
		for(i=0;i<32;i++){
			a[i]%=3;
			res+=a[i]*(1<<i);
		}
		return res;
	}
}
