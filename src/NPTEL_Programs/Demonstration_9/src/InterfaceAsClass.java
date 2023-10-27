package NPTEL_Programs.Demonstration_9.src;

// An interface acts like a class. That is we can do everything as we can do with class except the object instantiation.
interface I2{
double x=4.444;
void methodI1();
}

interface I3 extends I2 //Here I3 inherits I2
{
double y=5.555;
void methodI2();
}

class A2 implements I3{
public int a1=555;
public void methodI1(){
System.out.println("From I1 "+x+y);
}
public void methodI2(){
System.out.println("From I2 "+x+y);
}
}

class InterfaceAsClass{
public static void main(String a[]){
A2 a__=new A2();
a__.methodI1();
a__.methodI2();
}
}