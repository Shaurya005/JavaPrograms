package DataStructures;

public class ArrayCodingSimplified {
	public static void main(String[] args) {
		int a[]={-3,-4,4,-2,0,-1,5,1,-3};
		System.out.println(largestSumSubArray(a));
		largestSumSubArrayIndex(a);
		 int arr[] = {14,15,8,9,5,2};
		 printElementGreaterOrEqualToRightSide(arr);
	}

	static void printElementGreaterOrEqualToRightSide(int a[]){
		int max = Integer.MIN_VALUE;

		for(int i = a.length-1;i>=0;i--){
			if(a[i] > max){
				max = a[i];
				System.out.print(a[i]+" ");
			}
		}
	}

	static int largestSumSubArray(int[] a){
		int max_so_far = a[0], current_max = a[0];
		for(int i=1;i<a.length;i++){
			current_max = Math.max(a[i], current_max + a[i]);
			max_so_far = Math.max(current_max, max_so_far);
		}
		return max_so_far;
	}

	static void largestSumSubArrayIndex(int[] a){
		int max_so_far, current_max;
		max_so_far = current_max = a[0];
		int start, end, s;
		start = end = s =0;

		for(int i = 1;i<a.length;i++){
			if(a[i]>current_max+a[i]){
				current_max=a[i];
				s=i;
			}
			else
				current_max = current_max+a[i];
			if(current_max>max_so_far){
				max_so_far=current_max;
				start = s;
				end = i;
			}
		}
		System.out.println("Max: "+max_so_far);
		System.out.println("Indexes from: "+start+" to "+end);
	}
}