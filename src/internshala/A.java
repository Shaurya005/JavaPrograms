package internshala;

class A {
 private int t; 
 A(){t=5;} 
 A(A a) 
 {t=a.t;} 
 int p() 
 {return t;}} 
 class B extends A{
 B() {super();} 
 B(B b){ super(b); 
 }}