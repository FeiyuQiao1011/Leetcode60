package DataStructure.Tree.day15_4yue5;

import DataStructure.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class find_bottom_left_tree_Value_513_M {
    public int findBottomLeftValue(TreeNode root) {
        int result = 0;
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null){
            return 0;
        }

        que.offer(root);
        while (!que.isEmpty()){
            int levelSize = que.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode tempNode = que.poll();
                if (levelSize == 0) {
                    result = tempNode.val;
                }
                if (tempNode.left != null) {
                    que.offer(tempNode.left);
                }
                if (tempNode.right != null) {
                    que.offer(tempNode.right);
                }
            }
        }
        return result;
    }
}
