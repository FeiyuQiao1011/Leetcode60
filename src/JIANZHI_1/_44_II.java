package JIANZHI_1;

import java.util.*;

/**
 * 层序遍历，找到每层最大节点
 * @author 乔飞宇
 * @version 1.0
 */
public class _44_II {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max = Integer.MIN_VALUE;
        int count = queue.size();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            count--;
            max = Math.max(max, node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
            if(count == 0){
                count = queue.size();
                res.add(max);
                max = Integer.MIN_VALUE;
            }
        }
        return res;
    }
}
