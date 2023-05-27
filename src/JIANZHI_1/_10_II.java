package JIANZHI_1;

/**
 * dp[i] 表示跳i阶台阶有dp[i]种方式
 * @author 乔飞宇
 * @version 1.0
 */
public class _10_II {
    public int numWays(int n) {
        if(n <= 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
