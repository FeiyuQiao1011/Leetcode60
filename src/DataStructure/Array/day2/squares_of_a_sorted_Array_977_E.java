package DataStructure.Array.day2;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class squares_of_a_sorted_Array_977_E {
    public int[] sortedSquares(int[] nums){
        //双指针法
        int i = 0, j = nums.length - 1, k = nums.length - 1;
        int[] result = new int[nums.length];

        //
        while (i <= j){
            if(nums[i] * nums[i] > nums[j] * nums[j]){
                result[k--] = nums[i] * nums[i];
                i++;
            }else {
                result[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}
