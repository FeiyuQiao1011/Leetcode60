package backTracking;

import java.util.*;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _47_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
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
            if(i > 0 && nums[i - 1] == nums[i] && used[i - 1] == false){
                continue;
            }
            /**
             * 真不理解这里为啥还要再加一个判断
             * 不加的话会出现[1, 1, 1]这种解
             */
            if (used[i] == false) {
                used[i] = true;
                path.add(nums[i]);
                backTrack(nums, used);
                path.removeLast();
                used[i] = false;
            }
        }
    }
}
