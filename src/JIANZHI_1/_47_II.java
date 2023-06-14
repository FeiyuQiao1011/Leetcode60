package JIANZHI_1;

/**
 * 二叉树剪枝
 *
 * @author 乔飞宇
 * @version 1.0
 */
public class _47_II {
    public TreeNode pruneTree(TreeNode root) {
        //递归返回条件
        if(root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val == 0){
            return null;
        }
        return root;
    }
}
