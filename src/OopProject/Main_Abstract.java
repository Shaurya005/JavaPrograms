package OopProject;

import org.w3c.dom.ls.LSOutput;

public class Main_Abstract {
  //Abstract Class and Abstract Methods:- These are special kind of class and method in Java that we create using abstract keyword
    public static void main(String args[]){
  //new Animal__();//Not Allowed. Cannot create objects of Abstract class
    Animal__ animal;//Allowed You can create reference of Abstract class
  //Animal__ animal=new Animal__();Not Allowed as objects can't be created of abstract class
    Animal__ animal1=new Dog__();//But we can create object of child class and assign it to parent reference variable
    animal1.run();//As child class can inherit properties and behavior of parent class so we can use properties and behavior of abstract class by this technique
    animal1.eat();
  }
}
abstract class Animal__{
   public void run(){
	System.out.println("Animal is Running!");
   }
   abstract public void eat();//Showing error that abstract method cannot have a body
  //System.out.println("Animal is eating");Method should always be blank
  //Now since there is nothing in method body so it would be without any curly baces and terminated by ;
}
class Dog__ extends Animal__{
	//Overriding the abstract method in child class as per rule
	//In Java whenever we override abstract method, it's better to use annotation @override
	//It will let the compiler know that we have overrided the method eat
	@Override 
	public void eat(){
		 System.out.println("Dog is eating");
	}
	//To override run method is optional but overriding an abstract method is mandatory
}

/*Rules regarding abstract keyword:
   1.Abstract Class:
     *A class that is declared abstract
     *You cannot create object of abstract class i.e. we can't use 'new Animal__();' inside main method
     *It may or may not contain any abstract method.
	 *It may have abstract as well as non abstract method.
   2.Abstract Method:
     *A method that is declared abstract
     *No method body, You cannot code up in abstract method
     *It is mandatory to override the abstract method in child class
*/