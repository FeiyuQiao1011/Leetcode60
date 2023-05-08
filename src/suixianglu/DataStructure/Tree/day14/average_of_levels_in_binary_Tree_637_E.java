package suixianglu.DataStructure.Tree.day14;

import suixianglu.DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class average_of_levels_in_binary_Tree_637_E {
    public List<Double> averageOfLevels(TreeNode root) {

        //放结果
        List<Double> lists = new ArrayList<>();
        //队列
        Queue<TreeNode> que = new LinkedList<>();

        //边角料
        if(root == null){
            return lists;
        }

        que.offer(root);

        while (!que.isEmpty()){
            double sum = 0.0;
            int len = que.size();
            while (len > 0){
                TreeNode poll = que.poll();

                sum += poll.val;

                if(poll.left != null) que.add(poll.left);
                if(poll.right != null) que.add(poll.right);
                len--;
            }
            lists.add(sum / len);
        }
        return lists;
    }
}
