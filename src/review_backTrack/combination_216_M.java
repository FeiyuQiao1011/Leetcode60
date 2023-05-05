package review_backTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */

//k个数，和为n
public class combination_216_M {
    ArrayList<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k,n,1,0);
        return res;
    }

    public void backTrack(int k, int n, int startIndex,int sum){
        if(list.size() == k){
            if (sum == n) {
                res.add(new ArrayList<>(list));
                return;
            }else if(sum > n){
                return;
            }
        }

        for (int i = startIndex; i <= 9; i++){
            sum += i;
            list.add(i);
            backTrack(k,n,startIndex + 1,sum);
            list.removeLast();
            sum -= i;
        }
    }
}
