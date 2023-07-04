package JIANZHI_1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _12_II {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(2 * sum + nums[i] == total){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
