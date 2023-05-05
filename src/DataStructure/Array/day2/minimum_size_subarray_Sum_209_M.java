package DataStructure.Array.day2;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class minimum_size_subarray_Sum_209_M {
    public int minSubArrayLen(int target, int[] nums){
        int left = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum >= target){
                result = result < right - left + 1 ? result : right - left + 1;
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
