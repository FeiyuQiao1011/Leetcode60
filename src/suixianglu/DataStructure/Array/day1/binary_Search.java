package suixianglu.DataStructure.Array.day1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class binary_Search {
    //给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target，
    //写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
    public int search(int[] nums, int target) {
        //左右指针
        int left = 0, right = nums.length - 1;

        //二分mid
        int mid = (left + right) >> 1;

        //二分查找代码块
        while (left <= right){
            mid = (left + right) >> 1;

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
