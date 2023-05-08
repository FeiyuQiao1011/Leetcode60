package suixianglu.Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class best_time_to_buy_and_sell_Stock_III_123_H {
    public int maxProfit(int[] prices) {
        /**
         * dp[i][1]第i天第一次持有
         * dp[i][2]第i天第一次不持有
         * dp[i][3]第i天第二次持有
         * dp[1][4]第i天第二次不持有
         * dp[i][1] = Max(dp[i - 1][1], dp[i - 1]dp[0] - price[i])
         * dp[i][2] = Max(dp[i - 1][2], dp[i - 1][1] + price[i])
         * dp[i][3] = Max(dp[i - 1][3], dp[i - 1][2] - price[i])
         * dp[i][4] = Max(dp[i - 1][4], dp[i - 1][3] + price[i])
         */
        int[][] dp = new int[prices.length][5];
        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }
        return dp[prices.length - 1][4];
    }
}
