public class Main_static {
	//In Java we can have variable and method static in nature but apart from this we have static blocks and nested static classes
	//Main_static.main(); To invoke main method as Static method
	//If we remove static keyword then we won't find any run option in window
    //As in order to execute our Java Program, we need to have at least one static main method then only our code will run
	
	public static void main(String args[])
	{
    Employee e1=new Employee();
    e1.name="Rahul";
	Employee e2=new Employee();
	e2.name="Sam";
    //Employee.company="Oracle";Compilation Error as it is declared final
    //e1.company; Can't be accessed like this i.e. by objects as it is static'
	System.out.println(Employee.company);//It has nothing to do with object e1 and e2
	Employee.count=27;
	//So without creating any object we can change value of static variable count
	System.out.println(Employee.count);
    //Similar to static variable, static method can be accessed by similar syntax
	Employee.FirstStaticMethod();//So without creating object we can simply invoke method inside the class of Employee
	}
}

//Whenever we define variable, it is actually present within class

class Employee{
 public String name;//It will vary for each employee object
 static final String company="InternShala";//So for each of the object company is always InternShala

/*Whenever we declare a static variable in java belongs to class
  and not to particular object because it's common to all employee objects
  So in runtime only one String variable is created for all employee objects within memory so it will save the memory
  As company name will be internshala for all employee so we canmake it constant by final keyword
*/
 //Now to create static variable whose value always change
	static int count=0; //Static Variable/Class Variable;
    public static void FirstStaticMethod(){ //Static/Class Method
	System.out.println("My First Static method");
	System.out.println(count);
	//If we are accessing static variable within same class then Employee name is not required like above count is accessed
	//  System.out.println(name); Compilation Error as name is non static and we can only access static class variable
    // test();//We can't invoke non static method in static method
    Employee.test_();
    test_();//It also works perfectly fine
    }
    public void test(){
    //	Your Code...
    }
	public static void test_(){
		//	Your Code...
	}
}
/*
1. Static Variables
     *Use ClassName.VariableName to access the variables
       Do not use objects to access static variables.
     *It belongs to the Class not the object. So they are called Class Variables.
2. Static Methods
     *Use ClassName.MethodName() to invoke the static method
       Do not use objects to access static variables
     *It belongs to the Class not the object. So they are called CLASS METHODS
     *Static methods can only access static class variables.
     *Static method can only invoke a static class methods.
 */