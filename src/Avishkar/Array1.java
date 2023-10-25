package Avishkar;/*
An array is a group of like-typed variables that are referred to by a common name. Arrays of
any type can be created and may have one or more dimensions. A specific element in an array
is accessed by its index. Arrays offer a convenient means of grouping related information.

The general form of a one-dimensional array declaration is :
 type var-name[ ]

For example, the following declares an array named month_days with the type “int”:
 int month_days[]

Although this declaration establishes the fact that month_days is an array variable, no
array actually exists. In fact, the value of month_days is set to null, which represents an array
with no value. To link month_days with an actual, physical array of integers, you must allocate
one using 'new' and assign it to month_days. 'new' is a special operator that allocates memory.

The general form of new as it applies to one-dimensional arrays appears as follows:

 array-var = new type[size];

The elements in the array allocated by new will automatically be initialized to zero.

This example allocates a 12-element array of integers and links them to month_days.

month_days = new int[12];

After this statement executes, month_days will refer to an array of 12 integers. Further, all elements in array will be initialized to 0.

Obtaining an array is a two-step process. First, you must declare a variable of the desired array type.
Second, you must allocate the memory that will hold the array, using new, and assign it to the array variable.
Thus, in Java all arrays are dynamically allocated.

Once you have allocated an array, you can access a specific element in the array by
specifying its index within square brackets. All array indexes start at zero.

It is possible to combine the declaration of the array variable with the allocation of the
array itself, as shown here:

int month_days[] = new int[12];

Arrays can be initialized when they are declared. The process is much the same as that used to initialize the simple types.
An array initializer is a list of comma-separated expressions surrounded by curly braces.
The commas separate the values of the array elements. The array will automatically be created large enough to hold the
number of elements you specify in the array initializer. There is no need to use new.

int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 , 323, 400}
 */

public class Array1 {
	public static void main(String a[]){

		int n1[]=new int[10];

		int []n2=new int[10];

		int n3[]={45,78,96};

		int n4[];
		n4=new int[7];

		System.out.println(n1.length+" "+n1[0]);
		System.out.println(n2.length+" "+n2[9]);
		System.out.println(n3.length+" "+n3[0]);
		System.out.println(n4[0]+" "+n4.length);


/*
        int d[][]=new int[4][5]; //d.length
		In Java, multidimensional arrays are actually arrays of arrays. These, as you might expect, look
		and act like regular multidimensional arrays.

		For example, the following declares a twodimensional array variable called twoD.

		int twoD[][] = new int[4][5]

		This allocates a 4 by 5 array and assigns it to twoD. Internally this matrix is implemented as
		an array of arrays of int.
*/

		// Demonstrate a two-dimensional array.
		int twoD[][]= new int[4][5];
				int i, j, k = 0;
				for(i=0; i<4; i++)
					for(j=0; j<5; j++) {
						twoD[i][j] = k;
						k++;
					}
					int arr2[]=new int[5];
				for(i=0; i<4; i++) {
					for(j=0; j<5; j++)
						System.out.print(twoD[i][j] + " ");
					System.out.println();
				}

		int m1[][]=new int[3][4];
		int m2[][]=new int[4][];

		System.out.println(m1.length); //3
		System.out.println(m2.length); //4
		System.out.println(m1[0].length); //4

		for(i=0;i<m2.length;i++){
			m2[i]=new int[i];
		}
		/*
		  m2[0]=new int[0];
		  m2[1]=new int[1];
		  m2[2]=new int[2];
		  m2[3]=new int[3];
		*/
		System.out.println();
		for(i=0;i<m2.length;i++){
			System.out.println(m2[i].length);
		}

		int arr[][]=new int[4][];

		System.out.println(arr.length);
		System.out.println(arr[0].length);//NullPointerException
	}
}
/*
Declaration and initialisation of an array.
If we don’t assign values to array elements, and try to access them, compiler does not produce error as in case of simple variables.
Instead it assigns values which aren’t garbage.

Below are the default assigned values.

boolean : false
int : 0
double : 0.0
String : null
User Defined Type : null

We can define a double dimensional array by mentioning no. of rows only. In that case each row may be of varying column size.
That is row size is necessary to mention but not column size while defining a 2D array

Length of a double dimensional array is the number of rows in it because it's actually array of 1-D arrays.
Length of a particular row of double dimensional array is the number of columns in it.

In case we haven't declared the size of column for a row in 2D array then accessing length of that row will throw NullPointerException
*/