package leetcode;

import JIANZHI_1.TreeNode;

/**
 * 二叉树最近的公共祖先
 * 首先他是二叉树
 * 特点就是左子树都小于根结点，右子树都大于根结点
 * 递归做
 * @author 乔飞宇
 * @version 1.0
 */
public class _236_M {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 根结点为null或者p或q与根结点相等，则返回根结点
        if(root == null || root == p || root == q){
            return root;
        }

        //递归查找左右子树
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //如果左子树不为空，右子树也不为空，说明p，q分别位于当前节点的左右子树上
        if(left != null && right != null){
            return root;
        }

        //如果左子树返回的结果是空，说明p、q都不在左子树上
        if (left == null){
            return right;
        }

        //如果右子树的返回结果是空，说明p、q都不在右子树上
        if(right == null){
            return left;
        }

        return null;
    }
}
