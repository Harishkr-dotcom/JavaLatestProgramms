package IntervQS;

import java.util.HashMap;
import java.util.Map;


public class BiggestPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr3 = {1, 232, 5455455, 909090, 161};
		System.out.println(BiggestPalindrome.palindrome(arr3));

	}
	
	public static boolean ispalindrome(int num) {
		String s= Integer.toString(num);
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		for ( char c : s.toCharArray()) {
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}else {
				count.put(c, 1);
			}
		}	
		int rep =0;
		for(Map.Entry<Character, Integer> entry: count.entrySet()){
			if(entry.getValue()%2!=0) {
				rep++;
			}
		}
		return rep<=1;
	}
	
	public static int palindrome(int [] arr) {
	     int max = Integer.MIN_VALUE;
	     for(int i=0;i<arr.length;i++) {
	    	 boolean value = BiggestPalindrome.ispalindrome(arr[i]);
	    	if(value==true && arr[i]>max) {
	    		max=arr[i];
	    	}
	     }
	     return max;
	     					
	}

}
