package JIANZHI_1;

import java.util.Collections;
import java.util.List;

/**
 * 最小的时间差？
 * 考虑的点：如何能让list中的数都算一遍？
 * 怎么和什么时候把字符串转化成数组，需要注意什么？怎么转化？
 * 解：
 *      首先找最小差值，想到排序后最小差值一定是相邻元素
 *      1.排序 --- 注意，不需要转化成数组，Collection接口有sort方法可以直接排序
 *      2.拿到第一个时间，也就是最早时间，把这个当成第一个preMinutes
 *      3.循环遍历，用当前时间 - 每一个preMinutes，更新最小值
 *      4.需要注意一点，一共24 * 60 = 1440种情况，如果大于1440，一定有两个时间点是相同的，此时返回0。
 * @author 乔飞宇
 * @version 1.0
 */
public class _35_II {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int ans = Integer.MAX_VALUE;
        int t0Minutes = getMinutes(timePoints.get(0));
        int preMinutes = t0Minutes;
        for (int i = 1; i < timePoints.size(); i++) {
            int minutes = getMinutes(timePoints.get(i));
            ans = Math.min(ans, minutes - preMinutes);
            preMinutes = minutes;
        }
        ans = Math.min(ans, t0Minutes + 1440 - preMinutes);
        return ans;
    }

    public int getMinutes(String t) {
        return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
    }
}
