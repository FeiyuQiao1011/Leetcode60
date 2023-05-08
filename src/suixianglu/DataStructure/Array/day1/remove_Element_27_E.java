package suixianglu.DataStructure.Array.day1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class remove_Element_27_E {
    public int removeElement(int[] nums, int val) {
        //快慢指针
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if(nums[fastIndex] != val){
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }
}
