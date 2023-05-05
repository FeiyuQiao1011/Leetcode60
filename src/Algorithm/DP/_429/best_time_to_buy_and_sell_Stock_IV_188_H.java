package Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class best_time_to_buy_and_sell_Stock_IV_188_H {
    public int maxProfit(int k, int[] prices) {
        /**
         * 0: 不操作
         * 1：第一次买入
         * 2：第一次卖出
         * 3：第二次买入
         * 4：第二次卖出
         * 。。。
         * k
         */

        int[][] dp = new int[prices.length][2 * k + 1];
        for (int i = 1; i < 2 * k; i+=2) {
            dp[0][i] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < 2 * k - 1; j += 2) {
                dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
            }
        }
        return dp[prices.length - 1][2 * k];
    }
}
