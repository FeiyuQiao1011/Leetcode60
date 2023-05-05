package Algorithm.greedy._423;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class wiggle_Subsequence_376_M {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int preDiff = 0;
        int curDiff = 0;
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            curDiff = nums[i + 1] - nums[i];
            if((preDiff <= 0 && curDiff >0) || (preDiff >= 0 && curDiff < 0)){
                result++;
            }
            preDiff = curDiff;
        }
        return result;
    }
}
