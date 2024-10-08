package TestAndLearn;/*
Generics mean parameterized types. The idea is to allow type (Integer, String, … etc, and user-defined types) to be a parameter to methods, classes, and interfaces.
Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is called a generic entity.

Why Generics?

The Object is the superclass of all other classes and Object reference can refer to any type object. These features lack type safety. Generics add that type safety feature.
Generics in Java is similar to templates in C++. For example, classes like HashSet, ArrayList, HashMap, etc use generics very well.
There are some fundamental differences between the two approaches to generic types.

Generic Class
Like C++, we use <> to specify parameter types in generic class creation. To create objects of a generic class, we use the following syntax.

// To create an instance of generic class
BaseType <Type> obj = new BaseType <Type>()

Note: In Parameter type we can not use primitives like  'int','char' or 'double'.
 */

// A Simple Java program to show working of user defined Generic classes
// We use < > to specify Parameter type.

class Test1<T>
{
	T obj; // An object of type T is declared
	Test1(T obj) {  this.obj = obj;  }  // constructor
	public T getObject()  { return this.obj; }
}

//	We can also pass multiple Type parameters in Generic classes.

class Test2<T, U>
{
	T obj1;  // An object of type T
	U obj2;  // An object of type U

	// constructor
	Test2(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

// Generic Functions: We can also write generic functions that can be called with different types of arguments based on the type of arguments passed to the generic method,
// the compiler handles each method.

/*
Generics work only with Reference Types:
When we declare an instance of a generic type, the type argument passed to the type parameter must be a reference type. We cannot use primitive data types like int, char.

Test<int> obj = new Test<int>(20);

The above line results in a compile-time error, that can be resolved by using type wrappers to encapsulate a primitive type.
But primitive type array can be passed to the type parameter because arrays are reference type.

ArrayList<int[]> a = new ArrayList<>();
 */

class GenericsInJava
{
	// A Generic method example
	static <T> void genericDisplay (T element)
	{
		System.out.println(element.getClass().getName() + " = " + element);
	}

	public static void main (String[] args)
	{
		// instance of Integer type
		Test1 <Integer> iObj = new Test1<>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test1 <String> sObj = new Test1<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());

		Test2 <String, Integer> obj = new Test2<String, Integer>("GfG", 15);
		obj.print();

		genericDisplay(11); // Calling generic method with Integer argument
		genericDisplay("GeeksForGeeks"); // Calling generic method with String argument
		genericDisplay(1.0); // Calling generic method with double argument

		// Generic Types Differ Based on Their Type Arguments:
		// instance of Integer type
		Test1 <Integer> iObj_ = new Test1<Integer>(15);
		System.out.println(iObj_.getObject());

		// instance of String type
		Test1 <String> sObj_ = new Test1<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		// iObj_ = sObj_; //This results an error
		/*
		Even though iObj and sObj are of type Test, they are the references to different types because their type parameters differ. Generics add type safety through this and prevent errors.
		Advantages of Generics: Programs that use Generics has got many benefits over non-generic code.

		1. Code Reuse: We can write a method/class/interface once and use it for any type we want.

		2. Type Safety: Generics make errors to appear compile time than at run time (It’s always better to know problems in your code at compile time rather than making
        your code fail at run time). Suppose you want to create an ArrayList that store name of students and if by mistake programmer adds an integer object instead of a
        string, the compiler allows it. But, when we retrieve this data from ArrayList, it causes problems at runtime.
	    */
	}
}
/*
// A Simple Java program to demonstrate that NOT using generics can cause run time exceptions
import java.util.*;
class Test
{
    public static void main(String[] args)
    {
        // Creating an ArrayList without any type specified
        ArrayList al = new ArrayList();

        al.add("Sachin");
        al.add("Rahul");
        al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String)al.get(2);
    }
}
Output :

Exception in thread "main" java.lang.ClassCastException:
   java.lang.Integer cannot be cast to java.lang.String
    at Test.main(Test.java:19)

How generics solve this problem?
At the time of defining ArrayList, we can specify that this list can take only String objects.

// Using generics converts run time exceptions into  compile time exception.
import java.util.*;
class Test
{
    public static void main(String[] args)
    {
        // Creating an ArrayList with String specified
        ArrayList <String> al = new ArrayList<String> ();

        al.add("Sachin");
        al.add("Rahul");

        // Now Compiler doesn't allow this
        al.add(10);

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);
        String s3 = (String)al.get(2);
    }
}

Output:
15: error: no suitable method found for add(int)
        al.add(10);
          ^

3. Individual Type Casting is not needed: If we do not use generics, then, in the above example every time we retrieve data from ArrayList, we have to typecast it.
    Typecasting at every retrieval operation is a big headache. If we already know that our list only holds string data then we need not typecast it every time.

// We don't need to typecast individual members of ArrayList
import java.util.*;
class Test
{
    public static void main(String[] args)
    {
        // Creating a an ArrayList with String specified
        ArrayList <String> al = new ArrayList<String> ();

        al.add("Sachin");
        al.add("Rahul");

        // Typecasting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);
    }
}
4. Generics promotes code reusability.
5. Implementing generic algorithms: By using generics, we can implement algorithms that work on different types of objects and at the same, they are type safe too.
 */