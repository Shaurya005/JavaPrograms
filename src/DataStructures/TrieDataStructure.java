package DataStructures;

import java.util.HashMap;
import java.util.Scanner;

class Trie{
	char data;
	HashMap<Character,Trie> hm = new HashMap<>();
	boolean isTerminal;
	Trie(char ch){
		data = ch;
		isTerminal = false;
	}
}

public class TrieDataStructure {
	public static void main(String[] args) {
			Trie root = new Trie('\0');
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i = 0;i < n;i++)
				insert(root,sc.next());
			int q = sc.nextInt();
			while(q-->0)
				System.out.println(search(root,sc.next()));
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

	static boolean search(Trie root, String word){
		Trie temp = root;
		int length = word.length();
		for(int i = 0;i<length;i++) {
			char ch = word.charAt(i);
			if (!temp.hm.containsKey(ch))
				return false;
			temp = temp.hm.get(ch);
		}
		return temp.isTerminal;
	}
}
