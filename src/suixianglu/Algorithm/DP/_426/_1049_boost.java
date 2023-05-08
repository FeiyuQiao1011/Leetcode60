package suixianglu.Algorithm.DP._426;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _1049_boost {
    public int lastStoneWeightII(int[] stones){
        //sum/2是dp的大小
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        int target = sum / 2;
        int[] dp = new int[target];

        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i] ; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
         return sum - dp[target] - dp[target];
    }
}
