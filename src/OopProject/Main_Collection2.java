package OopProject;

import java.util.HashMap;
import java.util.Map;

public class Main_Collection2 {
	public static void main(String args[]) {
		/*
		* "name"="Shashank"
		* "roolNo"="23"
		* "DOB"="12.7.1995"
		 */
		Map<Integer,String> namesMap=new HashMap();//Import two packages one for Map and another for HashMap
		//Our Key here is Integer and Value is String and in that places we can have any classes like <String,String>,<Dog,String>,<Character,String>,<Employee,Integer>
		//In order to insert data in HashMap we have to insert with help of key value pair so we'll have key-value pair like
		/*
		 * 2="Shashank"
		 * 43="Rahul"
		 * 13="Robert"
		 */
		//Adding element in HashMap with help of put method
		namesMap.put(2,"Shashank");
		namesMap.put(43,"Rahul");
		namesMap.put(13,"Robert");//They are not present in any sequence

		//Accessing elements within HashMap
		String name=namesMap.get(43);
		System.out.println(name);
		namesMap.put(43,"NewName");
		String name1=namesMap.get(43);
		System.out.println(name1);
        for(Map.Entry entry: namesMap.entrySet()){
	        System.out.println(entry.getKey()+" "+entry.getValue());
	    //There are various other operation that we can perform on HashMap like clear(), containsKey(), etc
        }
	}
}
/*
* Map: Interface
* HashMap: Class that implements interface Map
*
*    class HashMap implements Map{
*          .....
*      }
*
*  Map Properties:
*  1. They contain value based on key value pair
*  2. They are not ordered
*  3. They contain unique values //If we try to insert duplicate value in a key then previous value will be replaced by new one in key
*  4. They can only store object type data i.e. Boxed type Data
 */