package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _53 {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
