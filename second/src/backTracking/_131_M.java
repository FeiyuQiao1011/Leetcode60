package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 分割回文串
 * 切割问题
 * 判断回文
 * @author 乔飞宇
 * @version 1.0
 */
public class _131_M {
    ArrayList<List<String>> res = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();
    public List<List<String>> partition(String s) {
        backTrack(s, 0);
        return res;
    }

    public void backTrack(String s, int startIndex){
        if(startIndex >= s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if(isP(s, startIndex, i)){
                String substring = s.substring(startIndex, i + 1);
                path.add(substring);
                backTrack(s, i + 1);
                path.removeLast();
            }
        }
    }

    /**
     * 判断回文
     * @param s
     * @param start
     * @param end
     * @return
     */
    public boolean isP(String s, int start, int end){
        for (int i = start, j = end; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
