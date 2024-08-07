package IntervQS;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 5 ,6};
		int n = a.length + 1;
		int totalSum = (n * (n + 1)) / 2;
		int arraySum = 0;
		for (int num : a) {
			arraySum += num;
		}
		System.out.println(totalSum - arraySum);
	}

}
