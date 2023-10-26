package Internshala;

import java.util.Scanner;

public class Main6 {
	//Stack Memory and Heap Memory
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//new keyword is always used to create object(Instance of Class). It is created in run time in heap memory.
		//Reference Variable sc is stored in Stack memory
		//Now Since Reference Variable sc and object are associated to each other so sc in stack will point to object created inside heap memory
	    //So Reference variable sc is used to access object created in heap memory.
		String name ="Internshala";//Here String is a class and name is reference variable and an object is created within heap memory to store "Internshala"

		//Here again company is reference variable and an object is created in heap memory which is pointed by ref. variable
		char[] array={'w','e','l','c','o','m','e'};
		String firstString="Welcome";//firstString is reference variable
		//This method of creating string is called using literals to create strings
		String SecondString="Welcome";//No new object is created as already created with same value
		//Another way to create string in java using new keyword
		String ThirdString=new String("Welcome");//Here always a new object is created
		System.out.println(firstString==SecondString);//In objects, whenever we use relational operator it is comparing the objects
		System.out.println(firstString==ThirdString);//Comparing two objects
		System.out.println(firstString.equals(ThirdString));//true as here we are comparing values of two different objects
		System.out.println(firstString);
		System.out.println(array);//So string is a sequence of character
		System.out.println(array.length);//It is constant length variable
		System.out.println(firstString.length());//It is length method here
        //String has also indexing as array
		System.out.println(firstString.charAt(2));
		//.toUpperCase(),.toLowerCase();
		System.out.println(firstString.contains("come"));//Return true or False
		System.out.println(firstString+" to Internshala");//Here both are strings
		System.out.println(firstString.concat(" to Internshala"));

	}
}