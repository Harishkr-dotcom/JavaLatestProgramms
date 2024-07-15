package Easy;

public class MejorityElement {

	public static int majorityElement(int[] nums) {
		
		int ele = nums[0];
		int count = 0;

		for (int num : nums) {
			if (count == 0) {
				ele = num;
			}
			if (ele == num) {
				count++;
			} else {
				count--;
			}
		}
		return ele;
	}

	public static void main(String[] args) {
		int[] nums = { 12,2,1,1,1,2,2};
		//int[] nums = { 0, 0, 1, 1, 1,6,6,8,8,4,7,2,2};
		System.out.println(MejorityElement.majorityElement(nums));
	}

}
