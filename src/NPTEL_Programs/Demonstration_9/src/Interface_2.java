package NPTEL_Programs.Demonstration_9.src;/*A class can implement an interface and that class will be used as normal class if all the abstract functions of interface are implemented.
  while an Interface cannot interface another interface. And also an interface can not implement a class either abstract or non abstract.
  No method can be declared final(modifier) or static in case of interface  */

interface I1{

public static double PI=3.1413434567;//Final implicitly
static final double lambda=0.04;//public implicitly
//double n; //Declaration of any instance variable is not allowed. int x without any initialization works as instance variable
double n=100;//Initilization of variable is necessary.
//private static final int p=444; //ERROR: private/protected is NOT allowed.
//abstract public static void method_1();//Static method is not allowed
void method_2();//public abstract by default 
}
class A1 implements I1{
public int a1=555;
public void method_1(){
System.out.println("From I1 "+PI);
}
public void method_2()//There must be public specifier if we implement any function of interface
//If private, protected or no specifier is given (default specifier) then compiler shows "attemting to assign weaker access privileges;" was public.
{
System.out.println("From I1 "+lambda);
}}

public class Interface_2
{
public static void main(String a[]){
A1 a_=new A1();
a_.method_1();
a_.method_2();
}}