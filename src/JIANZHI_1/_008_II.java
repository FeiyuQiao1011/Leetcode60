package JIANZHI_1;

/**
 * 和大于等于target的最短连续子数组
 * 滑动窗口
 * @author 乔飞宇
 * @version 1.0
 */
public class _008_II {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int size = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target){
                size = Math.min(size, i - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return size == Integer.MAX_VALUE ? 0 : size;
    }
}
