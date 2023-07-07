package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
