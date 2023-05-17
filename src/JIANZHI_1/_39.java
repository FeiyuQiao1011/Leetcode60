package JIANZHI_1;

import java.util.Arrays;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _39 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
