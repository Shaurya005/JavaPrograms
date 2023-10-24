package internshala;
public class Main7 {
	//Method is always defined within class
	public static void main(String args[])
	//Here in main method public static is modifier and void is return type
	//Return can be int, float, double, char, etc
	//After method name we have formal parameters or formal arguments in bracket.
	//Compiler doesn't consider anything after return statement
	{
    sayHello();
    System.out.println(SI(10909,5.7f,8));
    add();
    add(23,76);//Here 23 and 76 are actual parameters or actual arguments
    add(23.45f,56.76f);
	}
	public static void sayHello(){
		System.out.println("Hello");
	    return;//Optional in case of void
	}
	public static double SI(int p,float r, int t){
		double si=p*r*t/100;
		System.out.println(si);
		return si;
	}
	//Method Overloading: Same Name but different method parameters
	public static void add(){
		int sum=87+7;
		System.out.println(sum);
	}
	public static void add(int a,int b){
		int sum=a+b;
		System.out.println(sum);
	}
	/*Making any changes in return type with same method name isn't method overloading
	public static int add(int a,int b){
		int sum=a+b;
		System.out.println(sum);
		return sum;//Compiler will say that function add is already defined in class
	}*/
	public static void add(float a,float b){
		float sum=a+b;
		System.out.println(sum);
	}
}