public class Main_Polymorphism {
//Polymorphism(Greek Words):One Name but Many Forms. Poly means many and morph means forms
//Two types of polymorphism in Java 1.Runtime Polymorphism 2.Compile time Polymorphism
//Runtime Polymorphism --> Method Overriding, Compile time Polymorphism --> Method and Constructor Overloading
//Concept of method overriding can only be implemented when inheritance is involved
public static void main(String[] args) {
	Dog_ dog=new Dog_();
	dog.run();//It access run method defined in parent class of Dog i.e. Animal as run method isn't present within Dog_ class
    //But what if we want "Dog is running" in spite of "Animal is running" then we use concept of method overriding
	Animal_ animal1=new Animal_();//animal1(reference variable --> Object created A in heap memory(suppose)
	animal1.run();//Animal is running
	Animal_ animal2=new Dog_();//animal2(in stack memory) --> Object created D in heap memory(suppose)
	//When we have reference variable of parent class on LHS and object of child class on RHS
	//Compiler shows no error as it is allowed in Java
	animal2.run();
	//Dog is running i.e. even if we use Animal as reference variable then also Object of Dog is created
	//So it will call method of Dog object irrespective of what we have on LHS
	//So this concept of having Parent/Super class on LHS and child object on RHS is called upcasting in Java
	//Dog_ dog=new Animal_();//Here It shows compilation error i.e. child reference can never point to parent class object
	//But there is a remedy for this, just downcast above expression
	Dog_ dog2=(Dog_)new Animal_();//Downcasting, But here we loose some data
}
}
class Animal_
{
	public void run() {
		System.out.println("Animal is running");
		//In runtime this method will be ignored as method with same name is defined in Dog class
	}
}
class Dog_ extends Animal_//Here we inheriting all the property of Animal into Dog
{
	public void run() {
		super.run();//It would call run method within parent/super class
		System.out.println("Dog is running");//Now JVM gives more priority to own method rather than parent method with same name
		//Hence parent method is ignored i.e. overridden
		super.run();//It would call run method within parent/super class
		//super keyword is used to call Parent class from child class
	}
	public void bark(){
		System.out.println("Wooh! Wooh!");
	}
}
//Basic difference between method overriding and method overloading is that in overriding multiple classes is involved.
//and same method name as well as return type but can have different code enclosed within parenthesis
//i.e. method signature must be exactly same in method overriding