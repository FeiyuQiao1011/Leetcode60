package suixianglu.Algorithm.DP._427;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class perfect_Squares_279_M {
    public int numSquares(int n) {
        //dp[j] j的完全平方数最少的数量
        //dp[0] = 0 / 1;
        //dp[j] = min(dp[j], dp[j - i * i] + 1)
        int[] dp = new int[n + 1];
        int max = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            dp[i] = max;
        }
        dp[0] = 0;
        for (int i = 1; i * i <= n; i++) {
            for (int j = i * i; j <= n; j++) {
                if (dp[j - i * i] != max) {
                    dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
                }
            }
        }
        return dp[n];
    }
}
