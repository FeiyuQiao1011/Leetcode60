package suixianglu.DataStructure.Tree.day15_4yue5;

import suixianglu.DataStructure.Tree.TreeNode;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class balanced_binary_Tree_110_E {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode node){
        //边角料
        if(node == null){
            return -1;
        }

        int leftHeight = getHeight(node.left);
        if(leftHeight == -1) return -1;

        int rightHeight = getHeight(node.right);
        if(rightHeight == -1) return -1;

        int result;
        if(Math.abs(leftHeight - rightHeight) > 1){
            result = -1;
        }else {
            result = 1 + Math.max(leftHeight, rightHeight);
        }

        return result;
    }
}
