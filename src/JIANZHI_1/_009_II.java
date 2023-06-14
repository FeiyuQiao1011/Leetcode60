package JIANZHI_1;

/**
 * 数组内乘积 < k 的 连续 子数组
 * 滑动窗口
 *      首先：移动j，使得左右边界窗口里的数乘积大于k
 *      第二：移动左边界，直到不符合条件了
 *      第三：记录下j - i + 1, 相当于是算一下在这个窗口内符合条件的
 *      字集有几个。
 * @author 乔飞宇
 * @version 1.0
 */
public class _009_II {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, res = 0;
        int i = 0, prod = 1;
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k){
                prod /= nums[i];
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
}
