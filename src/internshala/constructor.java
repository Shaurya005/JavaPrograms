package internshala;

public class constructor {
	 public static void main(String[] args) {
    	Rectangle r1 = new Rectangle();
	    //r1 = this i.e. r1 is actually equal to this keyword but we can't use r1 in thisKeyword.java as object creation is done only here
	    //Compiler can't understand there which r1 we are citing to, So this keyword is used to refer to current instance
	    r1.length=8.7f;
	    r1.breadth=12.9f;
	    Rectangle r2=new Rectangle(20.4f,18.2f);//Here a new object gets created and also parameterised constructor got triggered
        System.out.println(r2.length);
	    System.out.println(r2.breadth);
	    //Here r2 = this i.e. current reference variable i.e. current object we can say
	    //So if we initially know the value of instance variable, we can simply create parameterised constructor
    }
}