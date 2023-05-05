package revision_and_boost_1_501515.Array.revision;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class search_insert_Position_35_E {
    public int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) >> 1;
            if(nums[mid] > target) right = mid - 1;
            if (nums[mid] < target) left = mid + 1;
            if(nums[mid] == target) return mid;
        }
        return left;
    }
}
