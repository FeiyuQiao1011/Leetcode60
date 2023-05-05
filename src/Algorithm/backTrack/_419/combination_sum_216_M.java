package Algorithm.backTrack._419;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class combination_sum_216_M {

    ArrayList<List<Integer>> lists = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        backTrack(k, n, 1);
        return lists;
    }

    public void backTrack(int k, int n, int startIndex){

        int sum = 0;

        if (list.size() == k) {
            if(sum == n){
                lists.add(list);
            }
            return;
        }

        for (int i = startIndex; i <= 9; i++) {
            list.add(i);
            sum += i;
            backTrack(k,n,i + 1);
            sum -= i;
            list.remove(i);
        }
    }
}
