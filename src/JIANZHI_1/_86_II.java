package JIANZHI_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _86_II {
    ArrayList<List<String>> res = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();
    public String[][] partition(String s) {
        backTrack(s);
        String[][] result = new String[res.size()][];
        for (int i = 0; i < res.size(); i++) {
            List<String> strings = res.get(i);
            result[i] = strings.toArray(new String[strings.size()]);
        }
        return result;
    }

    public void backTrack(String s){
        if(s.length() == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 1; i <= s.length(); i++) {
            String subString = s.substring(0, i);
            if(isPalindrome(subString)){
                path.add(subString);
                backTrack(s.substring(i));
                path.removeLast();
            }
        }
    }

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
