package NPTEL_Programs.Demonstration_6.src;

//Inheritance example: Initializing of subclass object through constructor in subclass and super class.
class Box{
	double width,height,depth;
	Box(){ // Default setting by this constructor
		width=0.0;height=0;depth=0.0;
	}
	Box(double w,double h,double d){
		width = w;
		height= h;
		depth = d;
	}

	double volume(){
		return width*height*depth;
	}
}

class BoxWeight extends Box{
	double weight;
	BoxWeight(){//Default Constructor for BoxWeight
		super();//Call the default constructor in the super class
		weight=0.0;
	}
	//Parameterised Constructor for BoxWeight
	BoxWeight(double w, double h, double d, double m){//Constructor for subclass
/* 
   First Option:
   width = w;
   height= h;
   depth = d;
   weight=m;
*/
		super(w,h,d);//Call the overloaded constructor in the super class
		weight=m;
	}
}

class InheritUsingConstructor{
	public static void main(String a[]){
		Box mybox1=new Box();
		BoxWeight mybox2=new BoxWeight(2,3,4.0,0.076);
		double vol=mybox1.volume();
		System.out.println("Volume of mybox1 is: "+vol+"\n");
//System.out.println("Weight of mybox1 is: "+mybox1.weight+"\n");Compilation Error
		vol=mybox2.volume();
		System.out.println("Volume of mybox2 is: "+vol);
		System.out.println("Weight of mybox2 is: "+mybox2.weight);
	}
} 