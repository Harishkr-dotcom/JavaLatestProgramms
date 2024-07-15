package Easy;

public class MergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int pMerge = m + n - 1;

		while (p2 >= 0) {
			if (p1 >= 0 && nums1[p1] > nums2[p2]) {
				nums1[pMerge--] = nums1[p1--];
			} else {
				nums1[pMerge--] = nums2[p2--];
			}
		}
	}

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 0, 0, 0, 0 };
		int[] num2 = { 2, 5, 6, 7 };
		int m = 3;
		int n = 4;
		MergeSortedArray.merge(num1, m, num2, n);
		for (int i : num1) {
			System.out.print(i + ",");
		}
	}

}
