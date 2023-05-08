package suixianglu.Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class longest_common_Subsequence_1143_M {
    public int longestCommonSubsequence(String text1, String text2) {
        /**
         * dp[i][j] 表示[0 - （i - 1）][0 - （j- 1）]的最长公共子序列长度
         * dp[0][0] = 1
         * dp[i][j] = dp[i - 1][j - 1] + 1
         */
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i <= text1.length(); i++) {
            char char1 = text1.charAt(i - 1);
            for (int j = 1; j <= text2.length(); j++) {
                char char2 = text2.charAt(j - 1);
                if(char1 == char2){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
