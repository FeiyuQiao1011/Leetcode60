package leetcode;

import java.util.Arrays;

/**
 * 把数组的数重新排列，找到最大值
 * 由于这个数可能很大，转换成字符串
 * 1. 把数组转换成字符串
 * 2. 自定义排序，传递下去，比较数组中的大小然后排序
 * 3. 把排好序的数组拼接到一起
 * @author 乔飞宇
 * @version 1.0
 */
public class _179_M {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        //数组转换成字符串
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (strs[0].equals("0")) {
            return "0";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
