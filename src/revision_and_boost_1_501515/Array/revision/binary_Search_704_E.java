package revision_and_boost_1_501515.Array.revision;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class binary_Search_704_E {
    /**
     * 二分法——边界问题
     * while(left <= right) || while(left < right)
     * [left, right] || [left, right)
     * +1 -1 ｜｜ 原值
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target){
        //二分
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > target){
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
