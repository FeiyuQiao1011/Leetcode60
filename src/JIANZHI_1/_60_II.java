package JIANZHI_1;

import java.util.*;

/**
 * 出现频率最高的前k个数字
 * @author 乔飞宇
 * @version 1.0
 */
public class _60_II {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])){
                hashMap.replace(nums[i], hashMap.get(nums[i]) + 1);
            }else {
                hashMap.put(nums[i], 1);
            }
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(hashMap::get));
        for (int num : hashMap.keySet()){
            priorityQueue.offer(num);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!priorityQueue.isEmpty()){
            list.add(priorityQueue.poll());
        }
        Collections.reverse(list);
        int[] res = list.stream().mapToInt(Integer :: intValue).toArray();
        return res;
    }
}
