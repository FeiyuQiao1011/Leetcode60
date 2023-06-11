package JIANZHI_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历
 *      有个问题：要求奇数行从左到右，偶数行从右到左
 * @author 乔飞宇
 * @version 1.0
 */
public class _32_III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //放结果
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        //用队列存储节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            //新建一个list存放每层的结果
            LinkedList<Integer> list = new LinkedList<>();
            int levelSize = queue.size();

            for (int i = levelSize; i > 0; i--) {
                TreeNode node = queue.poll();

                if (res.size() % 2 == 0) {
                    list.addLast(node.val);
                }else {
                    list.addFirst(node.val);
                }

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
