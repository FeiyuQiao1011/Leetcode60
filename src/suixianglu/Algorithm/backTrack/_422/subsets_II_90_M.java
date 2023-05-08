package suixianglu.Algorithm.backTrack._422;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class subsets_II_90_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //ArrayList<Boolean> used = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        for (boolean q : used){
            q = false;
        }
        Arrays.sort(nums);
        backTrack(nums,0,used);
        return res;
    }

    public void backTrack(int[] nums, int startIndex, boolean[] used){
        //每次遍历结果都加进res中
        res.add(new ArrayList<>(list));

        //结束循环
        if(startIndex >= nums.length){
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            //用过
            if(i > 0 && nums[i] == nums[i - 1]  && used[i - 1] == false){
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            backTrack(nums,i + 1, used);
            used[i] = false;
            list.removeLast();
        }
    }
}
