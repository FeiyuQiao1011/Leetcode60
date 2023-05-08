package suixianglu.Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class best_time_to_buy_and_sell_Stock_II_122_M {
    public int maxProfit(int[] prices){
        /**
         * dp[i][0]表示第i天持有股票所得现金
         * dp[i][1]表示第i天不持有股票所得现金
         * dp[i][0] = Max(dp[i - 1][0], dp[i - 1][1] - values[i])
         * dp[i][1] = Max(dp[i - 1][1], dp[i - 1][0] + values[i])
         */
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        }
        return dp[n -1][1];
    }
}
