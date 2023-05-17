package JIANZHI_1;

/**
 * 股票的最大利润
 * @author 乔飞宇
 * @version 1.0
 */
public class _63 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int dp = 0;
        int cost = prices[0];
        for (int i = 1; i < prices.length; i++) {
            cost = Math.min(cost, prices[i - 1]);
            dp = Math.max(dp, prices[i] - cost);
        }
        return dp;
    }

    public int maxProfit1(int[] prices){
        if(prices.length == 0) return 0;
        return 1;
    }
}
