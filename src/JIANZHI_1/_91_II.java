package JIANZHI_1;

import java.util.Arrays;

/**
 * 粉刷房子的最小花销
 * 相邻的两个房子颜色不能相同
 * dp[i][j]表示把第0到第i个房子刷成第j种颜色的最小花销？
 * dp[0][j] = 三种颜色的最小花销
 * dp[i][3]
 * dp[i][0] = min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0]
 * dp[i][1] = min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1]
 * dp[i][2] = min(dp[i - 1][0]. dp[i - 1][1]) + costs[i][2]
 * @author 乔飞宇
 * @version 1.0
 */
public class _91_II {
    public int minCost(int[][] costs) {
        int n = costs.length;
        int[][] dp = new int[n][3];
        for (int i = 0; i < 3; i++) {
            dp[0][i] = costs[0][i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                //合并三种情况，这种处理方式有意思
                dp[i][j] = Math.min(dp[i - 1][(j + 1) % 3], dp[i - 1][(j + 2) % 3]) + costs[i][j];
            }
        }
        //求一个list里的最小值
        Arrays.sort(dp[n - 1]);
        //return Arrays.stream(dp[n - 1]).min().getAsInt();
        return dp[n - 1][0];
    }
}
