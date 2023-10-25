package Avishkar;

public class Assignment3{
	private static int i=0;
	private static int j=0;
	public static void main(String a[]){
		String question="Which course have you opted?";
		System.out.println(Answer.submit(question));
		int i=3;
		int k=4;
		{
			int j=2;
			System.out.println("i + j is "+i+j);
		}
		k=i+j;
		System.out.println(k);
		System.out.println(j);
	}
}
class Answer{
	static String answer="Programming in Java";
	static String submit(String question){
		return ("The answer to the question, "+question+" is "+answer);
	}}