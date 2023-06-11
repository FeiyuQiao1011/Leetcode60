package JIANZHI_1;

/**
 *  最长公共子序列
 *  dp[i][j]--长度为i的序列中包含的长度为j的最长公共子序列为dp[i][j]
 *  dp[0][j] = 0
 *  dp[i][0] = 0
 *  dp[i][j] = dp[i - 1][j] || dp[i - 1][j] + 1
 * @author 乔飞宇
 * @version 1.0
 */
public class _95 {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        //初始化
        for (int i = 1; i <= text1.length(); i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= text2.length(); j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
