package Easy;

public class TrapingRainWater {
	
	public static void main(String[] args) {
		int [] a = {3,1,2,4,0,1,3,2};
		TrapingRainWater.trap(a);
		System.out.println(TrapingRainWater.trap(a));
	}
	
	public static int trap(int[] a) {
		int n = a.length;
		int[] left = new int[n]; // Array to store maximum height to the left
		int[] right = new int[n]; // Array to store maximum height to the right
		int ans = 0; //

		left[0] = a[0]; // Base case: leftmost bar has no left boundary
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], a[i]);
		}
		
        right[n - 1] = a[n - 1];  // Base case: rightmost bar has no right boundary
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], a[i]);
        }
        
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(left[i], right[i]);
            ans += minHeight - a[i];
        }

		return ans;

	}

}
