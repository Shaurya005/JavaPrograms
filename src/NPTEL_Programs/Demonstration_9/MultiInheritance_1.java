package NPTEL_Programs.Demonstration_9.src;

/* Multiple Inheritance in Java by interface
Case 1: Example of class which implements two interfaces
*/
interface I1_{
	static int i=123;
	void printI1();
}

interface I2_{
	public int j=555;
	void printI2();
}
	
class A3 implements I2_,I1_
{ 
public int aValue=999;
public void printI1(){
System.out.println("I am from I1 "+i);
}
public void printI2(){
System.out.println("I am from I2 "+j);
}
public void printA(){
System.out.println(" I am from A "+ (aValue=i+j));
}
}

class MultiInheritance_1{
public static void main(String a[]){
A3 b_=new A3();
b_.printA();
b_.printI1();
b_.printI2();
}
}