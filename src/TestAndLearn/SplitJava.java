package TestAndLearn;

/*
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

		Returns:
		An array of strings computed by splitting the given string.

		Throws:
		PatternSyntaxException - if the provided regular expression’s syntax is invalid.

		Limit parameter can have 3 values:

		limit > 0 : If this is the case then the pattern will be applied at most limit-1 times, the resulting array’s length will not be more than n,
		and the resulting array’s last entry will contain all input beyond the last matched pattern.
		limit < 0 : In this case, the pattern will be applied as many times as possible, and the resulting array can be of any size.
		limit = 0 : In this case, the pattern will be applied as many times as possible, the resulting array can be of any size, and trailing empty strings will be discarded.
		Here’s how it works:

Let the string to be split be : geekss@for@geekss

Regex      Limit             Result
@               2          {“geekss”, ”for@geekss”}
@               5          {“geekss”, ”for”, ”geekss”}
@             -2          {“geekss”, ”for”, ”geekss”}
 s               5          {“geek”, ”“, “@for@geek”, “”, “”}
 s              -2          {“geek”, ” “, “@for@geek”, “”, “”}
 s               0          {“geek”, ””, ”@for@geek”}

Following are the Java example codes to demonstrate working of split()

	Example 1:

// Java program to demonstrate working of split(regex, limit) with small limit.
*/
public class SplitJava {
	public static void main(String args[])
	{
		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("@", 2);
		for (String a : arrOfStr)
			System.out.println(a);

		String[] arrOfStr2 = str.split("@", 5);
		for (String a : arrOfStr2)
			System.out.println(a);

		String[] arrOfStr3 = str.split("@", -2);
		for (String a : arrOfStr3)
			System.out.println(a);

		String[] arrOfStr4 = str.split("s", 5);
		for (String a : arrOfStr)
			System.out.println(a);

		String[] arrOfStr5 = str.split("s", -2);
		for (String a : arrOfStr)
			System.out.println(a);

		String[] arrOfStr6 = str.split("s", 0);
		for (String a : arrOfStr)
			System.out.println(a);
	}
}