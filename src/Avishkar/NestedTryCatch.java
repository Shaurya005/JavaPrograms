package Avishkar;/*
//Necessity of Nested try catch example i.e. a try catch block can be put inside another try catch block.

class NestedTryCatch{
public static void main(String args[])
{
int a=args.length;
int b=42/a;//Divide by zero exception
System.out.println("a - "+a);
if(a==1)
a=a/(a-1);//Divide by zero exception
if(a==2)
{
int c[]={1};
c[2]=99;//Array IOB Exception
}
}
}
/*
Note: Run this program for following inputs
java NestedTryCatch 1 2 3
java NestedTryCatch 1 2
java NestedTryCatch 1
java NestedTryCatch
*/

//Remedy with nested try catch block

class NestedTryCatch{
	public static void main(String args[]){
		try{
			int a=args.length;
			int b=42/a; //Divide by zero exception
			System.out.println("a - "+a);
			if(a==1)
				a=a/(a-1); //Another Divide by zero exception
			try{
				if(a==2){
					//If two command line arguments are used, then an Array IOB Exception
					int c[]={1};
					c[2]=99;//Array IOB Exception
				}
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Index Out of Bound: "+e);
			}
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero: "+e);}
	}
}