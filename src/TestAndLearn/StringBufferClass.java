package TestAndLearn;

public class StringBufferClass {
	public static void main(String a[])
	{
		String str="malayalam";
		StringBuffer sb=new StringBuffer(str);
		sb.reverse(); // It reverses and stores the reversed string in sb itself
		if(str.contentEquals(sb)) // If used if(str.equals(sb)) it will always result false so to compare the contents of a String for equality with a non-String CharSequence argument, use contentEquals() method.
			System.out.println("Palindrome");
		else
			System.out.println("Not");

		System.out.println(str.substring(0,0)); // It doesn't print anything
		str="gvgv"; // String in Java can be changed.
		System.out.println(str);
		String s=str; // One string can be assigned to another string
		System.out.println(s);

		StringBuffer afterdel=sb.deleteCharAt(2);
		System.out.println(afterdel+" "+sb); // '+' operator can not be directly applied to concatenate StringBuffer Object so we must have to use " " in between.

		// sb = "National"; It shows a compile time error as required : StringBuffer Found : String
		// sb =(StringBuffer)"National"; It shows error as inconvertible types: cannot cast String to stringBuffer
		str=sb.toString(); s=String.valueOf(sb); // However StringBuffer can easily be converted to String using .toString or String.valueOf
		System.out.println(str+" "+s);
		sb=new StringBuffer("National");
		System.out.println(sb.delete(2,5));

		sb=new StringBuffer("Malayalam");
		System.out.println(sb.indexOf("aya"));
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.lastIndexOf("a"));
		sb.setCharAt(4,'a');
		System.out.println(sb);
	}
}