package collection;

import java.util.HashMap;

public class Char_In_String {
//Find out frequency of character in String
	public static void main(String[] args) {
		
		String s="thatwasagoodmemory";
		
		char[] ch=s.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(char c:ch) {
			if (hm.containsKey(c)) {
				
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);

	}

}
