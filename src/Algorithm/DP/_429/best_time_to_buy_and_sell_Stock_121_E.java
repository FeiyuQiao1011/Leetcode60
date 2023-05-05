package Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class best_time_to_buy_and_sell_Stock_121_E {
    public int maxProfit(int[] prices) {
        int result = 0;
        int num = prices[0];
        for (int i = 0; i < prices.length; i++) {
            num = Math.min(num, prices[i]);
            result = Math.max(result, prices[i] - num);
        }
        return result;
    }
}
