package JIANZHI_1;

import java.util.LinkedList;
import java.util.List;

/**
 * 回溯法做
 * 组合问题 ｜｜ 子集问题
 * 什么是回溯算法？
 *      首先明确回溯效率并不高，因为回溯的本质是穷举
 *      回溯法解决的问题都可以抽象成树形结构，集合大小构成树的宽度
 *      递归三部曲：
 *          回溯函数模版返回值以及参数
 *          回溯函数终止条件
 *          回溯函数遍历过程
 * @author 乔飞宇
 * @version 1.0
 */
public class _34 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return res;
    }

    public void recur(TreeNode root, int tar){
        //返回条件
        if(root == null) return;
        list.add(root.val);
        tar -= root.val;
        if(tar == 0 && root.left == null && root.right == null){
            res.add(new LinkedList<>(list));
        }
        recur(root.left,tar);
        recur(root.right,tar);
        list.removeLast();
    }
}
