package DataStructure.Tree.day12;

import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class binary_tree_inorder_Traversal_94_E {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public void inorder(TreeNode root, ArrayList<Integer> result){
        if(root == null){
            return;
        }

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right,result);
    }

    public List<Integer> inorderTraversal_(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }
}
