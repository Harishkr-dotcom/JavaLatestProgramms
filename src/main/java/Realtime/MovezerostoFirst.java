package Realtime;

//12. Program: String str="32400121200"; Output should be: 00003241212 (all zeroes should be in starting)
public class MovezerostoFirst {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 4, 0, 0, 1, 2, 1, 2, 0, 0 };
		moveZerosFirst(arr);
	}

	public static void moveZerosFirst(int[] a) {
		int count = a.length-1;
		System.out.println(count);
		
	}

}
