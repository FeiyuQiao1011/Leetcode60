package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _21 {
    public int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int k = 0, j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1) res[k++] = nums[i];
            else res[j--] = nums[i];
        }
        return res;
    }
}
