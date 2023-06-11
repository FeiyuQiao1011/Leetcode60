package JIANZHI_1;

import java.util.Arrays;

/**
 * n个骰子，所有骰子都朝上一面
 * dp
 *      n - 1个骰子的解f(n - 1)
 *      添加一枚骰子，n个骰子和为x的概率f（n,x）
 *      f(n,x) = [f(n - 1, x - 1) + f(n - 1, x- 2) + ... + f(n - 1, x - 6)] * 1/6
 *      有越界问题：
 *              如果计算f(2,2),可能会计算f(1, 2 - 6)
 *              只需计算f(1, 1)、f(1, 2)
 *              只会在低点数出现
 *      正向遍历：
 *              f(n - 1, x)仅与f(n, x + 1)、f(n, x + 2)、... 、f(n, x + 6)有关
 *      dp[i][j] --- 前i个骰子和为j的概率
 *      题目要求：n个骰子面朝上所有可能的和的概率
 *              2个：2 - 12
 *              3个：3 - 18
 *              ...
 *              n个：n - 6 * n
 *              dp容量：(6n - n) + 1
 *      只需要dp[n][j], n个骰子，和为j的概率. 一维数组滚动
 * @author 乔飞宇
 * @version 1.0
 */
public class _60 {
    public double[] dicesProbability(int n) {
        double[] dp = new double[6];
        //初始化
        //骰子1个，只有1-6个结果，概率都是1 / 6
        Arrays.fill(dp, 1.0 / 6.0);
        //从2个骰子开始，滚动ing
        for (int i = 2; i <= n ; i++) {
            //新的概率数组，容量就是骰子个数 * 6 - 骰子个数 + 1
            double[] temp = new double[5 * i + 1];
            //j代表的是骰子的朝上的面的和
            for (int j = 0; j < dp.length; j++) {

                for (int k = 0; k < 6; k++) {
                    //
                    temp[j + k] += dp[j] / 6.0;
                }
            }
            dp = temp;
        }
        return dp;
    }
}
