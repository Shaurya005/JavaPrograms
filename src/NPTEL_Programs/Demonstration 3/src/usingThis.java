//Constructor and Constructor overloading
class Circle1{
	double x,y;//co-ordinates of center
	double r;
	double circumference(){
		return 2*3.14*r;
	}
	double area(){
		return(22/7)*r*r; 
}
Circle1(double x,double y,double z)//Constructor:- Same name as that of class and have no return type
{
this.x=x;this.y=y;this.r=r;
}
Circle1(double r){
	this(0,0,r);
}
Circle1(Circle1 c){//Here we are passing an argument which is Object itself
this(c.x,c.y,c.r);//Basically it is creating duplicate object, i.e different objects with same data values
}
Circle1(){//Default Constructor i.e. without passing any argument
this(0.0,0.0,1.0);
}
//Constructor overloading can be done in terms of argument, no. of argument and type of argument only.
}
class usingThis{
	public static void main(String ar[]){
		Circle1 c1=new Circle1(3.0,4,5.0);
		Circle1 c2=new Circle1(5.0);
		Circle1 c3=new Circle1(c1);
		Circle1 c4=new Circle1();
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