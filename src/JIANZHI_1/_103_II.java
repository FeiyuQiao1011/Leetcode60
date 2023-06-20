package JIANZHI_1;

/**
 * 找到最小的硬币个数，满足amount
 * dp[i] 表示 amount为i的时候最小硬币个数是dp[i]
 * dp[j] = min(dp[j - coins[i]] + 1, dp[j])
 * @author 乔飞宇
 * @version 1.0
 */
public class _103_II {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i : dp) {
            i = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {//遍历背包
            for (int j = 0; j < coins.length; j++) {//遍历物品
                if(i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
        if(dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }

    public int coinChange1(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < amount; j++) {
                if(dp[j - coins[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j - coins[i]] + 1, dp[j]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
