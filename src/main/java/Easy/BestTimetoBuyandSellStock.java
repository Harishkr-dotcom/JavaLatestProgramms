package Easy;

public class BestTimetoBuyandSellStock {

	public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
	
	 public static int maxProfitII(int[] prices) {
	        int profit = 0;
	        for(int i=1;i<prices.length;i++) {
	            if(prices[i] > prices[i-1]) {
	                profit += prices[i] - prices[i-1];
	            }
	        }
	        return profit;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		System.out.println(BestTimetoBuyandSellStock.maxProfit(prices));
		System.out.println(BestTimetoBuyandSellStock.maxProfitII(prices));

	}

}
