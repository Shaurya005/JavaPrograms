package CN_CompetitiveProgramming;

public class PrimeSieve {
	public static void main(String args[]){
		System.out.println(isPrime(111));
		int p[] = new int[1000005];
		prime_sieve(p);
		// Now let's print primes upto some number n;
		int n = 1000;
		for(int i=0;i<=n;i++)
			if(p[i]==1)
				System.out.println(i);
	}

	static boolean isPrime(int n){
		if(n==1)
			return false;
		if(n%2==0)
			return false;
		for(int i = 3;i*i<=n;i+=2){
			if(n%i==0)
				return false;
		}
		return true;
	}

	// Sieve Approach - Generate a array containing Prime Numbers
	static void prime_sieve(int p[]){
		// First mark all odd numbers as prime
		for(int i = 3;i<=1000000;i+=2)
			p[i] = 1;

		for(int i=3;i<=1000000;i+=2){
			// If the current element is marked 1(it is prime)
			if(p[i]==1){
				// mark all the multiples of i as not prime i.e. 0;
				for(long j=(long)i*i; j<1000000;j+=i)
					p[(int) j] = 0;
			}
		}
		// special case
		p[2] = 1;
	}
}
