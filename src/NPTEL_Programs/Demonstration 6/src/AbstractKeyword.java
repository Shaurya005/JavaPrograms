//An abstract class example: Abstract class and Abstract Methods , atype of access specifier
//Abstract class may or may not have an abstract method
//If class is declared abstract then no object can be created for that but this class can be used to inherit some other class means abstract class can be used as super class but no object can be created.
//But abstract class may have it's own constructor i.e. it can be used to initialize member element if it is there. Here this constructor will be utilised to initialize the object of subclass of this class

abstract class Base{

	Base(){System.out.println("Base Constructor is called");} //Constructor of an abstract class
	abstract void fun();//No code need to be mention here as function is defined abstract

	void fun_(){ //Non abstract method in abstract class
		System.out.println("Base Function is called");}
}
class Derived extends Base{
	Derived(){
		//Call to super must be first statement in constructor
		super(); //abstract class constructor is called here by subclass constructor
		System.out.println("Derived Constructor is called");
	}
	//For an abstract method, in subclass method must be declared and defined properly i.e. overriden
	void fun(){

		super.fun_();//Calling non-abstract method in an abstract class, although object isn't created but it will be accessed
		System.out.println("Derived Function is called");}
}

class AbstractKeyword{
	public static void main(String ar[]){
		//Base b=new Base();
		//Uncommenting the above line results in compilation error as Abstract class can not be instanciated.

		//But we can have reference of Base type. Here it is upcasting
		Base b= new Derived();
		b.fun();
		Derived d=new Derived();
		d.fun();
	}
}