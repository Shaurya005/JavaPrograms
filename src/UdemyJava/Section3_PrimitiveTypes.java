package UdemyJava;

public class Section3_PrimitiveTypes {

	public static void main(String[] args) {

		int myValue = 10000;

		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // Overflow
		System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // Underflow

		int myMaxIntTest = 2_147_483_647;

		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);
		System.out.println("Busted MAX value = " + (myMaxByteValue + 1)); // Overflow
		System.out.println("Busted MIN value = " + (myMinByteValue - 1)); // Underflow

		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);
		System.out.println("Short MAX value = " + (myMaxShortValue + 1)); // Overflow
		System.out.println("Short MIN value = " + (myMinShortValue - 1)); // Underflow

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);
		System.out.println("Busted MAX value = " + (myMaxLongValue + 1)); // Overflow
		System.out.println("Busted MIN value = " + (myMinLongValue - 1)); // Underflow

		long l1= 5000; // Here 5000 is an int and as int can be directly assigned to long, it assigns 5000 to l1.
		long l2= 5000L; // Here 5000 is not an int but a long.
		long l3= 2234_3423_2; // Here it won't show any error as it fits into range of int.
		long l4=2234_342_321L; // Here we must have to use L otherwise it will show error as without L Java treats it as Integer and it is out of int range.

		int myTotal = myMinIntValue / 2;
//		byte myNewByteValue  = myMinByteValue / 2; // Here it is showing error because default whole number used by Java is an Int and due to this 2 treated as Int, the whole expression is now treated as an int.
		byte myNewByteValue  = (byte) (myMinByteValue / 2);
		short myNewShortValue = (short) (myMinShortValue / 2);  // Similar is the case here that Java treats 2 as an int and hence whole expression needs to be casted into short.

		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;

		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		System.out.println(longTotal);

		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Minimum Value = " + myMinFloatValue);
		System.out.println("Float Maximum Value = " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double Minimum Value = " + myMinDoubleValue);
		System.out.println("Double Maximum Value = " + myMaxDoubleValue);

		int myInt = 5;
		float myFloat = 5f / 2; // Float can have precision upto 7 digits after decimal
		double myDouble = 5; // Double can have precision upto 16 digits after decimal

		float myFloatVal = 5.25f; // Here if we don't put f then it will show compiler error as required: float found: double as double is the default decimal number in Java so either we put f at the end or cast it explicitly to float.
		double myDoubleVal = 5.25d; // Here if we don't put d then it will not matter as double is the default decimal number in Java. We don't need to explicitly specify this to Java.
		double anotherNumber = 3_000_000.4_567_890d;

		char myUnicodeChar = '\u0044'; // u tells the compiler that it's a Unicode character and then the code.
		System.out.println(myUnicodeChar);

		char myCopyrightChar = '\u00A9'; // So char data type is also used to store Unicode characters.
		System.out.println(myCopyrightChar);

		String myString = "This is a String.";
		myString = myString + " \u00A9 2019";
		System.out.println(myString);

		String lastString = "10";
		int number = 50;
		lastString = lastString + number;
		System.out.println(lastString);
		double num = 120.47d;
		lastString = lastString + num;
		System.out.println(lastString);
	}
}