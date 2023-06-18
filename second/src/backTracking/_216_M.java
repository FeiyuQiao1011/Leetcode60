package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 找到所有相加之和为n的k个数的组合
 * k可以表示深度
 * 1-9可以表示广度
 * @author 乔飞宇
 * @version 1.0
 */
public class _216_M {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        boolean[] used = new boolean[k];
        backTrack(k, n, 0, 1);
        return res;
    }

    public void backTrack(int k, int n, int sum, int startIndex){
        if(sum == n){
            res.add(new ArrayList<>(path));
            return;
        }

        //剪枝操作
        /**
         * 如果遍历时发现元素集合都大于k了，直接不用继续遍历了
         * 也就是 path.size() <= k
         * 每次还需要的元素：k - path.size()
         * 下次遍历：i <= 9 - (k - path.size()) + 1
         */
        for (int i = startIndex; i <= 9 && k >= 0; i++) {
            if(sum == n && k == 0){
                res.add(new ArrayList<>(path));
                return;
            }
            path.add(i);
            sum += i;
            k++;
            backTrack(k, n, sum, i + 1);
            k--;
            sum -= i;
            path.removeLast();
        }
    }
}
