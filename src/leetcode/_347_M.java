package leetcode;

import java.util.*;

/**
 * 前k个高频元素
 * 给一个nums数组，一个k
 * 求出前k个频次出现的数
 * map计数
 * @author 乔飞宇
 * @version 1.0
 */
public class _347_M {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashmap.containsKey(nums[i])){
                hashmap.put(nums[i], hashmap.get(nums[i]) + 1);
            }else {
                hashmap.put(nums[i], 1);
            }
        }

        /**
         * hashmap是无序数组，不支持根据value排序
         * 所以需要创建一个最小堆
         */

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(hashmap::get));

        for (Integer integer : hashmap.keySet()) {
            priorityQueue.offer(integer);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }

        //构建结果数组
        ArrayList<Integer> result = new ArrayList<>();
        while (!priorityQueue.isEmpty()){
            result.add(priorityQueue.poll());
        }
        Collections.reverse(result);

        //怎么把arraylist转化成数组！！！
        return Arrays.stream(result.toArray(new Integer[k])).mapToInt(Integer::intValue).toArray();
    }
}
