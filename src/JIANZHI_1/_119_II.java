package JIANZHI_1;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 最长连续子序列
 * 双指针做
 * 右移过程中，nums[right - 1] == nums[right], right++;
 * @author 乔飞宇
 * @version 1.0
 */
public class _119_II {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int maxLength = 0;
        for (int num : nums) {
            hashSet.add(num);
        }

        for (int num : nums) {
            if(!hashSet.contains(num - 1)){
                int currentNum = num;
                while (hashSet.contains(num)){
                    currentNum += 1;
                }

                maxLength = Math.max(maxLength,currentNum - num);
            }
        }
        return maxLength;
    }

    public int longestConsecutive1(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
            return 1;
        }
        int maxLength = 0;
        int left = 0;
        int right = 1;

        while (right < nums.length){
            if(nums[right] == nums[right - 1] || nums[right - 1] != nums[right] - 1){
                left = right;
            }

            maxLength = Math.max(maxLength, right -left + 1);
            right++;
        }
        return maxLength;
    }
}
