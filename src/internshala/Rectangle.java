package internshala;

public class Rectangle {
	float length;  //Instance Variable
	float breadth; //Instance Variable
	//Defining constructor of class. Constructor of class must have same name as class
	//In case of a constructor we never have a return type unlike methods
	//Similar to methods, in case of constructor we can pass some parameters
	public Rectangle(){//Default constructor in java is one which doesn't accept any parameters
		System.out.println("Default Constructor triggered");
	}
	//Constructor overloading is constructors having same name but different parameters/signature
	//Here we can see that default constructor and parameterised constructor are example of constructor overloading
    public Rectangle(float l){//Another constructor is defined showing constructor overloading
		length =l;
		//It is also a parameterised constructor
    }
	public Rectangle(float l, float b){//Whenever we pass parameter in constructor, it is called parameterized constructor
		length=l;
		breadth=b;
		//Primary purpose of constructor in java is to initialise our instance variable
		System.out.println("Parameterised Constructor triggered");
	}
	//Since constructors closely resembles methods so it's also called special type of methods in java
	public float getArea(){
		float area=length*breadth; //Variable inside any method is called local variable.
		return area;
	}
	float getPerimeter(){    //public is not necessary
		float perimeter=2*(length+breadth); //local variable
		return perimeter;
	}
}
/*
----------------------THIS KEYWORD----------------------
package com.internshala.javaapp;
public class Rectangle {
	float length;  //Instance Variable
	float breadth; //Instance Variable

	public Rectangle(){
		this(length: 20.4f);//It must be the very first statement
		this(length: 20.4f, breadth: 10.2f);If we want to call last constructor defined here

		System.out.println("Default Constructor triggered");
	    //Now suppose if we want to call the below constructor here then
		//r1.Rectangle(20.4f); Compiler shows error
		//Whenever we want to use reference variable within class itself, use this keyword
	    //this.Rectangle(20.4); It also shows error because we want to call constructor
	}
	public Rectangle(float length){
		this.length =length;
		//Here this is referring to current instance r1
	}
	public Rectangle(float length, float breadth){//Whenever we pass parameter in constructor, it is called parameterized constructor
		this.length=length;
		this.breadth=breadth;
		//Whenever we defined variables within method or constructor, compiler gives more priority to local keyword
		//So compiler assumes that above both length and both breadth correspond to formal parameter which is local
		//But our purpose is, on LHS we want instance variable length and breadth so we can make compiler understand the same by using this keyword
		System.out.println("Parameterised Constructor triggered");
	}
	public float getArea(){
		float area=length*breadth;
		return area;
	}
	float getPerimeter(){    //public is not necessary
		float perimeter=2*(length+breadth); //local variable
		return perimeter;
	}
}
 */