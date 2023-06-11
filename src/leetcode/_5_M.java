package leetcode;

/**
 * 最长回文子串
 * dp[i] 表示 长度为i的string的最长回文子串为dp[i]
 *      dp[i] 若最后一位没用 dp[i] = dp[i - 1]
 *            若最后一位用到了 dp[i] = dp[i - 1] + 1
 *      dp[i] = Max(dp[i - 1], dp[i - 1] + 1)
 *
 *      回文串
 *      asddsa ｜｜ asa
 * @author 乔飞宇
 * @version 1.0
 */
public class _5_M {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2){
            return s;
        }

        //dp[i][j]表示子字符串[i,......,j]是回文
        boolean[][] dp = new boolean[len][len];

        //初始化
        //所有长度为1的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        int maxLen = 1, begin = 0;

        //循环便利
        for (int l = 2; l < len; l++) {
            for (int i = 0; i < len; i++) {
                //判断是否越界
                int j = l + i - 1;
                if(j > len) break;

                if(charArray[i] != charArray[j]){
                    dp[i][j] = false;
                }else {
                    if(j - i < 3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if(dp[i][j] && j - i + 1 > maxLen){
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
