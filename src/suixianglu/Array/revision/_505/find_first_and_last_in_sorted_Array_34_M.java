package suixianglu.Array.revision._505;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class find_first_and_last_in_sorted_Array_34_M {
    public int[] searchRange(int[] nums, int target) {
        int a = findLeft(nums,target);
        int b = findRight(nums, target);
        return new int[]{a, b};
    }

    public int findLeft(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;
        while (left <= right){
            int mid = left + ((left + right) >> 1);
            if(nums[mid] < target) left = mid;
            if(nums[mid] == target) return left;
        }
        return leftBorder;
    }

    public int findRight(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + ((left + right) >> 1);
            if(nums[mid] > target) right = mid;
            if(nums[mid] == target) return right;
        }
        return -1;
    }
}
