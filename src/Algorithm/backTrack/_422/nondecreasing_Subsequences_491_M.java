package Algorithm.backTrack._422;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class nondecreasing_Subsequences_491_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
       backTrack(nums, 0);
       return res;
    }

    public void backTrack(int[] nums, int startIndex){
        if(list.size() > 1){
            res.add(new ArrayList<>(list));
        }
        int[] used = new int[201];
        for (int i = startIndex; i < nums.length; i++) {
            if(!list.isEmpty() && nums[i] < list.get(list.size() - 1) ||
                    (used[nums[i] + 100] == 1)){
                continue;
            }
            used[nums[i] + 100] = 1;
            list.add(nums[i]);
            backTrack(nums,i + 1);
            list.removeLast();
        }
    }
}
