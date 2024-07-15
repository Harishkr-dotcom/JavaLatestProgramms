package Strings;
//**Character Count**: Write a function to count the number of occurrences of each character in a string.

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class S4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hi this is is done by Harish";
		String[] words = s1.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String s2: words){
			if(map.containsKey(s2)){
				map.put(s2, map.get(s2)+1);
			}else{
				map.put(s2.toLowerCase(), 1);
			}
		}
		for(Entry<String, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		String s="Harriishh";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(Character ch: arr){
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}else{
				hm.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry: hm.entrySet()){
			if(entry.getValue()>1){
			System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
	}

}
