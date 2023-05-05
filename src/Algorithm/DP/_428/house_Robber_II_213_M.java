package Algorithm.DP._428;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class house_Robber_II_213_M {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if (nums.length == 0) return 0;
        int result1 = dp(nums, 0, nums.length - 2);
        int result2 = dp(nums, 1, nums.length - 1);
        return Math.max(result1,result2);
    }

    public int dp(int[] nums, int start, int end){
        if(end == start) return nums[start];
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[end];
    }
}
