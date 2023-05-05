package Algorithm.DP._428;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class house_Robber_198_M {
    public int rob(int[] nums) {
        /**
         * dp[i] <=i max amount
         * dp[i] = MAX(dp[i - 2] + nums[i], dp[i - 1])
         * dp[0] = 0; dp[1] = max(dp[0], dp[1])
         * front - end because dp[i] need dp[i-2] & dp[i - 1]
         */
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
