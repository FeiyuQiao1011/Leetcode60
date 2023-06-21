package JIANZHI_1;

import java.util.HashMap;

/**
 * 字符串交织
 * s3能不能由s1和s2交织在一起，就是不考虑顺序？
 * @author 乔飞宇
 * @version 1.0
 */
public class _096_II {
    public boolean isInterleave(String s1, String s2, String s3) {
       int m = s1.length();
       int n = s2.length();

       if(m + n != s3.length()){
           return false;
       }

       boolean[][] dp = new boolean[m + 1][n + 1];
       dp[0][0] = true;
       //初始化
        for (int i = 1; i <= m; i++) {
            if(s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i - 1][0]){
                dp[i][0] = true;
            }
        }

        for (int i = 1; i <= n ; i++) {
            if(s2.charAt(i - 1) == s3.charAt(i - 1) && dp[0][i - 1]){
                dp[0][i] = true;
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[i - 1][j]){
                    dp[i][j] = true;
                }

                //s2
                if(s2.charAt(j - 1) == s3.charAt(i + j - 1) && dp[i][j - 1]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[m][n];
    }
}
