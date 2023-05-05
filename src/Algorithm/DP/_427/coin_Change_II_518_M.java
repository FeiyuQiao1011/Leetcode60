package Algorithm.DP._427;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class coin_Change_II_518_M {
    public int change(int amount, int[] coins) {
        //dp[j] amount 为 j 的dp组合数
        //weight[] & value[] —— coins[]
        //bagWeight —— amount
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = 1; i <= coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        if(dp[amount] == amount) return dp[amount];
        return 0;
    }
}
