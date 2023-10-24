package TestAndLearn;

import java.util.HashMap;

public class jj {
	public static void main(String args[]){
		int a[]={6,4,12,14};
		System.out.println(canPair(a,2));
	}

	static boolean canPair(int[] nums, int k) {
		// Code here
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int a : nums)
			hm.put(a%k,hm.getOrDefault(a%k,0)+1);
		for(int a : nums){
			int r = a%k;
			System.out.println(r);
			System.out.println(hm.get(r)%2);
			if(r==0 && hm.get(r)%2!=0) {
				System.out.println("dd");
				return false;
			}
			else if(2*r==k && hm.get(r)%2!=0)
				return false;
			else if(hm.get(r)!=hm.get(k-r))
				return false;
		}
		return true;
	}
}
