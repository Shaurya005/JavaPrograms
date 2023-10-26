/* Multiple Inheritance in Java by interface
Case 2: Example of "extends" with "implements"
*/
class X{
protected int j=1000;
void print(){System.out.println("I am from X "+j);
}}

interface I{
public static int i=555;
void printInterface();
}

class Y extends X implements I
{
public int aValue=999;
public void printInterface(){
System.out.println("I am from I "+i);}
public void printY(){
super.print();
printInterface();
}
}
public class MultiInheritance_2{
 public static void main(String args[]){
 Y y=new Y();
 y.printY();
 }
 }