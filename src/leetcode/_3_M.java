package leetcode;

import java.util.HashSet;

/**
 * 无重复字符的最长子串
 * 哈希 + 滑动窗口
 * @author 乔飞宇
 * @version 1.0
 */
public class _3_M {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 1;
        int max = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (right < s.length()){
            char c = s.charAt(right);
            if(!hashSet.contains(c)){
                hashSet.add(c);
                max = Math.max(max, right - left + 1);
                right++;
            }else{
                hashSet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
