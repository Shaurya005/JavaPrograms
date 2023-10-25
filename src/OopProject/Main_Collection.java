import java.util.ArrayList;
import java.util.List;

public class Main_Collection {
	public static void main(String args[]) {
		//Collection framework provides an architect to store objects and modify/manipulate them
		//Array is not included in collection framework because of its disadvantage i.e. i) Fixed Size ii) Can't add new element
		//Under collection framework, we have various data structure among which most important ones are ArrayList and HashMap
		//ArrayList is a class which has interface List and HashMap is a class which implements Interface of Map
		//ArrayList is a sequential collection of objects and Hash map is collection of objects in form of key-value pairs
		//Primitive Data and Boxed Type Data. ArrayList and HashMap can only store objects and can't store primitive data type i.e. collection framework can't store primitive data type
		//So in order to store primitive data values like integers, float, boolean in collection framework, we have Boxed Type Data(Actually Objects) in Java
		//For each data type we have Boxed Type class defined in Java that starts with Capital letters that shows that it's a class
		//Creating object of array list where ArrayList class is present in java.util package which need to be imported
		//Assigning object created to reference variable of parent class List which is present in Java.util package
		//By concept of interface, ArrayList object is interacting the outside world with help of List interface

		List<String> namesList = new ArrayList();//Parameter within <> must be a class like Integer, Boolean, Float, Dog, Animal but it shouldn't be primitive data type
		//It means list of String if String is in < >
		namesList.add("Sam");//0
		namesList.add("Rahul");//1
		namesList.add("Mohit");//2
		//Index of Sam, Rahul, Mohit is 0,1,2 respectively
		namesList.add("Tony");//3
//	We can add any duplicate element for example we can add Sam object again
		namesList.add("Sam");//4

		System.out.println(namesList.get(2));//For extracting data from our list, we have method get
//For printing all elements present in list, we can use for loop but we'll use its advanced form for each loop

// Now various operations can be performed on ArrayList for example
		namesList.remove(1);//Remove the element Rahul
		namesList.add("Peter");//Added at the end
		namesList.add(1, "Preet");//Added at index 1 without deleting any element
		namesList.set(1, "Rahul");//Replace element at index 1 by "Rahul"
		namesList.remove("Mohit");

		for (String name : namesList)//For each loop
		{
			System.out.println(name);
		}
		//Creating ArrayList of employee and print all names
		Employee_ e1 = new Employee_("Albert");
		Employee_ e2 = new Employee_("Aarav");
		Employee_ e3 = new Employee_("Akash");
		List<Employee_> employeeList = new ArrayList();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e1);//Duplicate element can be added
		employeeList.add(e3);
		for(Employee_ employee:employeeList){
			System.out.println(employee.name);//As name is present within another Class Employee
		}
	}}
	class Employee_{
		String name;
		public Employee_(String name){
			this.name=name;
		}
	}
/* List: Interface
   ArrayList: Class that implements List
      class ArrayList implements List{//In Java internally, it's not like that but there is one more layer of abstraction b/w ArrayList and List
      //For now just remember ArrayList indirectly implements List interface
      .....
      }
   List Properties:
     1. They can store only objects
     2. It cannot store primitive data type i.e. you can't store int, float, char, etc
     3. Elements are present in sequence i.e. they are indexed. Index starts from 0,1,2,3...
     4. It can contain duplicate elements
 */