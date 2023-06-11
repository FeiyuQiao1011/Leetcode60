package JIANZHI_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  数组中和为0的三元组
 *  三个数是数组中下标不重复的数
 *  1.排序
 *  2.循环遍历数组
 *      a.去重，如果num[i] == num[i - 1] 跳过
 *      b.定义左右指针，left = i + 1; right = num.length - 1;
 *      c.while(left < right)
 *          total == 0 加到结果
 *              left++;
 *              right--;
 *              去重;
 *          total > 0 right--;
 *          total < 0 left++;
 * @author 乔飞宇
 * @version 1.0
 */
public class _007_II {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        //数组排序
        Arrays.sort(nums);

        //循环
        for (int i = 0; i < nums.length - 2; i++) {
            //去重？
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int total = nums[i] + nums[right] + nums[left];

                if(total == 0){
                    res.add(Arrays.asList(nums[i],nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[right] == nums[right + 1]) right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                } else if (total < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return res;
    }
}
