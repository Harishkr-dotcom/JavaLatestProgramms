package Imp;

public class BuyStock {
	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}

		int minPrice = Integer.MAX_VALUE; // Initialize to a large value
		int maxProfit = 0; // Initialize to 0, as we can't have negative profit

		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price; // Update the minimum price
			}
			int profit = price - minPrice; // Calculate the potential profit
			if (profit > maxProfit) {
				maxProfit = profit; // Update the maximum profit
			}
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Maximum profit: " + maxProfit(prices1)); // Output: 5

		int[] prices2 = { 7, 6, 4, 3, 1 };
		System.out.println("Maximum profit: " + maxProfit(prices2)); // Output: 0
	}
}
