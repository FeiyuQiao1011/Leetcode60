package DataStructure.Array._424;/**
    * @author 乔飞宇
    * @version 1.0
    */
public class binary_Search_704_E {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + ((right - left) >> 2);
            if(nums[mid] > target) right = mid - 1;
            if(nums[mid] < target) left = mid + 1;
            if(nums[mid] == target) return  mid;
        }
        return -1;
    }
}
