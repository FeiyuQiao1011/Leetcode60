package suixianglu.Algorithm.DP._425;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _01bag {
    public static void main(String[] args){
        int[] weight = {1,3,4};
        int[] value = {15,20,30};
        int bagSize = 4;
        testWightBagProblem(weight, value, bagSize);
        for (int i = 0; i < weight.length; i++) {
            for (int j = 0; j <= bagSize; j++) {
                //System.out.println(dp[i][j]);
            }
        }
    }

    public static void testWightBagProblem(int[] weight, int[] value, int bagSize){
        //创建DP数组
        int goods = weight.length;
        int[][] dp = new int[goods][bagSize + 1];

        //DP数组初始化
        //第一列——j为0，即背包啥也装不下，可写可不写，因为初始化dp数组时全为零
        for (int i = 0; i < goods; i++) {
            dp[i][0] = 0;
        }
        //第一行——i为0，只装物品1，实际意义模糊
        for (int i = weight[0]; i <= bagSize; i++) {
            dp[0][i] = value[0];
        }

        //遍历填充dp数组
        for (int i = 1; i < weight.length; i++) {
            for (int j = 1; j <= bagSize; j++) {
                if(j < weight[i]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
            }
        }
    }
}
