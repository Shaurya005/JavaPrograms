package TestAndLearn;

/*
 public String[] split(String regex)

		This variant of split method takes a regular expression as parameter, and breaks the given string around matches of this regular expression regex.
		Here by default limit is 0.

		Parameters: regex - a delimiting regular expression

		Returns: An array of strings computed by splitting the given string.

		Throws: PatternSyntaxException - if the provided regular expression’s syntax is invalid.

		Here are some working example codes:
*/
// Java program to demonstrate working of split()
public class SplitJava2 {
	public static void main(String args[])
	{
		String str = "GeeksforGeeks:A Computer Science Portal";

		String[] arrOfStr = str.split(":");
		for (String a : arrOfStr)
			System.out.println(a);

		String[] arrOfStr2 = str.split("for");
		for (String a : arrOfStr2)
			System.out.println(a);

		String[] arrOfStr3 = str.split(" ");
		for (String a : arrOfStr3)
			System.out.println(a);

		String[] arrOfStr4 = str.split("s");
		for (String a : arrOfStr4)
			System.out.println(a);

		String[] arrOfStr5 = str.split("for");
		for (String a : arrOfStr5)
			System.out.println(a);

		String[] arrOfStr6 = str.split("[, ?.@]+");
		for (String a : arrOfStr6)
			System.out.println(a);
	}
}