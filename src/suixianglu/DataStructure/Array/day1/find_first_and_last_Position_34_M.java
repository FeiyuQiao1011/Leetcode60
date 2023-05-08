package suixianglu.DataStructure.Array.day1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class find_first_and_last_Position_34_M {
    public int[] searchRange(int[] nums, int target){
        //主体
        int leftBorder = getleftBorder(nums, target);
        int rightBorder = getrightBorder(nums, target);

        //判断
        //情况一
        if(leftBorder == -2 || rightBorder == -2) return new int[]{-1, -1};

        //情况二
        if(rightBorder - leftBorder > 1) return new int[]{leftBorder + 1, rightBorder - 1};

        //情况三
        return new int[]{-1, -1};
    }

    public int getleftBorder(int[] nums, int target){
        //记录没被赋值的情况
        int leftBorder = -2;

        //左右边界
        int left = 0, right = nums.length - 1;

        //mid
        int mid = (left + right) >> 1;

        while (left <= right){

            mid = (left + right) >> 1;

            if(nums[mid] >= target){
                right = mid - 1;
                leftBorder = right;
            }else {
                left = mid + 1;
            }
        }
        return leftBorder;
    }

    public int getrightBorder(int[] nums, int target){
        //记录没被赋值的情况
        int rightBorder = -2;

        //左右边界
        int left = 0, right = nums.length - 1;

        //mid
        int mid = (left + right) >> 1;

        while (left <= right){
            mid = (left + right) >> 1;

            if(nums[mid] <= target){
                left = mid + 1;
                rightBorder = left;
            }else {
                right = mid - 1;
            }
        }
        return rightBorder;
    }
}
