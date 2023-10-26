package DataStructures;

public class GFGTransitionPoint {
	public static void main(String[] args)
	{
		int arr[]={0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(transitionPoint(arr,arr.length));
	}
	static int transitionPoint(int arr[], int n) {
		// code here
		if(n<=0)
			return -1;
		int l=0,h=n-1,mid;
		while(l<=h){
			mid=(l+h)/2;
			if(arr[mid]==1){
				int pos = transitionPoint(arr,mid);
				if(pos!=-1)
					return pos;
				return mid;
			}

			if(arr[mid]>n)
				h=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}
}
