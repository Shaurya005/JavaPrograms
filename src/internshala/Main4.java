package internshala;

public class Main4 {
	public static void main(String[] args)
	{
	//Operators in Java
	int res=9/2,x=2,y=3;//4 not by type conversion
	float result=9/2;//4.00 implicit type conversion from int to float
	float Result=9.0f/2;// or 9/2.0f or (float)9/2 by type casting;
		//Whatever value we have on right hand side will be assigned to LHS
	int result_=3+1-7*5%3/2;//Left to Right Associativity, [* / %]>[+ -]
	System.out.println(res+" "+result+" "+Result);
	System.out.println(result_);
	//Assignment Operator
	x=x*y;//Associativity from Right to Left i.e. first solve RHS and then assign it to LHS
		//Equivalent expression x*=y
		System.out.println(x);
}}
