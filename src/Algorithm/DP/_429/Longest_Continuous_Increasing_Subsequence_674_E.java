package Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class Longest_Continuous_Increasing_Subsequence_674_E {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]){
                dp[i] = dp[i - 1] + 1;
            }
            res = res > dp[i + 1] ? res : dp[i];
        }
        return res;
    }
}
