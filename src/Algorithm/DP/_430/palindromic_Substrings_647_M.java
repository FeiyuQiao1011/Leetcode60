package Algorithm.DP._430;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class palindromic_Substrings_647_M  {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length() + 1][s.length() + 1];
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                dp[i][j] = false;
            }
        }

        for (int i = s.length() - 1; i >= 0 ; i--) {
            for (int j = i; j < s.length() ; j++) {
                if(s.charAt(i) == s.charAt(j)){
                    if(j - i <= 1){
                        result++;
                        dp[i][j] = true;
                    } else if (dp[i + 1][j - 1]) {
                        result++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return result;
    }
}
