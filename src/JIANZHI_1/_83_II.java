package JIANZHI_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _83_II {
    boolean used[];
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
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
            if(used[i]) continue;
            path.add(nums[i]);
            used[i] = true;
            backTrack(nums, used);
            path.removeLast();
            used[i] = false;
        }
    }
}
