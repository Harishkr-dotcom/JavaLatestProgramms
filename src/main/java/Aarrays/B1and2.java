package Aarrays;

//**Find the Largest and smallest Element in an Array**:
public class B1and2 {
	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 2, 4, 20 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
		
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < max) {
				max = a[i];
			}
		}
		System.out.println(min);
	}

}
