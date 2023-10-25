package Java_1000;

public class First_C {
	public void myMethod()
	{
		System.out.println("Method");
	}

	{
		System.out.println(" Instance Block");
	}

	public First_C()
	{
		System.out.println("Constructor ");
	}

	public void First_C() // It is not a constructor here but it's a method with same name as class name.
	{
		System.out.println("Constructor ");
	}
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		First_C c = new First_C();
		c.First_C();
		c.myMethod();
	}
}