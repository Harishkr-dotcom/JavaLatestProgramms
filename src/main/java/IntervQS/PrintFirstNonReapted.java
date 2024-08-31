package IntervQS;

import java.util.HashMap;
import java.util.Map;

public class PrintFirstNonReapted {
	public static void main(String[] args) {
		String a = "abcacd";
		char[] s = a.toCharArray();
		HashMap<Character, Integer> hp = new HashMap<>();
		for (Character s1 : s) {
			if (hp.containsKey(s1)) {
				hp.put(s1, hp.get(s1) + 1);
			} else {
				hp.put(s1, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hp.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
