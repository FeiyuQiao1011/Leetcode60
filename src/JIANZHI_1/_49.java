package JIANZHI_1;

/**
 * 丑数
 * 只包含质因子2，3，5
 * 分析：如果一个数m是丑数，
 * m = 某较小丑数 * 2 ｜｜ 3 ｜｜ 5
 *
 * dp[i] 表示第i + 1 个丑数
 * dp[i] = min(dp[a] * 2, dp[b] * 3, dp[c] * 5)
 * a, b, c 满足下列条件：——dp[a] 一定是第一个*2后大于dp[i]的数，其余同理）
 *      dp[a] * 2 > dp[i - 1] >= dp[a - 1] * 2
 *      dp[b] * 3 > dp[i - 1] >= dp[b - 1] * 3
 *      dp[c] * 5 > dp[i - 1] >= dp[c - 1] * 5
 * dp[0] = 1
 * 返回dp[n - 1]
 *
 * 注意：可能会被非丑数迷惑，一直在想遍历遇到非丑数怎么办？
 *      根本不用考虑非丑数的情况，dp[]数组里都是丑数，想想dp数组的定义。
 * @author 乔飞宇
 * @version 1.0
 */
public class _49 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int a = 0, b = 0, c = 0;
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(n2,Math.min(n3,n5));
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
        return dp[n - 1];
    }
}

