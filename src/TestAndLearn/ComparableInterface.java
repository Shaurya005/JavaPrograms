package TestAndLearn;

import java.util.*;

class Students implements Comparable<Students>
{
	int marks;
	String name;
	public Students(int marks,String name){
		this.marks = marks;
		this.name  = name;
	}

	@Override
	public String toString() {
		return "Students [marks="+marks+", name="+name;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setName(String name) {
		this.name = name;
	}

	// @Override
	public int compareTo(Students o) { // It is for sorting in descending order, for ascending order sorting just reverse the positions of 1 and -1;
		if(this.marks > o.marks) return -1;
		else if(this.marks < o.marks) return 1;
		// return 0; If we want to order only based on marks of students then simply return zero.
		return this.name.compareTo(o.name);  // Here this compareTo comes from toString function which already implements Comparable<String> in its definition and it's order of sorting is alphabetical order.
	}
	// Comparable Interface has compareTo(Object o) method in it whereas Comparator Interface has compare(Object obj1,Object obj 2) method in it.
	// We can pass different comparator to a certain class according to the need at runtime.
}

public class ComparableInterface {
	public static void main(String args[]) {
		List<Students> students = new ArrayList<>();

		students.add(new Students(23, "Ram"));
		students.add(new Students(13, "Aditya"));
		students.add(new Students(48, "Mohit"));
		students.add(new Students(63, "Anuj"));
		students.add(new Students(18, "Shyam"));
		students.add(new Students(18, "Aman"));
		//Collections.sort(students);
		Collections.sort(students, new SortByNameThenMarks());

		/*
		We can also make a anonymous class if we don't want to make a new separate class for Comparator because Collections.sort just want an object.

		Collections.sort (students, new Comparator<Students>(){
		@Override
		public int compare(Students o1, Students o2) {
			if(o1.name.equals(o2.name))
				return o1.marks - o2.marks;
			else
				return o1.name.compareTo(o2.name); // Again this compareTo is coming from toString method which every class has be default.
		}
		});

		Now by introduction of lambda from Java 8, we can also use lambda function directly with an interface which has only one function in it like our Comparator class.
		Collections.sort (students, (o1, o2) -> {
			if(o1.name.equals(o2.name))
				return o1.marks - o2.marks;
			else
				return o1.name.compareTo(o2.name); // Again this compareTo is coming from toString method which every class has be default.
		});

		Another way of directly declaring a Comparator in Collection.sort() method is like -
		Collections.sort(students, Comparator.comparing(Students :: getName).thenComparing(Student::getMarks));
		 */
		students.forEach(System.out::println);
	}
}

// To make a comparator, simply just you have to make a class and implement the Comparator with it
class SortByNameThenMarks implements Comparator<Students>
{
	@Override
	public int compare(Students o1, Students o2) {
		if(o1.name.equals(o2.name))
			return o1.marks - o2.marks;
		else
			return o1.name.compareTo(o2.name); // Again this compareTo is coming from toString method which every class has be default.
	}
}