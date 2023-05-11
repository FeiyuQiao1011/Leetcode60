package suixianglu.Array.boost._504;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class jianzhi_LCOF_42_E {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            res = Math.max(sum, res);
        }
        return res;
    }
}
