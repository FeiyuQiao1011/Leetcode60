package JIANZHI_1;

import java.util.*;

/**
 * 和最小的k个数对
 * 维护一个最小堆，优先队列
 * 首先把nums[1]遍历放进去，带一个状态位记录nums2[idx]，可以减小时间复杂度
 * 不难。
 * @author 乔飞宇
 * @version 1.0
 */
public class _061_II {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        //有点儿归并
        while (p1 < nums1.length && p2 < nums2.length && k > 0){
            ArrayList<Integer> path = new ArrayList<>();
            if(nums1[p1] > nums2[p2]) {
                path.add(nums1[p1++]);
                path.add(nums2[p2]);
            } else {
                path.add(nums1[p1]);
                path.add(nums2[p2++]);
            }
            k--;
            res.add(path);
        }
        return res;
    }

    public List<List<Integer>> kSmallestPairs1(int[] nums1, int[] nums2, int k){
        ArrayList<List<Integer>> res = new ArrayList<>();

        if(nums1.length == 0 || nums2.length == 0 || k == 0){
            return res;
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0] + a[1]));

        for (int i = 0; i < nums1.length && i < k; i++) {
            queue.offer(new int[]{nums1[i], nums2[0], 0});
        }

        while (k > 0 && !queue.isEmpty()){
            int[] curr = queue.poll();
            int num1 = curr[0];
            int num2 = curr[1];
            int idx2 = curr[2];
            ArrayList<Integer> path = new ArrayList<>();
            path.add(num1);
            path.add(num2);
            res.add(new ArrayList<>(path));

            if(idx2 + 1 < nums2.length){
                queue.offer(new int[]{num1, nums2[idx2 + 1], idx2 + 1});
            }

            k--;
        }
        return res;
    }
}
