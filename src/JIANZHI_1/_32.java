package JIANZHI_1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _32 {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        TreeNode curr = root;
        ArrayList<Integer> integers = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                integers.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        int[] res = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            res[i] = integers.get(i);
        }
        return res;
    }
}
