package JIANZHI_1;

/**
 * 打家劫舍！！！
 * 只能偷不相邻的，求最大，dp
 * @author 乔飞宇
 * @version 1.0
 */
public class _89_II {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
