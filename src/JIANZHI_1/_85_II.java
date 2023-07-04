package JIANZHI_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _85_II {
    ArrayList<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        backTrack(n, stringBuilder, 0, 0);
        return res;
    }

    public void backTrack(int n, StringBuilder stringBuilder, int open, int close){
        if(open == n && close == n){
            res.add(stringBuilder.toString());
            return;
        }

        if(open < n){
            stringBuilder.append("(");
            backTrack(n, stringBuilder, open + 1, close);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        if(close < open){
            stringBuilder.append(")");
            backTrack(n, stringBuilder, open, close + 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
