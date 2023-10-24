package TestAndLearn;

/*
		Split() String method in Java with examples

		The string split() method breaks a given string around matches of the given regular expression.

		For Example:

		Input String: 016-78967
		Regular Expression: -
		Output : {"016", "78967"}
		Following are the two variants of split() method in Java:

		1. Public String [ ] split ( String regex, int limit )

		Parameters:
		regex - a delimiting regular expression
		Limit - the result threshold

		Returns: An array of strings computed by splitting the given string.

		Throws:
		PatternSyntaxException - if the provided regular expression’s
		syntax is invalid.
		Limit parameter can have 3 values:


		limit > 0 : If this is the case then the pattern will be applied at most limit-1 times, the resulting array’s length will not be more than n,
						and the resulting array’s last entry will contain all input beyond the last matched pattern.

		limit < 0 : In this case, the pattern will be applied as many times as possible, and the resulting array can be of any size.

		limit = 0 : In this case, the pattern will be applied as many times as possible, the resulting array can be of any size, and trailing empty strings will be discarded.

		Let the string to be splitted be : geekss@for@geekss

	Regex       Limit             Result
	@               2         {“geekss”, ”for@geekss”}
	@               5         {“geekss”, ”for”, ”geekss”}
	@              -2        {“geekss”, ”for”, ”geekss”}
	s                5         {“geek”, ”“, “@for@geek”, “”, “”}
	s               -2         {“geek”, ” “, “@for@geek”, “”, “”}
	s                0         {“geek”, ””, ”@for@geek”}

*/
public class RegexSplit {
	public static void main(String args[])
	{
		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("@", 2); // Java program to demonstrate working of split(regex, limit) with small limit.
		for (String a : arrOfStr)
			System.out.println(a);

		arrOfStr = str.split("@", 5); // Java program to demonstrate working of split(regex, limit) with high limit.
		for (String a : arrOfStr)
			System.out.println(a);

		arrOfStr = str.split("@", -2); // Java program to demonstrate working of split(regex, limit) with negative limit.
		for (String a : arrOfStr)
			System.out.println(a);

		arrOfStr = str.split("s", 5); // Java program to demonstrate working of split(regex, limit) with high limit.
		for (String a : arrOfStr)
			System.out.println(a);

		arrOfStr = str.split("s", -2); // Java program to demonstrate working of split(regex, limit) with negative limit.
		for (String a : arrOfStr)
			System.out.println(a);

		arrOfStr = str.split("s", 0); // Java program to demonstrate working of split(regex, limit) with 0 limit.
		for (String a : arrOfStr)
			System.out.println(a);

		/*
2. public String[] split(String regex)

This variant of split method takes a regular expression as parameter, and breaks the given string around matches of this regular expression regex. Here by default limit is 0.

Parameters:
regex - a delimiting regular expression

Returns:
An array of strings computed by splitting the given string.

Throws:
PatternSyntaxException - if the provided regular expression’s syntax is invalid.
		 */
		String str2 = "GeeksforGeeks:A Computer Science Portal";
		String[] arrOfStr2 = str2.split(":");
		for (String a : arrOfStr2)
			System.out.println(a);

		String str3 = "GeeksforGeeksforStudents";
		String[] arrOfStr3 = str3.split("for");
		for (String a : arrOfStr3)
			System.out.println(a);

		String str4 = "Geekssss";
		String[] arrOfStr4 = str4.split("s"); // In this example that trailing empty strings are not included in the resulting array arrOfStr4.
		for (String a : arrOfStr4)
			System.out.println(a);

		String str5 = "GeeksforforGeeksfor   ";
		String[] arrOfStr5 = str5.split("for"); // In this example, the trailing spaces (hence not empty string) in the end becomes a string in the resulting array arrOfStr.
		for (String a : arrOfStr5)
			System.out.println(a);

		String str6= "word1, word2 word3@word4?word5.word6";
		String[] arrOfStr6 = str6.split("[, ?.@]+"); //In this example, words are separated whenever either of the characters specified in the set is encountered.
		for (String a : arrOfStr6)
			System.out.println(a);
	}
}