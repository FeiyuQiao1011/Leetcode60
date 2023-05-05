package revision_and_boost_1_501515.Array.boost._503;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class longest_consecutive_Sequence_128_M {
    public int longestConsecutive(int[] nums) {
        /**
         * 排序
         * 循环 如果差一位num++
         * 返回最大的num？
         */
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int res = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1){
                num++;
                res = Math.max(res, num);
            } else if (nums[i] == nums[i - 1]) {
                continue;
            }else {
                num = 1;
            }
        }
        return res;
    }
}
