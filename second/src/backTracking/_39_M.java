package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 找出在集合candidates中所有和为target的集合的组合
 * 当前元素可以重复，就代表一个元素可以重复利用多次
 * @author 乔飞宇
 * @version 1.0
 */
public class _39_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    /**
     * 回溯框架，名称，返回值
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates, target, 0);
        return res;
    }

    /**
     * 回溯函数
     *      返回条件：target == 0
     *      单层循环：需要注意，如果当前元素可以重复使用，就可以在进入下次循环时不用i + 1，
     *      代表当前元素可以被重复读取
     * @param candidates
     * @param target
     * @param startIndex
     */
    public void backTrack(int[] candidates, int target, int startIndex){
        //返回条件
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if(target < 0) break;
            //一定先把元素添加到列表，最后再移出列表，之后在进行其他操作
            list.add(candidates[i]);
            target -= candidates[i];
            backTrack(candidates, target, i);
            target += candidates[i];
            list.removeLast();
        }
    }
}
