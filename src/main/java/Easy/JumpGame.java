package Easy;

public class JumpGame {

	public static boolean canJump1(int[] nums) {
		int reachable = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > reachable)
				return false;
			reachable = Math.max(reachable, i + nums[i]);
		}
		return true;
	}

	public static int jump2(int[] nums) {
		int jumps = 0, currEnd = 0, currFarthest = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			currFarthest = Math.max(currFarthest, i + nums[i]);
			if (i == currEnd) {
				currEnd = currFarthest;
				jumps++;
			}
		}
		return jumps;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 1, 1, 4 };
		int[] b = { 3, 2, 1, 0, 4 };
		//System.out.println(JumpGame.canJump1(a));
		//System.out.println(JumpGame.canJump1(b));
		//System.out.println(JumpGame.jump2(a));
		System.out.println(JumpGame.jump2(b));
	}
}
