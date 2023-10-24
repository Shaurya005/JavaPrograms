package CN_CompetitiveProgramming;

import java.util.Scanner;

public class UniqueNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// For finding a unique number which is only once in series of number where every other elements occur twice.
//		int n = sc.nextInt();
//		int ans = 0;
//		for(int i=0;i<n;i++){
//			int num = sc.nextInt();
//			ans = ans^num;
//		}
//		System.out.println(ans);
		// For finding a number is even or odd, just & it with 1, if output is 0 then it's even and odd otherwise.
		int n = 50;
		System.out.println(isEven(n));
		System.out.println(getBit(50,1));
		System.out.println(setBit(50,3));
		System.out.println(clearBit(n,1));
		System.out.println(updateBit(n,2,1));

		System.out.println(~0);
		System.out.println(~-1);
		n = 31;
		System.out.println(clearLast_i_bit(n,2));
		System.out.println(clear_range_of_bits(n,1,3));
		System.out.println(replaceBits(15,2,1,3));
		System.out.println(countSetBits(13));
		System.out.println(countSetBitsFast(13));
		System.out.println(decimalToBinary(13));
	}

	static boolean isEven(int n){
		return (n&1)==0;
	}

	static int getBit(int n,int i){ // Getting ith bit from the right.
		int mask = 1<<i;
		int bit = (n&mask)>0?1:0;
		return bit;
	}

	static int setBit(int n,int i){ // Setting ith bit i.e. making ith bit 1.
		int mask = 1<<i;
		int ans = n | mask;
		return ans;
	}

	static int clearBit(int n,int i){
		int mask = ~(1<<i);
		return n&mask;
	}

	static int updateBit(int n,int i,int v){
		int mask = ~(1<<i);
		int cleared_n = n&mask;
		n = cleared_n | (v<<i);
		return n;
	}

	static int clearLast_i_bit(int n,int i){
		int mask = -1<<i;
		int res = n&mask;
		return res;
	}

	static int clear_range_of_bits(int n,int i,int j){
		int a = -1<<(j+1);
		int b = (1<<i)-1; // 2^i-1;
		int mask = a|b;
		return n&mask;
	}

	static int replaceBits(int n,int m,int i,int j){
		int n_ = clear_range_of_bits(n,i,j);
		int ans = n_|(m<<i);
		return ans;
	}

	// Given a number n, find no. of set bits in binary representation of it.
	static int countSetBits(int n){
		int ans=0;
		while(n>0){
			ans += n&1;
			n = n>>1;
		}
		return ans;
	}

	static int countSetBitsFast(int n){
		int ans=0;
		while(n>0){
			n = n&(n-1);
			ans++;
		}
		return ans;
	}

	static int decimalToBinary(int n){
		int p=1;
		int ans=0;
		while(n>0){
			int last_bit = n&1;
			ans+=p*last_bit;
			p*=10;
			n=n>>1;
		}
		return ans;
	}
}