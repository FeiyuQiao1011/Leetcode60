package JIANZHI_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * 一个数组nums，一个k，下标的相对位置要在k之内
 * 一个t，数值的差值要在t之内
 * 优先队列？滑动窗口？双指针？
 * 滑动窗口做一下。
 * @author 乔飞宇
 * @version 1.0
 */
public class _057_II {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Integer[] sortedNum = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedNum[i] = i;
        }
        Arrays.sort(sortedNum, Comparator.comparingInt(a -> nums[a]));
        int slow = 0, fast = 1;
        while (fast < nums.length){
            int abs = Math.abs(nums[fast] - nums[slow]);
            if(abs <= t){
                return true;
            }

            if(fast - slow >= k){
                slow++;
            }else {
                fast++;
            }
        }
        return false;
    }
}
