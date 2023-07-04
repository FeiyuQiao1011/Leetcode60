package JIANZHI_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _81_II {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates, target, 0);
        return res;
    }

    public void backTrack(int[] candidates, int target, int startIndex){
        if(target == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length && candidates[i] <= target; i++) {
            path.add(candidates[i]);
            target -= candidates[i];
            backTrack(candidates, target, i);
            target += candidates[i];
            path.removeLast();
        }
    }
}
