package NPTEL_Programs.Demonstration_3;

//Encapsulation in Java. In java writing program means writing sets of classes and all classes can be used to create object
class Circle{
	double x,y;//co-ordinates of center
	double r;
	double circumference(){
		return 2*3.14*r;
	}
	double area(){
		return(22/7)*r*r;
}
}
class Box{
	double width,height,depth;
	double area(){
		double a=2*(width*height+depth*width+height*depth);
	return a;}
	double volume(){
		double v;
		v=width*height*depth;
return v;}}

//Following class declares multiple object of type Circle and Box
class Encapsulation2{
	public static void main(String ar[]){
		Box b=new Box();
		b.width=3.0;b.height=4.0;b.depth=5.0;
		Circle c1=new Circle();
		Circle c2=new Circle();
		c1.x=3.0;c1.y=4.0;c1.r=5.0;
		c2.x=4.0;c2.y=8.0;c2.r=10.0;
		System.out.println("Circumference Circle 1 "+c1.circumference());
		System.out.println("Area circle 1 "+c1.area());
		System.out.println("Circumference Circle 2 "+c2.circumference());
		System.out.println("Area Circle 2 "+c2.area());
		System.out.println("Area of the Box "+b.area());
		System.out.println("Volume of the Box "+b.volume());
	}
}
//Here in form of encapsulation we create a class circle and for this class we created object