package revision_and_boost_1_501515.Array.boost._503;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _4Sum_18_M {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        /**
         * 4数之和
         * 两数之和 ｜ 三数之和 ｜ 四数之和
         * 首先对数组进行排序
         * https://leetcode.cn/problems/4sum/solution/yi-miao-jiu-neng-gao-dong-de-duo-ge-qiu-ya50w/
         * 两数之和：
         * 哈希map——遍历，target - nums[i] 在不在哈希中
         * 双指针：两层遍历
         * ——————————————————————————
         * 三数之和：
         * 哈希map——遍历，确定i，j，target - nums[i] - nums[j] 在不在哈希map中
         * 三指针：确定i，移动j和k——j = i + 1； k = nums.length - 1
         * ——————————————————————————
         * 四数之和：
         * 四指针
         */
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            //去重
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }

                int l = j + 1;
                int r = nums.length - 1;
                while (l < r){
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[l] + (long) nums[r];
                    if(sum == target){
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[l], nums[r])));
                        while (l < r && nums[l] == nums[l + 1]){
                            l++;
                        }
                        while (l < r && nums[r] == nums[r - 1]){
                            r--;
                        }
                        l++;
                        r--;
                    }
                    else if(sum > target){
                        r--;
                    }else {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
