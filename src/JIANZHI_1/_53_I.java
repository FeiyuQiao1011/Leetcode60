package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _53_I {
    public int search(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            if(num == target){
                sum++;
            }
        }
        return sum;
    }
}
