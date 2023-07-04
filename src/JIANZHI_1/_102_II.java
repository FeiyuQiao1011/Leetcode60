package JIANZHI_1;

/**
 * dp
 * 
 * @author 乔飞宇
 * @version 1.0
 */
public class _102_II {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backTrack(nums, target, 0, 0);
        return count;
    }
    
    public void backTrack(int[] nums, int target, int sum, int startIndex){
        if (startIndex == nums.length) {
            if(target == sum){
                count++;
            }
        }else {
            backTrack(nums, target, sum + nums[startIndex], startIndex + 1);
            backTrack(nums, target, sum - nums[startIndex], startIndex + 1);
        }
    }
}
