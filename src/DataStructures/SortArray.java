package DataStructures;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = {24,18,38,43,14,40,1,54};
		quickSort(arr,0,arr.length-1);
		for(int e:arr)
		System.out.println(e);
	}

	static void quickSort(int arr[], int low, int high)
	{
		if(low>=high)
			return;

		int pivot=low, i=low+1, j=high;
		int temp;
		while(i<=j){
			while(i<high && arr[i]<=arr[pivot])
				i++;
			while(j>low && arr[j]>=arr[pivot])
				j--;
			if(i<j){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		if(pivot != j)
		{
		temp=arr[pivot];
		arr[pivot]=arr[j];
		arr[j]=temp;
		}
		quickSort(arr,low,j-1);
		quickSort(arr,j+1,high);
	}
}
