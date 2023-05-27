package JIANZHI_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 滑动窗口
 * @author 乔飞宇
 * @version 1.0
 */
public class _57 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int i = 1, j = 2, s = 3;
        while (i < j){
            if(s == target){
                int[] ans = new int[j - i + 1];
                for (int k = i; k < j + 1; k++) {
                    ans[k - i] = k;
                }
                res.add(ans);
            }

            if(s >= target){
                s -= i;
                i++;
            }else {
                j++;
                s += j;
            }
        }
        return res.toArray(new int[0][]);
    }
}
