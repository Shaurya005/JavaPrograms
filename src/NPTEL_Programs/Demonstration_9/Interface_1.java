package NPTEL_Programs.Demonstration_9;

class Interface_1 implements anInterface//As Interface was defined public so can be accessed anywhere
{
public void display()//Implementing abstract method
{
System.out.println("Fine");
}
public static void main(String args[])
{
Interface_1 t=new Interface_1();
t.display();
System.out.println("The Final value of a in myInterface "+a);

//Attempting to create an object of interface
//anInterface c=new anInterface();//ERROR: Object can't be created

anInterface c2;//OK: Declaration of object only is possible
anInterface c3[]=new anInterface[3];//This is also OK: declaration of array of objects for an interface is permitted.
//Thus we can say that instantiation of an interface isn't possible however declaration of object of interface is possible
}
}