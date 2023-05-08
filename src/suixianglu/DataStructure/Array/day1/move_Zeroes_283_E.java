package suixianglu.DataStructure.Array.day1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class move_Zeroes_283_E {
    public void moveZeroes(int[] nums) {
        int p = 0, q = 0;
        int n = nums.length - 1;
        while(q < nums.length){
            if(nums[q] != 0){
                nums[p++] = nums[q++];
            }else {
                nums[n--] = 0;
                q++;
            }
        }
    }
}
