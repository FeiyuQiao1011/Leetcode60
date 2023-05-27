package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _51 {
    int[] temp, nums;
    public int reversePairs(int[] nums) {
        this.nums = nums;
        temp = new int[nums.length];
        return mergeSort(0, nums.length - 1);
    }

    public int mergeSort(int l, int r){
        if(l >= r) return 0;
        int m = (l + r) >> 1;
        int res = mergeSort(l, m) + mergeSort(m + 1, r);

        //合并
        int i = l, j = m + 1;
        for (int k = l; k <= r; k++) {
            temp[k] = nums[k];
        }
        for (int k = l; k <= r; k++) {
            if(i == m + 1) nums[k] = temp[j++];
        }
        return 1;
    }
}
