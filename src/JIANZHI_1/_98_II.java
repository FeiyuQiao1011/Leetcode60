package JIANZHI_1;

/**
 * dp
 * 有多少条路径？移动到finish？
 * 每次只能向下或者向右
 * dp[i][j] 表示从起点到i，j一共有dp[i][j]条路径
 * @author 乔飞宇
 * @version 1.0
 */
public class _98_II {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        //初始化
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
