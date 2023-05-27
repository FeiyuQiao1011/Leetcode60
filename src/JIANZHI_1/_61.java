package JIANZHI_1;

import java.util.Arrays;

/**
 * 扑克牌中的顺子
 * @author 乔飞宇
 * @version 1.0
 */
public class _61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < 4; i++) {
            if(nums[i] == 0){
                j++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[4] - nums[j] < 5;
    }
}
