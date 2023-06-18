package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 找出candidates中不重复的和为target的所有集合
 * 数值可以重复，数不是同一个，代码随想录有点儿模糊
 * @author 乔飞宇
 * @version 1.0
 */
public class _40_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] used = new boolean[candidates.length];
        for (boolean b : used) {
            b = false;
        }
        Arrays.sort(candidates);
        backTrack(candidates, target, used, 0);
        return res;
    }

    public void backTrack(int[] candidates, int target, boolean[] used, int startIndex){
        //返回条件
        if(target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if(target < 0) break;
            /**
             * 这里需要进行去重判断
             * 经过sort的数组，重复元素一定相邻
             * 维护一个used数组，用来去重
             */
            if(i > 0 && candidates[i - 1] == candidates[i] && used[i - 1] == false){
                continue;
            }
            path.add(candidates[i]);
            used[i] = true;
            target -= candidates[i];
            /**
             * 注意这里的i + 1
             * 表示该元素不会被重复读取，下次会选取下一个元素
             * 符合题意
             */
            backTrack(candidates, target, used, i + 1);
            target += candidates[i];
            used[i] = false;
            path.removeLast();
        }
    }
}
