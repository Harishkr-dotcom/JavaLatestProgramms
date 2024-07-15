package Aarrays;

import java.util.Arrays;

public class B9 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7 };
		int[] b = { 2, 4, 6, 8 };
		int[] c = new int[a.length + b.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count++;
		}
		for (int j = 0; j < b.length; j++) {
			c[count] = b[j];
			count++;
		}
		Arrays.sort(c);
		for (int k = 0; k < c.length; k++) {
			System.out.print(c[k] + " ");
		}
	}

}
