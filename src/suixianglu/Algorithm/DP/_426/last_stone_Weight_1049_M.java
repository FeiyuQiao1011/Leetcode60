package suixianglu.Algorithm.DP._426;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class last_stone_Weight_1049_M {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        int target = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        target = sum / 2;

        int[] dp = new int[target + 1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i] ; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - dp[target] - dp[target];
    }
}
