package NPTEL_Programs.Demonstration_6;

//Simple Inheritance
class A{
	int i,j;
	void showij(){
		System.out.println("i and j are "+i+","+j);
	}}
class B extends A{
	int k;
	void showk(){
		System.out.println("k: "+k);
	}
	void sum(){
		System.out.println("i+j+k: "+(i+j+k));
	}
}
public class SimpleInheritance{
	public static void main(String args[]){
		A superOb=new A();
		B subOb=new B();
		superOb.i=10;
		superOb.j=20;
		System.out.println("Contents of superOb: \n");
		superOb.showij();
		subOb.i=7;
		subOb.j=8;
		subOb.k=9;
		System.out.println("Contents of subOb: \n");
		subOb.showij();
		subOb.showk();
//System.out.println("Contents of subOb: "+subOb.showij()+subOb.showk());It is comilation error here as void type is not allowed here
		System.out.println("Sum of i, j and k in subOb: ");
		subOb.sum();
	}
}