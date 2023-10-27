package NPTEL_Programs.Demonstration_9;

/* Multiple Inheritance in Java by interface
Case 3: Example of "extends" with "implements" two or more interfaces
*/
class X_{
protected int i=1000;
void print(){System.out.println("I am from X "+i);
}}

interface C{
public static int j=555;
void printInterfaceC();
}

interface D{
public static int k=666;
void printInterfaceD();
}

class Y_ extends X_ implements C,D
{
public int aValue=999;
public void printInterfaceC(){
System.out.println("I am from C "+j);
}
public void printInterfaceD(){
System.out.println("I am from D "+k);
}
public void printY(){
super.print();
printInterfaceC();
printInterfaceD();
}
}
public class MultiInheritance_3{
 public static void main(String args[]){
 Y_ y=new Y_();
 y.printY();
 }
 }