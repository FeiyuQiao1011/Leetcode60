package suixianglu.Algorithm.DP._424;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class unique_binary_search_Trees_96_M {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
