package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _90_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTrack(nums, 0);
        return res;
    }

    public void backTrack(int[] nums, int startIndex){
        res.add(new ArrayList<>(path));
        //返回条件
        if(startIndex >= nums.length){
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            /**
             * 关于去重的问题
             * 思考下如果元素重复了，在这里会有什么效果？
             * 当进行到i的时候，重复了，说明nums[i - 1] == nums[i]
             * 比如[1,2,2,3,4,4]
             * 为了保证不出现相同解，在树的每一层，都不能有相同元素，下一层可以的，不影响
             * used[i - 1]表示当前层的上一个元素有没有被用过
             * used[i - 1] == false 表示同一树层的nums[i - 1]被使用过
             * used[i - 1] == true 表示同一树枝的nums[i - 1]被使用过
             * 因为used数组只有去到树的下一层，才会被赋值为true
             */
            if(i > startIndex && nums[i - 1] == nums[i]){
                continue;
            }
            path.add(nums[i]);
            backTrack(nums, i + 1);
            path.removeLast();
        }
    }
}
