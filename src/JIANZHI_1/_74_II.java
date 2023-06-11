package JIANZHI_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 找出数组的重叠部分
 *      循环遍历：所有尾元素 > 头元素的都可以合并
 *      解：
 *          按照区间左端点排序---使可以合并的区间连续
 *
 *
 * @author 乔飞宇
 * @version 1.0
 */
public class _74_II {
    public int[][] merge(int[][] intervals) {
        //不能先new，没办法初始化
        //可能需要ArrayList
        //int[][] res = new int[][];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0] );
        ArrayList<int[]> res = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int min = intervals[i][0];
            int max = intervals[i][1];
            //如果后续可合并
            while (i < intervals.length && max >= intervals[i][0]){
                max = Math.max(max, intervals[i][1]);
                i++;
            }
            i--;
            res.add(new int[] {min, max});
        }
        return res.toArray(new int[res.size()][]);
    }
}
