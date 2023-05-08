package suixianglu.DataStructure.Array.day1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class remove_duplicates_from_sorted_array_E_26 {
    public int removeDuplicates(int[] nums) {
        //双指针法
        //有序数组，若存在重复，则必然相邻
        //q先走
        int p = 0, q = 1;

        while (q < nums.length){
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
