package Java_1000;

class Exception1 extends Exception{}
class Exception2 extends Exception1{}

/*
public class Exc_01 {
	public static void main(String args[]){
		try{
			throw new Exception2();
		}
		catch(Exception2 | Exception1 e){ // Error
			System.out.println("Exception1 caught");
		}
	}
}
*/