package IntervQS;
//1. You are given an unsorted array of integers and two integers, r1 and r2, which represent the inclusive range. Your task is to count the number of elements in the array that fall within this range, including the boundaries.

//𝐄𝐱𝐚𝐦𝐩𝐥𝐞:
//𝐈𝐧𝐩𝐮𝐭:
//Array = [1, 3, 5, 2]
//r1 = 1
//r2 = 5
//Output:
//4
public class PrintRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 5, 2, 7 };
		int r1 = 1;
		int r2 = 5;
		System.out.println(getcount(a, r1, r2));
	}

	public static int getcount(int[] a, int r1, int r2) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= r1 && a[i] <= r2) {
				count++;
			}
		}
		return count;
	}

}
