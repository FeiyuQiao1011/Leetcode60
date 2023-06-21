package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _68_II {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
}
