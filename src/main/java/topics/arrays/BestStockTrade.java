package topics.arrays;

public class BestStockTrade {

    public static int calcProfitBrutForce(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profit = Math.max(prices[j] - prices[i], profit);
            }
        }
        return profit;
    }

    public static int calcProfitOnePass(int[] prices) {
        int profit = 0;
        int minimum = prices[0];
        for (int price : prices) {
            if (price < minimum) {
                minimum = price;
            } else if (profit < price - minimum) {
                profit = price - minimum;
            }
        }
        return profit;
    }

}
