package JIANZHI_1;

/**
 * 剪绳子
 *      分成几份，求最大乘积
 *      dp做，求dp[i]表示i的最大乘积是dp[i]
 * @author 乔飞宇
 * @version 1.0
 */
public class _14_II {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
