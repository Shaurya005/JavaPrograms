package TestAndLearn;/*
Arrays class in Java

The Arrays class in java.util package is a part of the Java Collection Framework. This class provides static methods to dynamically create and access Java arrays.
It consists of only static methods and the methods of Object class. The methods of this class can be used by the class name itself.

The class hierarchy is as follows:

java.lang.Object
 ↳ java.util.Arrays
Geek, now you must be wondering why do we need java Arrays class when we are able to declare, initialize and compute operations over arrays.
The answer to this though lies within the methods of this class which we are going to discuss further as practically these functions help programmers
expanding horizons with arrays for instance there are often times when loops are used to do some tasks on an array like:

Fill an array with a particular value.
Sort an Arrays.
Search in an Arrays.
And many more.
Here Arrays class provides several static methods that can be used to perform these tasks directly without the use of loops, hence forth making our code super short and optimized.

Syntax: Class declaration

public class Arrays extends Object

Syntax: In order to use Arrays
Arrays.<function name>;
 */

// Java Program to Demonstrate Arrays Class Via asList() method
// Importing Arrays utility class from java.util package
import java.util.Arrays;
class ArraysClass {
	public static void main(String[] args)
	{
		int intArr[] = { 10, 20, 15, 22, 35 };
		System.out.println("Integer Array as List: " + Arrays.asList(intArr)); // To convert the elements as List

		Arrays.sort(intArr);
		int intKey = 22;
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey)); //This methods search for the specified element in the array with the help of the binary search algorithm.

		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));
		// binarySearch(array, fromIndex, toIndex, key, Comparator) Method. This method searches a range of the specified array for the specified object using the binary search algorithm.

		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		// System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr, intArr1));

		// To compare both arrays
		// System.out.println("Integer Arrays on comparison: " + Arrays.compareUnsigned(intArr, intArr1));

		System.out.println("Integer Array: " + Arrays.toString(intArr));
		System.out.println("\nNew Arrays by copyOf:\n");
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArr, 10))); // copyOf(originalArray, newLength) Method

		System.out.println("Integer Array: " + Arrays.toString(intArr));
		System.out.println("\nNew Arrays by copyOfRange:\n");
		// To copy the array into an array of new length
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(intArr, 1, 3))); // copyOfRange(originalArray, fromIndex, endIndex) Method

		// Detailed Link - https://www.geeksforgeeks.org/array-class-in-java/
	}
}