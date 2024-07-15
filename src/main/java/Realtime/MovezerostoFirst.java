package Realtime;

//12. Program: String str="32400121200"; Output should be: 00003241212 (all zeroes should be in starting)
public class MovezerostoFirst {
	public static void main(String[] args) {
		int[] arrlast = { 1, 0, 5, 94, 0, 6 };
		int countlast = 0;
		for (int i = 0; i < arrlast.length; i++) {
			if (arrlast[i] != 0) {
				arrlast[countlast] = arrlast[i];
				countlast++;
			}
		}
		for (int j = countlast; j < arrlast.length; j++) {
			arrlast[j] = 0;
			countlast++;
		}
		for (int j = 0; j < arrlast.length; j++) {
			System.out.print(arrlast[j] + " ");
		}
		
		int[] arr = { 1, 0, 5, 94, 0, 6 };
		int count = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count--;
			}
		}
		for (int j = count; j >= 0; j--) {
			arr[count] = 0;
			count--;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
