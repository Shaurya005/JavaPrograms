package DataStructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountAndSay {
	public static void main(String[] args)
	{
		String s="1211";
		System.out.println(say(s));
		System.out.println(say_(s));
	}

	static String say(String st){
		String s="";
		for(int i=0;i<st.length();i++){
			int count = 1;
			while(i<st.length()-1 && st.charAt(i)==st.charAt(i+1)){
				count++;
				i++;
			}
			s+=Integer.toString(count)+Character.toString(st.charAt(i));
		}
		return s;
	}

	static String say_(String st){
		String s="";
		LinkedHashMap<Character,Integer> tm = new LinkedHashMap();
		for(int i=0;i<st.length();i++){
			if(!tm.containsKey(st.charAt(i)))
				tm.put(st.charAt(i),1);
			else
				tm.put(st.charAt(i),tm.get(st.charAt(i))+1);
		}
		for(Map.Entry<Character,Integer> e:tm.entrySet())
			s+=Integer.toString(e.getValue())+Character.toString(e.getKey());
		return s;
	}
}