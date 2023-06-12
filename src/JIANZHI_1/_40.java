package JIANZHI_1;

import java.util.Arrays;

/**
 * 最小的k个数
 * @author 乔飞宇
 * @version 1.0
 */
public class _40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
