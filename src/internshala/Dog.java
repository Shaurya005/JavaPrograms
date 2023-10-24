package internshala;

public class Dog {
	//Public is a modifier
	public String breed;
	public int size;
	public String color;
	//Now apart from properties dog must have some behaviour
	public void bark(){
		System.out.println("Wooh ! Wooh !");
	}
	public void run(){
		System.out.println("My breed is"+breed+", I am running");
	}
}
