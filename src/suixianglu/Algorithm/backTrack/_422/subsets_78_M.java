package suixianglu.Algorithm.backTrack._422;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class subsets_78_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backTrack(nums, 0);
        return res;
    }

    public void backTrack(int[] nums, int startIndex){
        res.add(new ArrayList<>(list));
        if(startIndex >= nums.length){
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            list.add(nums[i]);
            backTrack(nums,i + 1);
            list.removeLast();
        }
    }
}
