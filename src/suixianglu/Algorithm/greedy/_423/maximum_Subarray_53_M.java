package suixianglu.Algorithm.greedy._423;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class maximum_Subarray_53_M {

    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int count = 0;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            sum = Math.max(sum,count);
            if(count <= 0){
                count = 0;
            }
        }
        return sum;
    }
}
