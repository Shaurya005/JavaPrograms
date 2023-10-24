package TestAndLearn;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger b1 = new BigInteger("12");
		BigInteger b2 = new BigInteger("21213121444211");
//		System.out.println(b1+b2); This line will show error as direct arithmetic operations (+,-,*,/) can't be performed on BigInteger.
		System.out.println(b1.add(b2));
		System.out.println(b2.subtract(b1));
		System.out.println(b1.multiply(b2));
		System.out.println(b2.divide(b1));

//		For converting value of int to BigInteger, use BigInteger.valueOf()
		int a = 12, b = 12;
		b1 = BigInteger.valueOf(a);
		b2 = BigInteger.valueOf(b);
		System.out.println(b1.equals(b2));
		System.out.println(b1.gcd(b2));

//		For reading input from user as BigInteger, take input in String variable and then pass it to BigInteger.
		System.out.println("Enter a BigInteger");
		String s = sc.nextLine();
		b1 = new BigInteger(s);
		System.out.println(b1.pow(50));

		System.out.println(b1.bitCount()); // Count no. of set bits in b1.
		System.out.println(b1.bitLength());// Count total no. of bits in b1.
		System.out.println(b1.clearBit(2));// Returns number after clearing bit at 2th position (0-indexed)
		System.out.println(b1);// b1 remains unchanged though clearBit and setBit just returns the modified number but original number remains unaffected.
		System.out.println(b1.setBit(1));// Returns number after setting bit at 1th position (0-indexed)

		b1 = new BigInteger("1001",2); // It will throw error if used numbers others than 0 and 1.
		b2 = new BigInteger("1073",8);// It will throw error if used numbers other than octal number i.e. 0-7.
//		It treats the number as corresponding to the given base and then it converts it to decimal integer to store i.e. it converts any number system to decimal system.
		System.out.println(b1+" "+b2);

		System.out.println("Factorial of 100 is: "+factorial(100));
	}

	static BigInteger factorial(int N){
		BigInteger fact = new BigInteger("1");
		for(int i=2;i<=N;i++)
			fact = fact.multiply(BigInteger.valueOf(i));
		return fact;
	}
}