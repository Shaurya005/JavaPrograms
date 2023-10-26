class UsingPrintf
{
public static void main(String args[])
{
int x=100;
System.out.printf("Printing simple integer: x =%d\n", x);
System.out.printf("Formatted with Pricison: PI = %0.2f\n", Math.PI);
//This will print upto 2 decimal places
float n=5.2f;
System.out.printf("Formatted to specific width: n = %0.4f\n",n);
//Automatically appends zero to the rightmost part of decimal
System.out.printf("Formatted to specific width: n = %2.1f\n",n);
n=2345267.3f;
System.out.printf("Formatted to right margin: n = %20.4f\n",n);
//Here number is formatted from right margin and occupies a width of 20 characters
System.out.printf("Formatted to right margin: n = %6.2f\n",n);
}
}
