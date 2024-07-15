package Easy;

public class Candy {

	public static int candy(int[] ratings) {
		int n = ratings.length;
		int upCount = 0, downCount = 0, peakCount = 0, totalCandies = 1;
		for (int i = 1; i < n; i++) {
			if (ratings[i - 1] < ratings[i]) {
				downCount = 0;
				upCount = upCount + 1;
				peakCount = upCount + 1;
				totalCandies = totalCandies + peakCount;
			} else if (ratings[i - 1] == ratings[i]) {
				downCount = 0;
				upCount = 0;
				peakCount = 0;
				totalCandies = totalCandies + 1;
			} else {
				downCount = downCount + 1;
				upCount = 0;
				totalCandies = totalCandies + downCount + 1 - (peakCount > downCount ? 1 : 0);
			}
		}
		return totalCandies;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
