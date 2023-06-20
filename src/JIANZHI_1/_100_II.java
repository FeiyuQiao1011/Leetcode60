package JIANZHI_1;

import java.util.List;

/**
 * 三角形中最小路径只和
 * 每次移动只能移动到下一层的下标相同处或者下标+1的位置
 * 找到最小的路径和
 * dp[i][j]表示第i层第j列的最小路径和
 * @author 乔飞宇
 * @version 1.0
 */

/**
 * 想法：需要维护一个二维dp数组
 * 需要一个LinkedList放每次遍历的结果
 * sum记录每次遍历的值，比较求最小值
 * dp[i][j] = min(dp[i - 1][j] + triangle[i][j], dp[i - 1][j - 1] + triangle[i][j])
 */

/**
 * 感受：感觉dp最重要的点在于分析，得到每种情况对应的处理方式，全部照顾到
 * dp本身就是遍历，照顾到所有情况了自然而然就得到结果了，处理上没什么难点
 * 对于本题，需要考虑 dp[i][0] 的情况，只能是从 dp[i - 1][0] 过来
 * dp[i][i] 的结果，只能从dp[i - 1][i - 1]的结果过来
 * 如果这些没考虑清楚，也可能会有dp的结果，但是不完全正确。
 * dp流程：
 *      1.给dp数组做定义，考虑一维还是二维，dp数组空间多大，每一层代表什么意义，dp代表什么意义
 *      2.对dp数组初始化
 *      3.结合dp定义得出推导公式
 *      4.考虑遍历方式，从前往后还是从后往前，先i还是先j
 *      5.考虑特殊问题，例如本题的队首和队尾。
 */
public class _100_II {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j] + triangle.get(i).get(j), dp[i - 1][j - 1] + triangle.get(i).get(j));
            }
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            sum = Math.min(sum, dp[n - 1][i]);
        }
        return sum;
    }
}
