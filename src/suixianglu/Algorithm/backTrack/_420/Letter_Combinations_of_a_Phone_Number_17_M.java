package suixianglu.Algorithm.backTrack._420;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class Letter_Combinations_of_a_Phone_Number_17_M {
    //1.映射问题
    //2.解决
    List<String> res = new ArrayList<>();
    String[] numString = {"", "", "abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return res;
        }
        String s;
        backTrack(digits, numString, 0);
        return res;
    }
    StringBuilder temp = new StringBuilder();
    public void backTrack(String digits, String[] numString, int index){
        //终止条件
        if(index == digits.length()){
            res.add(temp.toString());
            return;
        }

        String str = numString[digits.charAt(index) - '0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTrack(digits, numString, index + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
