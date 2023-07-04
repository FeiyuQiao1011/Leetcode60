package JIANZHI_1;

/**
 * 排序数组中只出现一次的数字
 * 找目标值，想到二分
 * @author 乔飞宇
 * @version 1.0
 */
public class _70_II {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length, l = 0, r = nums.length - 1;
        int ans = -1;
        while (l <= r){
            int mid = (l + r) / 2;
            if(mid < n - 1 && nums[mid] == nums[mid + 1]){
                if(mid % 2 == 0){
                    l = mid + 2;
                }else {
                    r = mid - 1;
                }
            } else if (mid > 0 && nums[mid] == nums[mid - 1]) {
                if(mid % 2 == 0){
                    r = mid - 2;
                }else {
                    l = mid + 1;
                }
            }else {
                ans = nums[mid];
                break;
            }
        }
        return ans;
    }
}
