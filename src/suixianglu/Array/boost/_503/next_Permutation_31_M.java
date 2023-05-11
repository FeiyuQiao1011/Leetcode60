package suixianglu.Array.boost._503;

import org.junit.jupiter.api.Test;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class next_Permutation_31_M {
    @Test
    public void test(){
        int[] nums = {3, 2, 1};
        nextPermutation(nums);
        for(int num : nums){
            System.out.println(num);
        }
    }
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        for (i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]){
                for (int j = nums.length - 1; j >= 0; j--) {
                    if(nums[i] < nums[j]){
                        swap(nums,i,j);
                        break;
                    }
                }
                break;
            }
        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int[] nums, int i){
        int left = i, right = nums.length - 1;
        while (left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
