package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 最多的括号组合，回溯法做
 * 组合问题，做出来就不错了，效率其次
 * 回溯记录左括号，右括号数量
 * @author 乔飞宇
 * @version 1.0
 */
public class _22_M {
    ArrayList<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backTrack(0, 0, n, "");
        return res;
    }

    public void backTrack(int open, int close, int n, String current){
        if(current.length() == 2 * n){
            res.add(current);
            return;
        }

        if(open < n){
            backTrack(open + 1, close, n, current + "(");
        }

        if(close < open){
            backTrack(open, close + 1, n, current + ")");
        }
    }
}
