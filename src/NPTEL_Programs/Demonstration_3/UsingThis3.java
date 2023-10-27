package NPTEL_Programs.Demonstration_3;

//Program to demonstrate use of this: to invoke current class method
//Special use of this keyword: No object creation to invoke method
class A{
void m(){System.out.println("Hello m");}
void n(){
System.out.println("Hello n");
this.m();//In order to call a method we need to create object but to access method within same class, this method can be used.
//So this method is used to access a method within same class without creating an object.
}
A(){//Here A is a default constructor
	this(5);//Calling constructor within other constructor
	System.out.println("hello a");
}
A(int x){//It is parameterised constructor
	System.out.println(x);
}}
class UsingThis3{
public static void main(String s[]){
A a=new A();
a.n();
}
} 