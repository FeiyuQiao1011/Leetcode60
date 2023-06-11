package JIANZHI_1;

/**
 * 数组递增排序
 * 找和为target的两个值
 * @author 乔飞宇
 * @version 1.0
 */
public class _57_II {
    public int[] twoSum(int[] nums, int target) {
        int i= 0, j = nums.length - 1;
        while (i < j){
            if(nums[i] + nums[j] < target){
                i++;
            }else if(nums[i] + nums[j] > target){
                j--;
            }else {
                return new int[] {nums[i], nums[j]};
            }
        }
        return new int[0];
    }
}
