package suixianglu.Algorithm.DP._428;

import java.util.HashSet;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class word_Break_138_M {
    public boolean wordBreak(String s, List<String> wordDict) {
        /**
         * s为背包，wordDict为物品，物品可以重复用
         * dp[j]表示容量为j的装满是true
         * 地推：如果【j，i】这个区间的子串出现在字典里 & dp【j】是true —— dp【i】为true
         * dp【0】为true
         */
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = false;
        }
        dp[0] = true;
        //求排列数，先遍历背包，再遍历物品
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i && !dp[i]; j++) {
                if (set.contains(s.substring(j, i)) && dp[j]){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
