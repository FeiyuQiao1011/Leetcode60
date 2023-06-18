package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给两个数n / k
 * 求1-n中所有可能的k个数的组合
 *      组合问题：
 *          回溯三部曲：1. 回溯函数传参 && 返回值
 *                    2. 回溯函数终止条件
 *                    3. 单层遍历：
 *                          遍历
 *                          消除影响
 *      startIndex的作用，考虑树形图，看看需不需要去重
 *      优化：剪枝
 * @author 乔飞宇
 * @version 1.0
 */
public class _77_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrack(n, k, 1);
        return res;
    }

    public void backTrack(int n, int k, int startIndex){
        //返回条件
        if(path.size() == k){
            res.add(new ArrayList<>(path));
        }

        //单层搜索
        //可以剪枝优化
        /**
         * 已经遍历的元素：path.size()
         * 还需要添加的元素：k - path.size()
         * 列表中剩余的元素：(n - i) >= 所需要元素的个数（k - path.size())
         * 在集合中至多要从该起始位置：i <= n - (k - path.size()) + 1
         * 为什么要+1，举例子吧。
         */
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backTrack(n, k, i + 1);
            path.removeLast();
        }
    }
}
