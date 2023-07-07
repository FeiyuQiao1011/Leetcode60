package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _90_II {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int n = nums.length;

        return Math.max(robSum(nums, 0, n - 2), robSum(nums, 1, n - 1));
    }

    public int robSum(int[] nums, int start, int end){
        int first = nums[start];
        int second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
