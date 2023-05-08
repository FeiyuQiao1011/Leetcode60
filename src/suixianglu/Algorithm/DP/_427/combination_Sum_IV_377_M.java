package suixianglu.Algorithm.DP._427;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class combination_Sum_IV_377_M {
    public int combinationSum4(int[] nums, int target) {
        //dp[j] —— 目标为j的组合个数
        //weight[] & value[] —— nums[]
        //bagSize —— target
        //dp[0] 目标为0的组合个数 1

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
