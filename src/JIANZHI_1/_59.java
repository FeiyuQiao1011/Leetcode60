package JIANZHI_1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[0];
        //队列
        Deque<Integer> dequeue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];

        for (int j = 0, i = 1 - k; j < nums.length;i++, j++) {
            //删除nums[i - 1]
            if(i > 0 && dequeue.peekFirst() == nums[i - 1]){
                dequeue.removeFirst();
            }

            //保持dequeue递减
            while (!dequeue.isEmpty() && dequeue.peekLast() < nums[j]){
                dequeue.removeLast();
            }
            dequeue.addLast(nums[j]);
            if(i >= 0){
                res[i] = dequeue.peekFirst();
            }
        }
        return res;
    }
}
