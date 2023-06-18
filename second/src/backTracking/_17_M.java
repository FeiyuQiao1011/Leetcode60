package backTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个2-9的字符串，返回所有可能的字符组合
 * 需要建立一个数字到字符串的映射关系
 * @author 乔飞宇
 * @version 1.0
 */
public class _17_M {
    HashMap<Character, String> map = new HashMap<>();
    ArrayList<String> res = new ArrayList<>();

    StringBuilder temp = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        init();
        if(digits.equals("")){
            return res;
        }
        backTrack(digits, map, 0);
        return res;
    }

    /**
     * 怎么建立数字到字符串的映射关系？
     * 可以用String[]下标代表数字
     * 可以用map，建立字符串到数字的映射
     */
    public void init(){
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public void backTrack(String digits, HashMap<Character, String> map, int num){
        //返回条件
        if(num == digits.length()){
            res.add(temp.toString());
            return;
        }
        //计数
        String str = map.get(digits.charAt(num));
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTrack(digits,map,num + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
