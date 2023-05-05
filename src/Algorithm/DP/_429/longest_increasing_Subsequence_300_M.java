package Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class longest_increasing_Subsequence_300_M {
    public int lengthOfLIS(int[] nums) {
        /**
         * dp[i] 表示i之前包括i的以nums[i]结尾的最长递增子序列长度
         */
        if(nums.length <= 1) return nums.length;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if(dp[i] > result) result = dp[i];
        }
        return result;
    }
}
