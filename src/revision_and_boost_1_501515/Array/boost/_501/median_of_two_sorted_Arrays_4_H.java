package revision_and_boost_1_501515.Array.boost._501;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class median_of_two_sorted_Arrays_4_H {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /**
         * 返回两个有序数组合并后的中位数
         * 双指针？同时遍历两个数组
         * 归并？
         * 100多道题后开始考虑时间复杂度和空间复杂度了
         */
        int m = nums1.length;
        int n = nums2.length;
        int a = 0;
        int b = 0;
        int[] res = new int[m + n];
        int i = 0;
            while (i < m + n) {
                if (a < nums1.length && b < nums2.length) {
                    if (nums1[i] <= nums2[i]) {
                        res[i++] = nums1[a++];
                    } else {
                        res[i++] = nums2[b++];
                    }
                } else {
                    if (a == nums1.length) res[i++] = nums2[b++];
                    if (b == nums2.length) res[i++] = nums1[a++];
                }
            }

        if(res.length % 2 == 0) return (float)((res[res.length / 2] + res[res.length / 2 - 1]) / 2);
        else return res[res.length / 2];
        }
    }
