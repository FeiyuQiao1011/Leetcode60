package Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class maximum_Subarray_53_M {
    /**
     * dp[i] 最后为num[i]最大的连续子数组的和
     * dp[0] = nums[0];
     * dp[i] = dp[i - 1] + values[i] || nums[i]
     */

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res = res > dp[i] ? res : dp[i];
        }
        return res;
    }
}
