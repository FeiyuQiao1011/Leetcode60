package revision_and_boost_1_501515.Array.revision._504;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _1480_E {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ints[i] = sum;
        }
        return ints;
    }
}
