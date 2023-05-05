package revision_and_boost_1_501515.Array.boost._504;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class search_in_rotated_sorted_Array_33_M {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + ((right - left) >> 1);
            if(nums[mid] == target){
                return mid;
            }

            if(nums[0] <= nums[mid]){
                if(target >= nums[0] && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if(target > nums[mid] && target <= nums[nums.length - 1]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
