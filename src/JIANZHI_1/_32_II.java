package JIANZHI_1;

import java.util.*;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _32_II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for (int i = nodes.size(); i > 0; i--) {
                TreeNode temp = nodes.poll();
                list.add(temp.val);
                if(temp.left != null) nodes.add(temp.left);
                if(temp.right != null) nodes.add(temp.right);
            }
            res.add(list);
        }
        return res;
    }
}
