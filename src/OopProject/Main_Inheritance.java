package OopProject;

//Within one file we can create multiple classes as well but with restriction that only one class can be public
public class Main_Inheritance
{
	public static void main(String args[]) {
	//Property of inheriting property and behaviour from one class to other is called inheriansce
	//NOTE: Always use Getter and Setter for each variable, never use instance variable directly with the help of reference variable
	//Advantages - Code Re-usability and Method Overriding
		Dog dog=new Dog();
        dog.color="Black";
        dog.name="Labrador";
        dog.bark();
        dog.run();
        Cat cat=new Cat();
        cat.name="Persian Cat";
        cat.pattern="tabby";
        cat.meow();
        cat.run();
        Animal animal=new Animal();
        animal.name="My Animal";
        animal.run();
        //WE can't access child class methods or properties in parent/Superclass class
		//So superclass can only access its own properties and behaviour
	}
}
	 class Animal{
	 String name;
	 public void run() {
		 System.out.println("Animal is running");
	 }
	 }
	 class Dog extends Animal//Here we inheriting all the property of Animal into Dog
	 {
	 String color;
	 public void bark(){
		 System.out.println("Wooh! Wooh!");
	 }
	 }
	 class Cat extends Animal//Rest of properties can be inherited from class Animal
	 {
	 String pattern;
	 public void meow(){
		 System.out.println("Meow ! Meow!");
	 }
	 }
	 // Here class of Dog and Cat is called SUB class, CHILD class and class of Animal is called SUPER class or BASE class or PARENT class