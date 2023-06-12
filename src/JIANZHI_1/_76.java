package JIANZHI_1;

import java.util.Arrays;

/**
 * 找数组中第k大的数
 * @author 乔飞宇
 * @version 1.0
 */
public class _76 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - 4];
    }
}
