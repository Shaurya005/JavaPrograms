package DataStructures;

import java.lang.*;
import java.util.*;
import java.util.LinkedList;

class ForkJava
{
	public static void main (String[] args)
	{
		/*Queue<Character> q = new LinkedList();
		q.add('a');
		q.add('b');
		q.add('c');
		System.out.println(q);
		System.out.println(q.remove());

		StringBuffer str1 = new StringBuffer("Fork Java");
		char ch[] = {'O', 'n', 'l', 'i', 'n','e', ' ', 'C', 'o', 'u', 'r', 's', 'e'};
		str1.append(ch, 5, 8);
		System.out.print(str1);

		String st1 = "Geeks";
		String st2 = "eeGesk";

		int res = 0, i;
		for(i = 0; i < st1.length(); i++)
			res ^= st1.charAt(i);

		for(i = 0; i < st2.length(); i++)
			res ^= st2.charAt(i);
		System.out.println();
		System.out.print((char)res);

		int arr[] = {1,2,3,4,4};
		System.out.println(Method(arr,5));

		TreeSet ts = new TreeSet();
		ts.add(6);
		ts.add(5);
		ts.add(7);
		ts.add(8);
		ts.add(1);
		ts.add(2);

		TreeSet hdset = new TreeSet();
		hdset = (TreeSet)ts.headSet(6);
		Iterator itr = hdset.iterator();

		while(itr.hasNext())
			System.out.print(itr.next() + " ");

		TreeMap obj = new TreeMap<>();
		obj.put('A', 1);
		obj.put('B', 2);
		obj.put('C', 3);
		System.out.println(obj.entrySet());
		*/
	int in[]={4,2,5,1,3,6};
	int pre[]={1,2,4,5,3,6};
	//printPostOrder(in,pre,6);

	int arr[]={4,3,2,3,5,2,1};
		System.out.println(canPartitionKSubsets(arr,4));
	}
	static int preIndex;
	static void printPostOrder(int in[], int pre[], int n)
	{
		// Your code here
		preIndex=0;
		helper(in,pre,0,n-1);
	}

	static void helper(int in[],int pre[],int start,int end){
		if(start>end)
			return;
		if(start==end)
			System.out.print(pre[preIndex++]);
		int n=pre[preIndex++];
		int index=getIndex(in,n,start,end);
		helper(in,pre,start,index-1);
		helper(in,pre,index+1,end);
		System.out.print(n);
	}

	static int getIndex(int in[],int n,int start,int end){
		for(int i=start;i<=end;i++)
			if(in[i]==n)
				return i;
		return -1;
	}

	static int Method(int arr[], int n)
	{
		int res = 0;
		for (int i = 0; i < n; i++)
			res = res ^ arr[i];
		return res;
	}

	static boolean canPartitionKSubsets(int[] nums, int k) {
		int sum=0,n=nums.length;
		for(int i=0;i<n;i++)
			sum+=nums[i];
		if(sum%k!=0)
			return false;
		sum=sum/k;
		int t[][]=new int[n+1][sum+1];
		for(int row[]:t)
			Arrays.fill(row,-1);
		int count = count(nums,n,sum,t);
		System.out.println(count);
		if(count==k)
			return true;
		return false;
	}

	static int count(int arr[],int n,int sum,int t[][]){
		if(sum==0)
			return 1;
		if(n==0)
			return 0;
		if(t[n][sum]==-1){
			if(arr[n-1]<=sum)
				t[n][sum]=count(arr,n-1,sum-arr[n-1],t)+count(arr,n-1,sum,t);
			else
				t[n][sum]=count(arr,n-1,sum,t);
		}
		return t[n][sum];
	}
}