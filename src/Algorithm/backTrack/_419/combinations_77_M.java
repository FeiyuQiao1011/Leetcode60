package Algorithm.backTrack._419;

import org.jetbrains.annotations.TestOnly;
import org.junit.jupiter.api.Test;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class combinations_77_M {

    //@Test
    public void test(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("n = ");
        int i = scanner.nextInt();
        //System.out.println("k = ");
        int i1 = scanner.nextInt();

        List<List<Integer>> combine = combine(i, i1);
        System.out.println(combine);
    }
    /**
     * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
     * You may return the answer in any order.
     * 链接：https://leetcode.cn/problems/combinations
     * Input: n = 4, k = 2
     * Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
     * Explanation: There are 4 choose 2 = 6 total combinations.
     * Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
     */
    //存放结果集
    List<List<Integer>> lists = new ArrayList<>();
    //存放每次组合结果
    LinkedList<Integer> list = new LinkedList<>();
    //控制开始回溯的下标
    //int startIndex = 0;

    public List<List<Integer>> combine(int n, int k) {
        //回溯函数
        backTracking(n, k, 1);

        //返回值
        return lists;
    }

    public void backTracking(int n, int k, int startIndex){

        //终止条件
        if(list.size() == k){
            lists.add(new ArrayList<>(list));
            return;
        }

        //横向遍历——for循环
        for (int i = startIndex; i < n; i++) {
            list.add(i);
            backTracking(n,k,i + 1);
            list.remove(i);
        }
    }
}
