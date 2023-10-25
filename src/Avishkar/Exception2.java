package Avishkar;/*
Case: try with multiple catch block....
So a try with multiple catch block is basically to indicate that if there are multiple exceptions or errors occurs in a program
then they can be tried with one try block and they can be caught with multiple catch block.
Without Exceptional Handling mechanism
*/
/*
public class Exception2
{
public static void main(String args[])
{
int i=args.length;    //No. of arguments in the command line
String myString[]=new String[i];     No error at this line even if i=0;
int n=Integer.parseInt(args[0]); //If args[0] is not an integer then NumberFormatException
System.out.println(n);
if(args[0].equals("Java"))
{
System.out.println("First word is Java !");
}
System.out.println("Number of arguments-"+i);
int x=12/i;      //ArithmeticException: / by zero if i=0
int y[]={555,999};
y[i]=x;     //ArrayIndexOutOfBoundsException if  more than 1 argument is passed.
}
}

Note: Run this program for following inputs
java Exception_2
java Exception_2 Java
java Exception_2 I Love Java
java Exception_2 10 20 30 40
*/

public class Exception2{
	public static void main(String args[]){
		try{
			int i=args.length; //No. of arguments in the command line
			String myString[]=new String[i];  // No error at this line even if i=0;
			int n=Integer.parseInt(args[0]); //#1 : if args[0] is not an integer then NumberFormatException
			System.out.println(n);
			if(args[0].equals("Java")){ //#2 : if i=0 then ArrayIndexOutOfBoundsException
				System.out.println("First word is Java !");}
			System.out.println("Number of arguments-"+i);
			int x=12/i; //#3 : ArithmeticException: / by zero if i=0
			int y[]={555,999};
			y[i]=x; //#4 : ArrayIndexOutOfBoundsException if  more than 1 argument is passed.
		}
		catch(NumberFormatException exc)//To  catch exception at #1
		{
			System.out.println("Number format exception :"+exc);
		}
		catch(ArithmeticException o) //To catch exception at #3
		{
			System.out.println(" Division by 0: "+o);
		}
		catch(ArrayIndexOutOfBoundsException e)//To catch error at #2 and #4
		{
			System.out.println("Array index OOB :"+e);
		}
	}
}
//Now this program is robust by using try with multiple catch block.