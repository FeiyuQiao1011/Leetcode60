package revision_and_boost_1_501515.Array.revision._504;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _53_M {
    public int maxSubArray(int[] nums){
        /**
         * 动态规划
         * dp[i] ---> 长度为i的nums的最大子数组之和
         * dp[0] = 0;
         */
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
               dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
               res = Math.max(res, dp[i]);
        }
        return res;
    }
}
