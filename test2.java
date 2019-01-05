//to find the duplicate characters in a string

package test;

import java.util.HashMap;
import java.util.Set;

public class test2 {
 public static void main(String[] args) {
	String s = "Sachin Tendulkar is a cricketer";
	HashMap<Character, Integer> hashlist = new HashMap<Character, Integer>();
	char[] a = s.toCharArray();
	
	for(char ch : a) {
		if(hashlist.containsKey(ch)) {
			hashlist.put(ch, hashlist.get(ch)+1);
		}
		else {
			hashlist.put(ch, 1);
		}
	}
	System.out.println("Duplicate charcters : ");
	Set<Character> keyset = hashlist.keySet();
	
	for(char ch : keyset) {
		if(hashlist.get(ch) > 1) {
			System.out.println(ch + " : "  + hashlist.get(ch) + " times");
		}
	}
}
}