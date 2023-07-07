package JIANZHI_1;

/**
 * 找二叉树任意节点的中序后继
 * 中序后继：按照中序遍历，值比当前节点大的下一个最大节点
 * 二叉搜索树，左边子树都小于该节点得值
 *
 * @author 乔飞宇
 * @version 1.0
 */
public class _53_II {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(p.right != null){
            //case1: p has a right subTree
            /**
             * 有右子树
             *
             */
            TreeNode curr = p.right;
            while (curr.left != null){
                curr = curr.left;
            }
            return curr;
        }else {
            //case2: p doesn't have a right subTree
            TreeNode successor = null;
            TreeNode curr = root;
            while (curr != null){
                if(p.val < curr.val){
                    successor = curr;
                    curr = curr.left;
                } else if (p.val > curr.val) {
                    curr = curr.right;
                }else {
                    break;
                }
            }
            return successor;
        }
    }
}
