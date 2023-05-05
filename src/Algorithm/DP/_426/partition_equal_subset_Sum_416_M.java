package Algorithm.DP._426;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class partition_equal_subset_Sum_416_M {

    public boolean canPartition(int[] nums) {
        //确定dp数组——放入背包后最大价值
        int[] dp = new int[10001];

        //确定target
        int sum = 0;
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum % 2 != 0) return false;
        target = sum / 2;

        //遍历
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j++) {
                dp[j] = Math.max(dp[j], dp[j - nums[i] + nums[i]]);
            }
        }
        if(dp[target] == target) return true;
        return false;
    }
}
