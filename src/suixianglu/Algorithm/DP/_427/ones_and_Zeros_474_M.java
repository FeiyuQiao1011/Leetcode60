package suixianglu.Algorithm.DP._427;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class ones_and_Zeros_474_M {
    public int findMaxForm(String[] strs, int m, int n) {
        //dp[][]最多有i个0和j个1的最大子集大小为dp[i][j]
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs){
            int zeroNum = 0;
            int oneNum = 0;
            for (char c : str.toCharArray()){
                if(c == '0') zeroNum++;
                else oneNum++;
            }


            for (int i = m; i >= zeroNum; i--){
                for (int j = n; j >=oneNum ; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
