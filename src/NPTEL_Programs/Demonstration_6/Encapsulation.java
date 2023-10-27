package NPTEL_Programs.Demonstration_6;

//Encapsulation defining a class with method
class point{
	int x,y;
	void setPoint(int a,int b){//Initializing object variables by calling some method
		x=a;
		y=b;
	}
}
//Now the feature of automatic initialization of object variable at time of creating object is called constructor
class Encapsulation
{
	float distance;
	public static void main(String argument[]){
		point p1=new point();
		point p2=new point();
		p1.setPoint(15,20);
		p2.setPoint(0,0);
//Here we have to set values by calling some method and so constructor is there to initialize the object values automatically.
		System.out.println(" x1 = "+p1.x);
		System.out.println(" y1 = "+p1.y);
		System.out.println(" x2 = "+p2.x);
		System.out.println(" y2 = "+p2.y);
	}
}