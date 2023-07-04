package JIANZHI_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _84_II {
    boolean[] used;
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(nums, 0, used);
        return res;
    }

    public void backTrack(int[] nums, int startIndex, boolean[] used){
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backTrack(nums, i + 1, used);
            used[i] = false;
            path.removeLast();
        }
    }
}
