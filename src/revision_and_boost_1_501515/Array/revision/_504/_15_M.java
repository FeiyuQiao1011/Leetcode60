package revision_and_boost_1_501515.Array.revision._504;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _15_M {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
         * 数组排序 + 双指针
         */
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (sum > 0) {
                    r--;
                }else {
                    l++;
                }
            }
        }
        return res;
    }
}
