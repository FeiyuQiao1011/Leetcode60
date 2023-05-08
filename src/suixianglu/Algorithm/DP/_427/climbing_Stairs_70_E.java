package suixianglu.Algorithm.DP._427;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class climbing_Stairs_70_E {
    public int climbStairs(int n){
        //dp[i] 爬到有i阶楼梯的楼顶有dp[i]种方法
        int[] dp = new int[n + 1];
        int[] weight = {1, 2};
        dp[0] = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < weight.length; j++) {
                if(i >= weight[j]) dp[i] += dp[i - weight[j]];
            }
        }
        return dp[n];
    }
}
