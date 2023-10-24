package TestAndLearn;

import java.util.LinkedList;
public class RotateArray {
	public static void main(String a[]) {
		int arr[] = {1, 2, 3, 4, 5, 6, 68, 9, 56};
		anticlockwise(arr, 2); // Here our arr array is also changed due to rotation in anticlockwise function
		System.out.println();
		clockwise(arr,4);
	}

	static void anticlockwise(int ar[],int k){
		LinkedList<Integer> a=new LinkedList<>();
		k=k%ar.length;
		int n=ar.length-k;
		for(int i=0;i<ar.length;i++){
			if(i<n)
				a.add(ar[i]);
			else
				ar[i-n]=ar[i];
		}
		for(int i=k;i<ar.length;i++)
			ar[i]=a.remove();

		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}

	static void clockwise(int arr[],int k){
		LinkedList<Integer> a=new LinkedList<>();
		k=k%arr.length;
		int n=arr.length-k;
		for(int i=0;i<arr.length;i++){
			if(i<k)
				a.add(arr[i]);
			else
				arr[i-k]=arr[i];
		}
		for(int i=n;i<arr.length;i++)
			arr[i]=a.remove();

		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
