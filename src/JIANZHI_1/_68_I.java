package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _68_I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        } else if (left != null) {
            return left;
        }else {
            return right;
        }
    }
}
