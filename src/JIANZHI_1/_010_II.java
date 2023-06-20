package JIANZHI_1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 和为k的连续子数组
 * 回溯不行
 * @author 乔飞宇
 * @version 1.0
 */
public class _010_II {
    @Test
    public void test() {
        int[] ints = {-1, -1, 1};
        subarraySum(ints, 0);
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int left = 0; left < nums.length ; left++) {
            int sum = 0;
            for (int right = left; right < nums.length; right++){
                sum += nums[right];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
