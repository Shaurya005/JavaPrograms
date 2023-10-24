package TestAndLearn;

public class TypeConversion {
	public static void main(String a[]){
		// Integer to String
		int i1=4632;
		String s1=Integer.toString(i1);
		String s2=String.valueOf(i1);
		String s3=""+i1;
		System.out.println(s1.getClass()+"-"+s1+" "+s2.getClass().getName()+"-"+s2+" "+s3.getClass().getSimpleName()+"-"+s3);

		// Float to String
		float f1=3.143f; // Without f or F it is double in Java
		String s4=Float.toString(f1);  String s5=String.valueOf(f1);

		// Long to String
		Long l1=23455L; // Without l or L it is int in Java
		String s6=Long.toString(l1);  String s7=String.valueOf(l1);
		System.out.println(s4 + " " + s5 + " " + s6+ " "+s7);

		// String to Long
		s6="5435435";
		l1=Long.parseLong(s6); // Scope of NumberFormatException
		Long l2=Long.valueOf(s6); // Scope of NumberFormatException
		System.out.println(l1.getClass()+"-"+l1+" "+l2.getClass().getSimpleName()+"-"+l2);

		// String to Float
		f1=Float.valueOf(s4);
		float f2=Float.parseFloat(s5);

		// String to Integer
		int i4=Integer.valueOf(s1);
		int i3=Integer.parseInt(s2);

		// Integer to Long
		l1=Integer.toUnsignedLong(i1);
		l2=Long.valueOf(i1);

		// Long to Integer
		i1=Math.toIntExact(l1);
		int i2=l1.intValue();
		//Note:- Integer.parseInt, Float.parseFloat, Long.parseLong are all taking only String as parameter.
		System.out.println(l1.getClass().getName()+"-"+l1+" "+ l2+" "+ f1+" "+f2+" "+ i1+" "+i2+" "+i3); // getClass() Method is not defined for int and float and so getName method also.
		System.out.println(s1.getBytes()); // getBytes method is only defined for String.
	}
}