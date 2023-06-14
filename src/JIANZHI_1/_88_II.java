package JIANZHI_1;

/**
 * 爬楼梯的最小成本
 * 动态规划做
 * dp[i] 表示 爬到第i阶的最小成本
 * @author 乔飞宇
 * @version 1.0
 */
public class _88_II {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        //思考dp[0]和dp[1]完成初始化
        //因为一次可以选择从0或者1开始，所以最小花费都是0

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}
