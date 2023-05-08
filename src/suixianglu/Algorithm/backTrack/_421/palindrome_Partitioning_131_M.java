package suixianglu.Algorithm.backTrack._421;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class palindrome_Partitioning_131_M {
    //全局变量放结果
    List<List<String>> res = new ArrayList<>();
    Deque<String> list = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backTrack(s,0);
        return res;
    }

    public void backTrack(String s, int index){
        //返回条件——index比字符串长
        if(index >= s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        //单层循环
        for (int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                String str = s.substring(index, i + 1);
                list.addLast(str);
            }else {
                continue;
            }
            backTrack(s, i + 1);
            list.removeLast();
        }
    }

    public boolean isPalindrome(String s, int start, int end){
        for (int i = start, j = end; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
