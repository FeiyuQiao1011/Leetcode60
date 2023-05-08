package suixianglu.Algorithm.DP._427;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class entire_bag {

    //先遍历物品，再遍历背包
    public static void testCompletePack(){
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagWeight = 4;
        int[] dp = new int[bagWeight + 1];

        for (int i = 0; i < weight.length; i++) {
            for (int j = weight[i]; j <= bagWeight ; j++) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
    }

    //先遍历背包，再遍历物品
    public static void testCompletePackAnotherWay(){
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagWeight = 4;

        int[] dp = new int[bagWeight + 1];
        for (int i = 1; i < bagWeight + 1; i++) {
            for (int j = 0; j < weight.length; j++) {
                dp[i] = Math.max(dp[i], dp[i - weight[j]] + value[j]);
            }
        }
    }
}
