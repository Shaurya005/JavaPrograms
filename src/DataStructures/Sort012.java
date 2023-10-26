package DataStructures;

import java.util.Arrays;

class sort012 {
	static void sort012_(int a[], int n)
	{
        /*
        TreeMap<Integer,Integer> tm =new TreeMap();
        int i;
        for(i=0;i<n;i++){
            if(tm.get(a[i])==null)
                tm.put(a[i],1);
            else
                tm.put(a[i],tm.get(a[i])+1);
        }
        for(i=0;i<tm.get(0);i++)
          a[i]=0;
        for(i=tm.get(0);i < tm.get(0)+tm.get(1);i++)
          a[i]=1;
        for(i=tm.get(0)+tm.get(1);i < tm.get(0)+tm.get(1)+tm.get(2);i++)
          a[i]=2;
          */
		Arrays.sort(a);
	}

	static void sort012(int a[], int arr_size)
	{
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
				case 0: {
					temp = a[lo];
					a[lo] = a[mid];
					a[mid] = temp;
					lo++;
					mid++;
					break;
				}
				case 1:
					mid++;
					break;
				case 2: {
					temp = a[mid];
					a[mid] = a[hi];
					a[hi] = temp;
					hi--;
					break;
				}
			}
		}
	}

	static void printArray(int arr[], int arr_size)
	{
		int i;
		for (i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	public static void main(String[] args)
	{
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int arr_size = arr.length;
		sort012(arr, arr_size);
		System.out.println("Array after segregation ");
		printArray(arr, arr_size);

		int ar[] = { 0, 1, 1, 0, 0, 0, 1, 2, 1, 1, 1, 1, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sort012_(ar, ar.length);
		System.out.println("Array after segregation ");
		printArray(ar, ar.length);
	}
}