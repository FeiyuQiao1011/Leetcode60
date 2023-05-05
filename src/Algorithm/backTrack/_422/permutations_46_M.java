package Algorithm.backTrack._422;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class permutations_46_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backTrack(nums,used);
        return res;
    }

    public void backTrack(int[] nums, boolean[] used){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i] == true){
                continue;
            }

            used[i] = true;
            list.add(nums[i]);
            backTrack(nums,used);
            list.removeLast();
            used[i] = false;
        }
    }
}
