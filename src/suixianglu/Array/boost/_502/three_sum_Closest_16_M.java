package suixianglu.Array.boost._502;

import java.util.Arrays;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class three_sum_Closest_16_M {
    public int threeSumClosest(int[] nums, int target) {
        //枚举加双指针
        int best = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) return sum;
                //判断
                if(Math.abs(best - target) >= Math.abs(sum - target)){
                    best = sum;
                }
                if(sum <= target){
                    int j0 = j + 1;
                    while (j0 < k && nums[j0] == nums[j]){
                        j0++;
                    }
                    j = j0;
                }

                if(sum > target){
                    int k0 = k - 1;
                    while (j < k0 && nums[k0] == nums[k]){
                        k0--;
                    }
                    k = k0;
                }
            }
        }
        return best;
    }
}
