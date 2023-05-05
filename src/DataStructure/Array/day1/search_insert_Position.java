package DataStructure.Array.day1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class search_insert_Position {
    public int searchInsert(int[] nums, int target){
        //左右指针
        int left = 0, right = nums.length - 1;

        //mid
        int mid = (left + right) >> 1;

        //二分
        while (left <= right){
            mid = (left + right) >> 1;

            if(nums[mid] > target){
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return right + 1;
    }
}
