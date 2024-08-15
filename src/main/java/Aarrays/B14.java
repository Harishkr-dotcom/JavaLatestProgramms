package Aarrays;

import java.util.ArrayList;

//# set[] = {'a', 'b'}, k = 3 Output:
/*# aaa
# aab
# aba
# abb
# baa
# bab
# bba
in java*/
public class B14 {
	public static void main(String[] args) {
		char[] set = { 'a', 'b' , 'c'};
		int k = 3;
		generateAllStrings(set, k, "");
	}

	public static void generateAllStrings(char[] set, int k, String prefix) {
		if (k == 0) {
			System.out.println(prefix);
			return;
		}

		for (int i = 0; i < set.length; i++) {
			String newPrefix = prefix + set[i];
			generateAllStrings(set, k - 1, newPrefix);
		}

	}

}
