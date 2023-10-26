package Internshala;

public class Main9 {
	public static void main(String args[]){
		//Creating objects of class Dog
		//A class is template or blueprint from which objects are created
		//Objects are the instance of the class. They have state and behaviour
		Dog dog1=new Dog();
		//Here we have created new object of Dog and dog1 is reference variable
	    dog1.breed="German Shepherd";
	    dog1.size=50;
	    dog1.color="Black";
	    dog1.bark();
	    dog1.run();
		System.out.println(dog1.breed);
		System.out.println(dog1.size);
		System.out.println(dog1.color);

		Dog dog2=new Dog();//We can define as much object of class as we want
		dog2.breed="Labrador";
		dog2.size=35;
		dog2.color="Brown";
		dog2.bark();
		dog2.run();
		System.out.println(dog2.breed);
		System.out.println(dog2.size);
		System.out.println(dog2.color);
		//So for both the dogs we have defined some properties and behaviour
	    Rectangle rect = new Rectangle();
	    rect.breadth=23.34f;
	    rect.length=12.4f;
	    float perimeter=rect.getPerimeter();
	    float area=rect.getArea();
		System.out.println(area+" "+perimeter);
	}
}