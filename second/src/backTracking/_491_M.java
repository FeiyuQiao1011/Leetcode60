package backTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 递增子序列
 * @author 乔飞宇
 * @version 1.0
 */
public class _491_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backTrack(nums, 0);
        return res;
    }

    public void backTrack(int[] nums, int startIndex){
        /**
         * 这个return有点儿骗人
         */
        if(startIndex > nums.length) return;
        if(path.size() > 1){
            res.add(new ArrayList<>(path));
            /**
             * 这里不需要return
             * 直接递归到底
             * for循环总会结束的
             */
            //return;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++) {
            //或者不是递增
            //或者重复了
            if(!path.isEmpty() && path.get(path.size() - 1) > nums[i] || hashSet.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            hashSet.add(nums[i]);
            backTrack(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
