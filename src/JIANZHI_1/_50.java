package JIANZHI_1;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _50 {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], !map.containsKey(chars[i]));
        }
        for (char sc : chars){
            if(map.get(sc)) return sc;
        }
        return ' ';
    }
}
