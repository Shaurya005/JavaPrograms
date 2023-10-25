package Avishkar;

//Another block that can be added with try-catch block i.e. finally so whatever exception whether occur or not finally block will always be executed.
class Finally1{
	public static void main(String args[ ]){
		int i=0;
		String greetings[]={"Hello Twinkle","Hello Java","Hello World"};// index are ranging from 0 to 2 only in this String array.
		while(i<4){
			try{
				System.out.println(greetings[i]); // When i=3 it'll throw Array IOB Exception
				i++;
			    }
			catch(Exception e){
				System.out.println(e.toString()); //Message of exception e  in string format
			}
			finally{
				System.out.println("Hi !");
				if(i<3); // If we would have used if(i<4) here then program would enter into an infinite loop.
				else{
				System.out.println("You should quit and reset index value");
				break;
				}
			} //Here for every try catch this finally will be executed
		}
	}
}