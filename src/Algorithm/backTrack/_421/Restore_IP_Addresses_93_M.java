package Algorithm.backTrack._421;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class Restore_IP_Addresses_93_M {
    //全局变量存放结果
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backTrack(s,0, 0);
        return res;
    }

    public void backTrack(String s, int startIndex, int pointNum){
        //结束条件
        if(pointNum == 3){
            if(isValid(s, startIndex, s.length() - 1)){
                res.add(s);
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++){
            if(isValid(s, startIndex, i)){
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                pointNum++;
                backTrack(s, i + 2, pointNum);
                pointNum--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            }else {
                break;
            }
        }
    }

    public boolean isValid(String s, int start, int end){
        if(start > end){
            return false;
        }

        if(s.charAt(start) == '0' && start != end){
            return false;
        }

        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0'){
                return false;
            }

            num = num * 10 + (s.charAt(i) - '0');
            if(num > 255){
                return false;
            }
        }
        return true;
    }
}
