package Algorithm.DP._426;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _416_boost {
    public boolean canPartition(int[] nums){
        int sum = 0;

        //dp0-1背包问题
        /**
         * N件物品 & 最多能背重量为W的背包
         * 第i件物品的重量为weight[i], 价值为value[i]
         * 不能重复放入
         * DP[i][j]指的是将i件物品放入容量为j的背包中的最大价值
         */

        //背包体积为sum/2
        //商品为元素的数值，价格也为元素的数值——weight[] && value[]
        //每个元素不能重复放进去

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int target = sum / 2;
        int m = nums.length;
        int n = target;
        int[] dp = new int[target + 1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[0]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        if(dp[target] == target) return true;
        return false;
    }
}
