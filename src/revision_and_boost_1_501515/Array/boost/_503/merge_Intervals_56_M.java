package revision_and_boost_1_501515.Array.boost._503;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class merge_Intervals_56_M {
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
