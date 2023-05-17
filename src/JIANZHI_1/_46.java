package JIANZHI_1;

/**
 * dp[i]表示num长度为i的一共有多少种方法
 * dp[0] = 0
 * dp[1] = 1
 * dp[i] =
 * @author 乔飞宇
 * @version 1.0
 */
public class _46 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int j = 2; j <= s.length(); j++) {
            String temp = s.substring(j - 2, j);
            if(temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0){
                dp[j] = dp[j - 1] + dp[j - 2];
            }else {
                dp[j] = dp[j - 1];
            }
        }
        return dp[s.length()];
    }
}
