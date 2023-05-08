package suixianglu.Algorithm.DP._425;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _01bag_2 {
    public static void testWightBagProblem(int[] weight, int[] value, int bagSize){
        //一维DP
        int[] dp = new int[bagSize + 1];

        //初始化
        //java默认全为0

        //遍历
        //外层先遍历物品
        for (int i = 0; i < weight.length; i++) {//遍历物品
            for (int j = bagSize; j >= weight[i]; j--) {//遍历背包容量，且必须倒序遍历
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
    }
}
