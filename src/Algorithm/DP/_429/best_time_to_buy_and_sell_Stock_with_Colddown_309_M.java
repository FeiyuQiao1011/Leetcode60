package Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class best_time_to_buy_and_sell_Stock_with_Colddown_309_M {
    public int maxProfit(int[] prices) {
        /**
         * 状态1：持续持有股票
         * dp[i][0] = Max(dp[i - 1][0], dp[i - 1][3] - prices[i],dp[i - 1][1] - prices[i])
         * 状态2：保持卖出股票
         * dp[i][1] = Max（dp[i - 1][1]， dp[i - 1][3]）
         * 状态3：今天卖出
         * dp[i][2] = dp[i - 1][0] + prices[i]
         * 状态4：冷冻期，1天
         * dp[i][3] = dp[i - 1][2]
         */
        int[][] dp = new int[prices.length][4];
        dp[0][0] -= prices[0];
        for (int i = 0; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][3] - prices[i], dp[i - 1][1] - prices[i]));
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][3]);
            dp[i][2] = dp[i - 1][0] + prices[i];
            dp[i][3] = dp[i - 1][2];
        }
        return Math.max(dp[prices.length - 1][3], Math.max(dp[prices.length - 1][1], dp[prices.length - 1][2]));
    }
}
