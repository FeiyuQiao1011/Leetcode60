package Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class distinct_Subsequences_115_H {
    public int numDistinct(String s, String t) {
        /**
         * dp[i][j]
         */
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i <= s.length() ; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}
