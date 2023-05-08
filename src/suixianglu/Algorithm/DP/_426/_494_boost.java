package suixianglu.Algorithm.DP._426;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _494_boost {
    public int findTargetSumWays(int[] nums, int target){
        //dp[j]目标和为j的时候有dp[j]种方法
        //sum dp的大小
        //加法对应总和为x，减法sum - x
        //要求x - （sum - x）= target
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(Math.abs(target) > sum) return 0;
        if((target + sum) % 2 == 1) return 0;
        int bagSize = (sum + target) / 2;

        int[] dp = new int[bagSize + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagSize; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[bagSize];
    }
}
