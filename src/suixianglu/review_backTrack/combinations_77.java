package suixianglu.review_backTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class combinations_77 {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrack(n,k,0);
        return res;
    }

    public void backTrack(int n, int k, int startIndex){
        //返回条件
        if(list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }

        //单层
        for (int i = startIndex; i < n; i++) {
            list.add(i);
            backTrack(n,k,i + 1);
            list.removeLast();
        }
    }
}
