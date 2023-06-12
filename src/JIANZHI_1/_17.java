package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _17 {
    public int[] printNumbers(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k *= 10;
        }
        int[] res = new int[k];
        for (int i = 1; i <= k - 1; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}
