package NPTEL_Programs.Demonstration_6;

//Use of super keyword: Referring subclass object by super claas variable
class Box_{
	double width,height,depth;
	Box_(){
	}
	Box_(double w,double h,double d){
		width = w;
		height= h;
		depth = d;
	}

	double volume(){
		return width*height*depth;
	}
}

class BoxWeight_ extends Box_{
	double weight;
	//Parameterised Constructor for BoxWeight
	BoxWeight_(double w, double h, double d, double m){
		width = w;
		height= h;
		depth = d;
		weight=m;
	}
}

class SuperKeyword{
	public static void main(String a[]){
		BoxWeight_ weightbox=new BoxWeight_(3,4.0,5,8.76);
		Box_ plainbox=new Box_();
		double vol=weightbox.volume();
		System.out.println("Volume of weightbox is: "+vol+"\n");
		System.out.println("Weight of weightbox is: "+weightbox.weight+"\n");//Compilation Error

//Assigning BoxWeight(Subclass) reference to Box(Super class) reference
		plainbox=weightbox;
		vol=plainbox.volume();//OK, volume() defined in Box
		System.out.println("Volume of the box is: "+vol); //Volume of subclass object but it is reference to super class object
//System.out.println("Weight of mybox2 is: "+plainbox.weight); Invalid because plainbox doesn't define a weight number
	}
}