package IntervQS;

import java.util.ArrayList;

public class SeperateEvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 8, 12, 5, 10, 6, 7 };
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even.add(a[i]);
			} else {
				odd.add(a[i]);
			}
		}
		System.out.println("even" + even);
		System.out.println("odd" + odd);

	}

}
