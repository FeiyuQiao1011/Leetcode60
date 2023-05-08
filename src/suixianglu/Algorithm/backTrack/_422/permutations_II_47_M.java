package suixianglu.Algorithm.backTrack._422;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class permutations_II_47_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(nums, used);
        return res;
    }

    public void backTrack(int[] nums, boolean[] used){
        //返回
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1] && used[i -1] == false){
                continue;
            }
            if(used[i] == false){
                used[i] = true;
                list.add(nums[i]);
                backTrack(nums,used);
                list.removeLast();
                used[i] = false;
            }
        }
    }
}
