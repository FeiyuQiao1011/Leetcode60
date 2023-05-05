package Algorithm.backTrack._420;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class Combination_Sum_II_40_M {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        backTracking(candidates, target, 0, 0);
        return res;
    }

    public void backTracking(int[] candidates, int target, int sum, int Index){
        //结束条件
        if(sum == target){
            res.add(new ArrayList<>(list));
            return;
        } else if (sum > target) {
            return;
        }

        //单层遍历
        for (int i = Index; i < candidates.length; i++) {
            sum += candidates[i];
            list.add(candidates[i]);
            backTracking(candidates,target,sum,i);
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
