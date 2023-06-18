package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 * @author 乔飞宇
 * @version 1.0
 */
public class _46_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backTrack(nums, used);
        return res;
    }

    public void backTrack(int[] nums, boolean[] used){
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i] == true) continue;
            used[i] = true;
            path.add(nums[i]);
            backTrack(nums, used);
            path.removeLast();
            used[i] = false;
        }
    }
}
