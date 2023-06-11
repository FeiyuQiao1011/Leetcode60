package JIANZHI_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *  对称二叉树
 *  栈 + 队列？
 *  递归！！！
 *  特点：如果是对称二叉树
 *      那么，几种情况
 *          root == null
 *          每层最左边等于最右边
 *          左边的右节点等于右边的左节点
 * @author 乔飞宇
 * @version 1.0
 */
public class _28 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    public boolean recur(TreeNode L, TreeNode R){
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }
}
