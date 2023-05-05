package revision_and_boost_1_501515.Array.revision._504;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _704_E {
    public int search(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        while (l <= r){
            int mid = l + ((r - l) >> 1);
            if(nums[mid] > target){
                r = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
