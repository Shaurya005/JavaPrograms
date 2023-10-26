//Constructor and Constructor overloading
class Circle2{
	double x,y;//co-ordinates of center
	double r;
	double circumference(){
		return 2*3.14*r;
	}
	double area() {
		return(22/7)*r*r; 
}
Circle2(double a,double b,double c)//Constructor:- Same name as that of class and have no return type
{
x=a;y=b;r=c;
}
/*
Circle1(double x,double y,double z)//Constructor:- Same name as that of class and have no return type
{
this.x=x;this.y=y;this.r=r;
}
 */
Circle2(double c){
	x=0;y=0;r=c;
}
Circle2(Circle c){//Here we are passing an argument which is Object itself
x=c.x;y=c.y;r=c.r;//Basically it is creating duplicate object, i.e different objects with same data values
}
Circle2(Circle2 c){
	this(c.x,c.y,c.r);
	}
Circle2(){//Default Constructor i.e. without passing any argument
x=0.0;y=0.0;r=1.0;
}
}
class Demonstration_33{
	public static void main(String ar[]){
		Circle2 c1=new Circle2(3.0,4,5.0);
		Circle2 c2=new Circle2(5.0);
		Circle2 c3=new Circle2(c1);
		Circle2 c4=new Circle2();
		System.out.println("Circumference Circle 1 "+c1.circumference());
		System.out.println("Area circle 1 "+c1.area());
		System.out.println("Circumference Circle 2 "+c2.circumference());
		System.out.println("Area Circle 2 "+c2.area());
		System.out.println("Circumference Circle 1 "+c3.circumference());
		System.out.println("Area circle 3 "+c3.area());
		System.out.println("Circumference Circle 2 "+c4.circumference());
		System.out.println("Area Circle 4 "+c4.area());
		}
}