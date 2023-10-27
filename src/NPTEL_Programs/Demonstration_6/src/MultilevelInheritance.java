package NPTEL_Programs.Demonstration_6.src;

//Multi-level inheritance
class Box1{
	private double width;
	private double height;
	private double depth;

	Box1(double w,double h,double d){
		System.out.println("I am under Box class");
		width = w;
		height= h;
		depth = d;
	}

	double volume(){
		return width*height*depth;
	}
}

class BoxWeight1 extends Box1{
	double weight;
	//Parameterised Constructor for BoxWeight
	BoxWeight1(double w, double h, double d, double m){//Constructor for subclass
		super(w,h,d);//Calling it's super/parent class
		System.out.println("I am under BoxWeight class");
		weight=m;
	}
}
class Shipment extends BoxWeight{
	double cost;
	Shipment(double w,double h,double d,double m,double c){
		super(w,h,d,m);//call it's parent/super class constructor
		System.out.println("I am under Shipment class");
		cost=c;
	}
}
//So Shipment is an example of multi-level inheritance

class MultiLevelInheritance{
	public static void main(String a[]){
		Shipment shipment1=new Shipment(10,20,15,10,3.41);
		Shipment shipment2=new Shipment(2,3,4,9.76,3.28);
		double vol=shipment1.volume();
		System.out.println("Volume of shipment1 is: "+vol);
		System.out.println("Weight of shipment1 is: "+shipment1.weight);
		System.out.println("Shipping Cost: "+shipment1.cost+"\n");
		vol=shipment2.volume();
		System.out.println("Volume of shipment2 is: "+vol);
		System.out.println("Weight of shipment2 is: "+shipment2.weight);
		System.out.println("Shipping Cost: "+shipment2.cost+"\n");
	}
}