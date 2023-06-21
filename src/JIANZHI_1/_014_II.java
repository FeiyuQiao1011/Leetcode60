package JIANZHI_1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 找s2中是否包含s1的变位字串
 * 回溯找到所有s1的组合
 * 然后定义一个字串的函数，看看是不是？
 * @author 乔飞宇
 * @version 1.0
 */
public class _014_II {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        //初始化s1的词频
        for (int i = 0; i < s1.length(); i++) {
            if(map1.containsKey(s1.charAt(i))){
                map1.replace(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            }else {
                map1.put(s1.charAt(i), 1);
            }
        }

        //滑动窗口
        int left = 0;
        int right = 0;
        int count = 0;
        while (right < s2.length()){
            char ch = s2.charAt(right);
            map2.put(ch, map2.getOrDefault(ch,0) + 1);

            //
            if(map1.containsKey(ch) && map1.get(ch).equals(map2.get(ch))){
                count++;
            }

            //滑动窗口大小是s1大小， 而且此时匹配上的字符串也是s1的字符串的数
            if(right - left + 1 == s1.length()){
                //而且此时匹配上的字符串也是s1的字符串的数
                if(count == map1.size()){
                    return true;
                }

                char leftCh = s2.charAt(left);
                map2.put(leftCh, map2.get(leftCh) - 1);
                if(map1.containsKey(leftCh) && map1.get(leftCh).equals(map2.get(leftCh))){
                    count--;
                }

                left++;
            }

            right--;
        }
        return false;
    }
}
