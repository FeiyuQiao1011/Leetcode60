package suixianglu.Array.boost._503;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *  求的是：合并区间
 *  解法：1.首先对数组进行排序，按照子数组的第一个元素从小到大---可以保证数组合并区间的时候连续
 *       2.因为不知道最后区间大小，所以不能直接new结果数组，需要一个ArrayList，最后toArray转化成数组
 *       3.首先把min置成首数组的首元素，最小的
 *       4.把max置成首数组的第二个元素，让他开始滚动，找到一个连续区间的最大值
 *       5.把找到的符合条件的数组加入ArrayList！
 *       6.为什么要i--？是个问题？
 *              为了结束的时候不超？
 *
 *
 * @author 乔飞宇
 * @version 1.0
 */
public class merge_Intervals_56_M {
    @Test
    public void test(){
        int[][] ints = new int[][] {{1,3}, {2, 6}, {8, 10}, {15, 18}};
        merge(ints);
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int len = intervals.length;
        LinkedList<int[]> ans = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            int min = intervals[i][0];
            int max = intervals[i][1];
            while (i < len && max >= intervals[i][0]){
                max = Math.max(intervals[i][1], max);
                i++;
            }
            i--;
            ans.add(new int[]{min, max});
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
