package IntervQS;
//You are given an array of integers called nums. Your task is to create a new array result such that each element at index i of the result is the product of all the elements in nums except nums[i].

//Important:
//You cannot use division in this problem.
//Try to solve the problem in O(n) time complexity.
//𝐄𝐱𝐚𝐦𝐩𝐥𝐞:
//𝐈𝐧𝐩𝐮𝐭:
//nums = [1, 2, 3, 4]
//Output:
//result = [24, 12, 8, 6]
//𝐄𝐱𝐩𝐥𝐚𝐧𝐚𝐭𝐢𝐨𝐧:
//The product of all elements except the one at index 0 is 2 * 3 * 4 = 24.
//The product of all elements except the one at index 1 is 1 * 3 * 4 = 12.
//The product of all elements except the one at index 2 is 1 * 2 * 4 = 8.
//The product of all elements except the one at index 3 is 1 * 2 * 3 = 6.

public class ProductInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4 };
		int[] result = getproduct(a);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int [] getproduct(int[] a) {
		int[] result = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int current = a[i];
			int max = 1;
			for (int j = 0; j < a.length; j++) {
				if (j != i) {
					max = max * a[j];
				}
			}
			result[i] = max;
		}
		return result;
	}

}
