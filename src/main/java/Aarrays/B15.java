package Aarrays;

import java.util.HashMap;
import java.util.Map;

public class B15 {
	public static void main(String[] args) {
        int[] arr1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Majority Element: " + findMajorityElement(arr1)); // Output: 4

        int[] arr2 = {3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println("Majority Element: " + findMajorityElement(arr2)); // Output: No Majority Element
    }
	
	public static String findMajorityElement(int [] a) {
		HashMap<Integer, Integer> hm= new HashMap<>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				hm.put(a[i], hm.get(a[i])+1);
			}else{
				hm.put(a[i], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			int max = a.length/2;
            if (entry.getValue() > max) {
                return String.valueOf(entry.getKey());
            }
        }
		return "No Majority Element";
	}
}
