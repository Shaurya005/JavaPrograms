package Avishkar;/*
Type conversion in Java with Examples
When you assign value of one data type to another, the two types might not be compatible with each other. If the data types are compatible, then Java will perform the
conversion automatically known as Automatic Type Conversion and if not then they need to be casted or converted explicitly.
For example, assigning an int value to a long variable.

										Widening or Automatic Type Conversion

Widening conversion takes place when two data types are automatically converted. This happens when:

The two data types are compatible.
When we assign value of a smaller data type to a bigger data type.
For Example, in java the numeric data types are compatible with each other but no automatic conversion is supported from numeric type to char or boolean.
Also, char and boolean are not compatible with each other.

Byte -> Short -> Int -> Long -> Float -> Double   : Widening or Automatic Type Conversion

										Narrowing or Explicit Conversion

If we want to assign a value of larger data type to a smaller data type we perform explicit type casting or narrowing.
This is useful for incompatible data types where automatic conversion cannot be done. Here, target-type specifies the desired type to convert the specified value to.

Double -> Float -> Long -> Int   : Narrowing or Explicit Conversion

char and number are not compatible with each other. Let’s see when we try to convert one into other.
 */

public class C_Vs_Java {
	public static void main(String args[]) {
		int n = 4;
		float f_ = 5;
		//n = f_; Error Incompatible Data Type
		f_ = n; // // automatic type conversion
		int i = 100;
		long l = i; // automatic type conversion

		float f = l; // automatic type conversion
		f = i + 1;
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
		System.out.println("Float value " + f_);

				/*
				 char ch = 'c';
                 int num = 88;
                 ch = num;
				 Error Incompatible Data Type
				 */

		double d = 100.04;
		l = (long) d; //explicit type casting

		i = (int) l; //explicit type casting
		System.out.println("Double value " + d);
		System.out.println("Long value " + l); //fractional part lost
		System.out.println("Int value " + i); //fractional part lost

		//	While assigning value to byte type the fractional part is lost and is reduced to modulo 256(range of byte). Java program to illustrate Conversion of int and double to byte
		byte b;
		i = 257;
		d = 323.142;
		System.out.println("Conversion of int to byte.");

		b = (byte) i; //i%256
		System.out.println("i = " + i + " b = " + b);
		System.out.println("\nConversion of double to byte.");

		b = (byte) d; //d%256
		System.out.println("d = " + d + " b= " + b);
	}
	/*
									Type promotion in Expressions

While evaluating expressions, the intermediate value may exceed the range of operands and hence the expression value will be promoted. Some conditions for type promotion are:

Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
If one operand is a long, float or double the whole expression is promoted to long, float or double respectively.
	 */
	static void promotions(){
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;

		// The Expression
		double result = (f * b) + (i / c) - (d * s);

		//Result after all the promotions are done
		System.out.println("result = " + result);

		b = 50;
		b = (byte)(b * 2); //type casting int to byte
		System.out.println(b);
	}
	/*
										Explicit type casting in Expressions

While evaluating expressions, the result is automatically updated to larger data type of the operand.
But if we store that result in any smaller data type it generates compile time error, due to which we need to type cast the result.
	 */
}
/*
Widening Primitive Conversion in Java
Try to Guess the output

public class Test
{
    public static void main(String[] args)
    {
        System.out.print("Y" + "O");
        System.out.print('L' + 'O');
    }
}
At first glance, we expect “YOLO” to be printed.

Actual Output:
“YO155”.

Explanation:
When we use double quotes, the text is treated as a string and “YO” is printed, but when we use single quotes, the characters ‘L’ and ‘O’ are converted to int.
This is called widening primitive conversion. After conversion to integer, the numbers are added ( ‘L’ is 76 and ‘O’ is 79) and 155 is printed.

public class Test
{
    public static void main(String[] args)
    {
        System.out.print("Y" + "O");
        System.out.print('L');
        System.out.print('O');
    }
}
Output: YOLO

Explanation: This will now print “YOLO” instead of “YO7679”. It is because the widening primitive conversion happens only when a operator like ‘+’ is present which expects at least integer on both side.

Widening primitive conversion is applied to convert either or both operands as specified by the following rules. The result of adding Java chars, shorts or bytes is an int:

If either operand is of type double, the other is converted to double.
Otherwise, if either operand is of type float, the other is converted to float.
Otherwise, if either operand is of type long, the other is converted to long.
Otherwise, both operands are converted to type int
 */
