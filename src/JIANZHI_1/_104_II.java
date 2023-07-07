package JIANZHI_1;

import java.util.LinkedList;

/**
 * 排列的所有组合，和为target
 * @author 乔飞宇
 * @version 1.0
 */
public class _104_II {
    //LinkedList<Integer> path = new LinkedList<>();
    public int combinationSum4(int[] nums, int target) {
        return backTrack(nums, target);
    }

    public int backTrack(int[] nums, int target){
        int res = 0;
        if(target == 0){
            return 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(target >= nums[i]){
                res += backTrack(nums, target - nums[i]);
            }
        }
        return res;
    }
}
