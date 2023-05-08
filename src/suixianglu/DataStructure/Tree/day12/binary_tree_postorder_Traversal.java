package suixianglu.DataStructure.Tree.day12;

import suixianglu.DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class binary_tree_postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    public void postorder(TreeNode root, ArrayList<Integer> result){
        if(root == null){
            return;
        }
        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.val);
    }
}
