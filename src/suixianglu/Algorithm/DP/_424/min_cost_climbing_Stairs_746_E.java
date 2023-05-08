package suixianglu.Algorithm.DP._424;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class min_cost_climbing_Stairs_746_E {
    /**
     * 1.确定dp数组及其下标的含义
     * 2.确定递推公式
     * 3.dp数组如何初始化
     * 4.确定遍历顺序
     * 5.举例推导dp数组
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        int sum = 0;
        for (int i = 0; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}
