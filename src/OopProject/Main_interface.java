package OopProject;

public class Main_interface {
     public static void main(String args[]){
     //new Anima();Creating instance of interface is Not Allowed
	//But creating reference variable is actually allowed
	Anima anima=new Do();//Interface reference --> Do object
	//With help of Do object and anima interface we can use all properties and behavior
	anima.eat();//Using interface we can now control object of dog
	anima.run();
	}
}
interface Anima{

	public static final int value=6;//To make variable value constant final keyword is used. Now it can't be changed in program.
	float pi=3.14f;//Variables are by default public static and final within interface
	abstract public void run();
    void eat();//Abstract and Public in nature automatically by default, it works fine.
}
class Do implements Anima{//Get all the property of Anima interface in class of Do

	int x=10;//Field Variables that should not be in interface, it's a bad practice
	@Override
	//So within interface we can just define our methods
	//And implementation of those methods can be done within subclass
	public void run() {
		System.out.println("Dog is running");
	}
	//When we implement or interface in our class we get all properties of Anima class
	//But we need to care something that we need to override all methods of interface as they all are abstract methods.
	@Override
	public void eat(){
		System.out.println("Dog is eating");
	}
}
/*Rules of interface
    *You cannot create object of interface. They are just blueprint of class i.e. it shouldn't contain any functional code
    * Use implement keyword instead of extends keyword to inherit
    * They can only contain abstract methods.

    1. For Methods
       *They are public and abstract
       * No method body. You can't write code within your method.
    2. For Variables
       *Avoid using field variables
       * But when used they are constants. There values cannot be changed once defined.
       * They are public, static and final
 */