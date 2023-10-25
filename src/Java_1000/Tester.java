package Java_1000;

public class Tester {
	static void call(Long x,Long y){
		System.out.println("Long x, Long y");
	}
	static void call(int... x){
		System.out.println("int... x");
	}
	static void call(Number x,Number y){
		System.out.println("Number x, Number y");
	}
	public static void main(String args[]){
		int val  = 3;
		call(val,val);
	}
}
