package IntervQS;

import java.util.HashMap;
import java.util.Map;

public class Leastoccurence {

	public static void main(String[] args) {
		int [] a={1,1,1,2,2,4};
		HashMap<Integer, Integer> hm= new HashMap<>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				hm.put(a[i], hm.get(a[i])+1);
			}else{
				hm.put(a[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			if(entry.getValue()<=1) {	
				System.out.println(entry.getKey());
			}
		}
	}

}
