package Java_1000;

public class OuterTest {
	public static void main(String a[]){
		Airplane airplane=new Airplane();
		Airplane.BlackBox box=airplane.new BlackBox();
		box.printVariable();
	}
}

class Airplane{
	String code="11";
	class BlackBox {
		String code = "22";
		public void printVariable(){
			System.out.println(code);
			System.out.printf(Airplane.this.code);
		}
	}
}