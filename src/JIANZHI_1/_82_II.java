package JIANZHI_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 找出candidates中所有和为target的组合
 * 回溯
 * @author 乔飞宇
 * @version 1.0
 */
public class _82_II {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] used = new boolean[candidates.length];
        for (boolean b : used) {
            b = false;
        }
        Arrays.sort(candidates);
        backTrack(candidates, target, 0, 0, used);
        return res;
    }

    public void backTrack(int[] candidates, int target, int sum, int startIndex, boolean[] used){
        //返回条件
        if(sum == target){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
            if(i > 0 && candidates[i] == candidates[i - 1] && used[i - 1] == false){
                continue;
            }
            used[i] = true;
            sum += candidates[i];
            list.add(candidates[i]);
            backTrack(candidates, target, sum, i + 1, used);
            used[i] = false;
            sum -= candidates[i];
            list.removeLast();
        }
    }
}
