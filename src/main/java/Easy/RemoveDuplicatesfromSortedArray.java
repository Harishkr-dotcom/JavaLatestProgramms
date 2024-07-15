package Easy;

public class RemoveDuplicatesfromSortedArray {
	// First Apporch
	public static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}
	// Second Approch
	public static int removeDuplicatesSecondApp(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (j == 1 || nums[i] != nums[j - 2]) {
				nums[j++] = nums[i];
			}
		}
		return j;
	}
	
	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 7, 8, 8 };
		int value = RemoveDuplicatesfromSortedArray.removeDuplicatesSecondApp(nums);
		for (int i = 0; i < value; i++) {
			System.out.print(nums[i] + ",");
		}
	}

}
