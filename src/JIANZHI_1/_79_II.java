package JIANZHI_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 所有子集
 * 给一个数组，元素互不相同，返回所有可能的子集，不包含重复
 * @author 乔飞宇
 * @version 1.0
 */
public class _79_II {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(nums, 0);
        return res;
    }

    public void backTrack(int[] nums, int startIndex){
        res.add(new ArrayList<>(path));
        if(path.size() == nums.length) return;
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backTrack(nums, i + 1);
            path.removeLast();
        }
    }
}
