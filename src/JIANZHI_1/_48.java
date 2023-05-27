package JIANZHI_1;

import java.util.HashMap;

/**
 * 最长的不重复的最长字串
 * DP
 * 状态定义：
 *      dp[j] 表示以字符s[j]结尾的 最长的不重复字串是 dp[j]
 * 转移方程：
 *      字符s[i]代表距离s[j]左边最近的相同字符
 *          i < 0               s[j]左边无相同字符                 dp[j] = dp[j - 1] + 1;
 *          dp[j - 1] < j - i   s[i]在子字符串dp[j - 1]区间之外     dp[j] = dp[j - 1] + 1;
 *          dp[j - 1] >= j- i   s[i]在子字符串dp[j - 1]区间内       dp[j] = j - i;
 * 注意：
 *      hashmap的put方法：
 *          Associates the specified value with the specified key in this map.
 *          If the map previously contained a mapping for the key, the old value is replaced.
 *          如果之前包含key，put方法会替换旧的value
 * @author 乔飞宇
 * @version 1.0
 */
public class _48 {
    public int lengthOfLongestSubstring(String s) {
        //为了计算i，即离s[j]最近的相同项
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0, temp = 0;
        for (int j = 0; j < s.length(); j++) {
            int i = map.getOrDefault(s.charAt(j), -1);
            map.put(s.charAt(j), j);
            temp = temp < j - i ? temp + 1 : j - i;
            res = Math.max(temp, res);
        }
        return res;
    }
}
