package suixianglu.review_backTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class letter_combination_of_a_phone_Number_17_M {
    ArrayList<String> res = new ArrayList<>();
    String[] numString = {""," ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        String item = null;
        backTrack(digits, numString, 0);
        return res;
    }

    //每次需要字符串拼接
    StringBuilder temp = new StringBuilder();
    public void backTrack(String digits, String[] numString, int num){
        if(num == digits.length()){
            res.add(temp.toString());
            return;
        }
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTrack(digits,numString,num + 1);
            temp.deleteCharAt(temp.length() - 1);
        }

    }
}
