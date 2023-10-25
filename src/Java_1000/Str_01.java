package Java_1000;

public class Str_01 {
	public static void main(String args[]){
		System.out.println(n_squares(10));
	}
	static String n_squares(int n){
		StringBuffer s=new StringBuffer("0");
		int n_squared = n*n;
		for(int i=0;i<n_squared;i++)
			s.append(", " + i);
		return s.toString();
	}
	static void call(Number x,Number y){
		System.out.println(" Number x, Number y ");
	}
}
