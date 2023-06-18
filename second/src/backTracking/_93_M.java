package backTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 分割符合条件的IP地址
 * 分割问题
 * 难点在于规划
 * 两件事：回溯，分割问题
 *        判断是否是合法IP地址
 * @author 乔飞宇
 * @version 1.0
 */
public class _93_M {
    ArrayList<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backTrack(s, 0, 0);
        return res;
    }

    public void backTrack(String s, int startIndex, int num){
        if(num == 3){
            //这时只是判断最后一个字串是不是合法的
            //nb
            if(isValid(s, startIndex, s.length() - 1)){
                res.add(s);
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            /**
             * 这里的逻辑，如果他是一个合法的字串，就可以直接加.
             * 回溯算法，他根据"."的数量num，还有回退控制
             * 一定会遍历到所有符合结果的子集。
             * 这里相当于会判断前三个点之前的是否合法，不会对点之后的最后一部分进行判断
             * 返回时判断最后一部分是否合法
             * 这里即使1.1.1.25555555555也是符合条件的
             * 只不过最后返回时最后一部分会判断不合法，不会添加到结果集中
             */
            if(isValid(s, startIndex, i)){
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                num++;
                backTrack(s, i + 2, num);
                num--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            }else {
                break;
            }
        }
    }

    public boolean isValid(String s, int start, int end){
        /**
         * 不合法的情况
         * 1. start > end
         * 2.以0开头
         * 3. > 255
         */
        //1 start > end
        if(start > end) return false;
        //2 以0开头
        if(s.charAt(start) == '0' && start != end) return false;
        //3 > 255
        int num = 0;
        for (int i = start; i <= end; i++) {
            num = num * 10 + s.charAt(i) - '0';
            if(num > 255){
                return false;
            }
        }
        return true;
    }
}
