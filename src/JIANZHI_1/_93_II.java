package JIANZHI_1;

import java.util.HashMap;

/**
 * 最长的斐波那契数列
 * dp + 双指针
 * @author 乔飞宇
 * @version 1.0
 */
public class _93_II {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxLen = 0;
        int[][] dp = new int[n][n];

        //初始化数组
        for (int i = 0; i < n; i++) {
            hashMap.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            for (int k = i + 2; k < n; k++) {
                int j = hashMap.getOrDefault(arr[k] - arr[i], -1);
                /**
                 * 这里不会就是定义的问题
                 * 这里dp[i][j]的定义是以i、j为下标的arr中的数组的数
                 * 作为斐波那契的最后两个数的子序列的长度
                 */
                if (i < j && j < k) {
                    dp[j][k] = dp[i][j] + 1;
                    maxLen = Math.max(maxLen, dp[j][k]);
                }
            }
        }
        return maxLen == 0 ? 0 : maxLen + 2;
    }
}
