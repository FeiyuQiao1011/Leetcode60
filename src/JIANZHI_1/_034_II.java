package JIANZHI_1;

import java.util.HashMap;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _034_II {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            hashMap.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            int s1_len = s1.length();
            String s2 = words[i + 1];
            int s2_len = s2.length();
            for (int j = 0; j < Math.max(s1_len, s2_len); j++) {
                int idx_s1 = j >= s1_len ? -1 : hashMap.get(s1.charAt(j));
                int idx_s2 = j >= s2_len ? -1 : hashMap.get(s2.charAt(j));
                if(idx_s1 > idx_s2) return false;
                if(idx_s1 < idx_s2) break;
            }
        }
        return true;
    }
}
