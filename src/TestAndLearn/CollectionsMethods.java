package TestAndLearn;

import java.util.*;

public class CollectionsMethods {
	public static void main(String arg[]){
		TreeSet<String> t = new TreeSet<>();
		/*
		Java.util.Collections.frequency() in Java: The method is a java.util.Collections class method. It counts the frequency of the specified element in the given list.
		It override the equals() method to perform the comparison to check if the specified Object and the Object in the list are equal or not.

		Syntax: public static int frequency(Collection c, Object o)
		parameters:
		c: Collection in which to determine the frequency of o.
		o: Object whose frequency is to be determined.
		It throws Null Pointer Exception if the Collection c is null.
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("code");
		list.add("code");
		list.add("quiz");
		list.add("code");

		System.out.println("The frequency of the word code is: "+ Collections.frequency(list, "code"));

		/*
		Using Java.util. Collections.frequency() for Custom defined objects:
		The method stated above works well for already defined Objects in java, but what about the custom defined objects.
		Well, to count the frequency of a custom defined object in java, we will have to simply override the equals() method. Lets see how we can do that.
		 */
		ArrayList<Student1> list_ = new ArrayList<>();
		list_.add(new Student1("Ram", 19));
		list_.add(new Student1("Ashok", 20));
		list_.add(new Student1("Ram", 19));
		list_.add(new Student1("Ashok", 19));

		System.out.println("The frequency of the Student Ram, 19 is: "+ Collections.frequency(list, new Student1("Ram", 19)));

		/*
		java.util.Collections.binarySearch() method is a java.util.Collections class method that returns position of an object in a sorted list.

		// Returns index of key in sorted list sorted in ascending order
		public static int binarySearch(List slist, T key)

		// Returns index of key in sorted list sorted in order defined by Comparator c.
		public static int binarySearch(List slist, T key, Comparator c)

		If key is not present, the it returns "(-(insertion point) - 1)". The insertion point is defined as the point at which the key would be inserted into the list.
		The method throws ClassCastException if elements of list are not comparable using the specified comparator, or the search key is not comparable with the elements.
		Searching an int key in a list sorted in ascending order:
		 */
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(10);
		al.add(20);

		// 10 is present at index 3.
		int index = Collections.binarySearch(al, 10);
		System.out.println(index);

		// 13 is not present. 13 would have been inserted at position 4. So the function returns (-4-1) which is -5.
		index = Collections.binarySearch(al, 13);
		System.out.println(index);

		// Searching an int key in a list sorted in descending order.
		List<Integer> al_ = new ArrayList<>();
		al_.add(100);
		al_.add(50);
		al_.add(30);
		al_.add(10);
		al_.add(2);

		// The last parameter specifies the comparator method used for sorting.
		int index_ = Collections.binarySearch(al_, 50, Collections.reverseOrder());
		System.out.println("Found at index " + index_);

		List<Domain> l = new ArrayList<Domain>();
		l.add(new Domain(10, "quiz.geeksforgeeks.org"));
		l.add(new Domain(20, "practice.geeksforgeeks.org"));
		l.add(new Domain(30, "code.geeksforgeeks.org"));
		l.add(new Domain(40, "www.geeksforgeeks.org"));

		Comparator<Domain> c = new Comparator<Domain>() {
			public int compare(Domain u1, Domain u2)
			{
				return u1.getId().compareTo(u2.getId());
			}
		};

		// Searching a domain with key value 10. To search we create an object of domain with key 10.
		int index2 = Collections.binarySearch(l, new Domain(10, null), c);
		System.out.println("Found at index  " + index2);

		// Searching an item with key 5
		index2 = Collections.binarySearch(l, new Domain(5, null), c);
		System.out.println(index2);

		/*
		Arrays.binarysearch() vs Collections.binarySearch()
		Arrays.binarysearch() works for arrays which can be of primitive data type also. Collections.binarysearch() works for objects Collections like ArrayList and LinkedList.

		Important Points:

		If input list is not sorted, the results are undefined.
		If there are duplicates, there is no guarantee which one will be found.
		This method runs in log(n) time for a “random access” list like ArrayList. If the specified list does not implement the RandomAccess interface and is large,
		this method will do an iterator-based binary search that performs O(n) link traversals and O(log n) element comparisons.
		 */
	}
}

class Student1
{
	private String name;
	private int age;

	Student1(String name, int age)
	{
		this.name=name;
		this.age=age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public boolean equals(Object o)
	{
		Student1 s;
		if(!(o instanceof Student1))
			return false;
		else
		{
			s=(Student1)o;
			if(this.name.equals(s.getName()) && this.age== s.getAge())
				return true;
		}
		return false;
	}
}

class Domain {
	private int id;
	private String url;

	public Domain(int id, String url)
	{
		this.id = id;
		this.url = url;
	}
	public Integer getId() { return Integer.valueOf(id); }
}