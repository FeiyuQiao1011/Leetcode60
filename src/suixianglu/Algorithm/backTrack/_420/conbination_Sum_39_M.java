package suixianglu.Algorithm.backTrack._420;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class conbination_Sum_39_M {

    List<List<Integer>> res = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates,target,0,0);
        return res;
    }

    public void backTrack(int[] candidates, int target, int sum, int index){
        if(sum > target){
            return;
        } else if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            sum += candidates[i];
            list.add(candidates[i]);
            backTrack(candidates,target,sum,i);
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
