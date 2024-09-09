package Imp;

public class ContainerWithMostWater {
	public static int maxArea(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int maxArea = 0;

		while (left < right) {
			int currentArea = Math.min(arr[left], arr[right]) * (right - left);
			maxArea = Math.max(maxArea, currentArea);

			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;
	}

	public static void main(String[] args) {
		int [] a= {1,8,6,2,5,4,8,3,7};
		System.out.println(ContainerWithMostWater.maxArea(a));
	}

}
