package JIANZHI_1;

/**
 * dp做，dp[i]表示长度为i的字串
 * @author 乔飞宇
 * @version 1.0
 */
public class _20_II {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            sum++;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(s.charAt(i) == s.charAt(j) && ((i - j) < 3 || dp[i - 1][j + 1])){
                    dp[i][j] = true;
                    sum++;
                }
            }
        }
        return sum;
    }
}
