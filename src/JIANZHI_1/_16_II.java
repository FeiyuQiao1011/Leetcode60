package JIANZHI_1;

import java.util.HashSet;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _16_II {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0, right = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (right < s.length()){
            char c = s.charAt(right);
            if(!hashSet.contains(c)){
                hashSet.add(c);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }else {
                hashSet.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
