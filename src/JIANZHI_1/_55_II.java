package JIANZHI_1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _55_II {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }


    public int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
