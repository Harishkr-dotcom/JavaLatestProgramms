package Easy;

public class RotateArray {
	
	    public static void rotate(int[] nums, int k) {
	        k=k%nums.length;
	        // reverse complete arrya
	        reverse( nums,0, nums.length-1) ;
	        // reverse left part of array excluding kth element
	        reverse( nums,0, k-1);
	        // reverse right part of array starting with kth element
	        reverse( nums,k, nums.length-1); 
	    }
	    public static void reverse(int[]nums,int startposition,int endposition){
	        while(startposition<endposition){
	            int temp=nums[startposition];
	            nums[startposition]=nums[endposition];
	            nums[endposition]=temp;
	            startposition++;
	            endposition--;
	        }
	    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 2;
		RotateArray.rotate(nums, k);
		for (int i : nums) {
			System.out.print(i+",");
		}

	}

}
