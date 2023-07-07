package JIANZHI_1;

/**
 * 反转最小字符，让他单调递增
 * dp[i]表示反转最小次数，让他单调递增
 * @author 乔飞宇
 * @version 1.0
 */
public class _92_II {
    public int minFlipsMonoIncr(String s) {
        int[][] dp = new int[s.length()][2];
        int n = s.length();
        //初始化
        if(s.charAt(0) == '0'){
            dp[0][1] = 1;
        }else {
            dp[0][0] = 1;
        }

        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + 1;
            }else {
                dp[i][0] = dp[i - 1][0] + 1;
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]);
            }
        }
        return Math.min(dp[n - 1][0], dp[n - 1][1]);
    }
}
