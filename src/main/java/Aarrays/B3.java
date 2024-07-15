package Aarrays;
//Write a function that returns the sum of all elements in a given array
public class B3 {

	public static void main(String[] args) {
		int a[] = {2,5,2,4,7};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);

	}

}
