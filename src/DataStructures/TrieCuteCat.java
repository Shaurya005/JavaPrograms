package DataStructures;

import java.util.HashMap;

public class TrieCuteCat {
	public static void main(String[] args) {
		String document = "little cute cat loves to code in c++, java and python";
		String words[] = {"cute cat", "ttle", "cat", "quick", "big"};
		documentSearch(document,words);
	}

	static void insert(Trie root, String word){
		Trie temp = root;
		int length = word.length();
		for(int i = 0;i<length;i++){
			char ch = word.charAt(i);
			if(!temp.hm.containsKey(ch)) {
				Trie n = new Trie(ch);
				temp.hm.put(ch,n);
			}
			temp = temp.hm.get(ch);
		}
		temp.isTerminal = true;
	}

	static void searchHelper(Trie t, String word, HashMap<String,Boolean> map){
		Trie temp = t;
		for(int i = 0;i<word.length();i++){
			char ch = word.charAt(i);
			if(!temp.hm.containsKey(ch))
				return;
			temp = temp.hm.get(ch);
			if(temp.isTerminal)
				map.put(word.substring(0,i+1),true);
		}
	}

	static void documentSearch(String document, String[] words){
		Trie root = new Trie('\0');
		for(int i = 0;i < words.length;i++)
			insert(root,words[i]);
		HashMap<String,Boolean> map = new HashMap<>();
		for(int i = 0;i<document.length();i++)
			searchHelper(root, document.substring(i), map);
		for (HashMap.Entry<String,Boolean> mp:map.entrySet())
			System.out.println(mp.getKey());
	}
}
