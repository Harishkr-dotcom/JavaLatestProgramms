package IntervQS;

import java.util.ArrayList;

public class PositiveNegetive {
	public static void main(String[] args) {

		int[] a = { -1, 2, 4, 5, -9, 8, 12, -6, 51, 90, -8 };

		ArrayList<Integer> positiveNumbers = new ArrayList<>();
		ArrayList<Integer> negativeNumbers = new ArrayList<>();

		for (int num : a) {
			if (num >= 0) {
				positiveNumbers.add(num);
			} else {
				negativeNumbers.add(num);
			}
		}
		
		int [] res = new int[a.length];
		int index = 0;
		int positveindex=0, negetiveindex=0;
		
		while(positveindex < positiveNumbers.size() && negetiveindex< negativeNumbers.size() ) {
			res[index++] = positiveNumbers.get(positveindex++);
			res[index++] = negativeNumbers.get(negetiveindex++);
		}
		
		while(positveindex < positiveNumbers.size()) {
			res[index++] = positiveNumbers.get(positveindex++);
		}
		
		for (int i : res) {
			System.out.print(i+" ");
		}

	}

}
