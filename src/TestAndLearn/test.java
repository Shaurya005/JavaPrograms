package TestAndLearn;

class HackerEarth{
	public void print(){
		System.out.println("Inside HackerEarth");
	}
}

class Hacker extends HackerEarth{
	public void print(){
		System.out.println("Inside Hacker");
	}
}
public class test {
	public static void main(String a[]){
		HackerEarth obj1 = new HackerEarth();
		Hacker obj2 = new Hacker();
		((HackerEarth)obj2).print();
		obj1 = obj2;
		obj1.print();
	}
}
