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
public class binary_tree_level_order_Traversal_102_M {
    List<List<Integer>> resList = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        checkFun(root);
        return resList;
    }

    public void checkFun(TreeNode treeNode){
        if(treeNode == null){
            return;
        }

        //新建队列,先放进去一个
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(treeNode);

        //迭代
        while (!que.isEmpty()){
            //新建List放数据
            List<Integer> itemList = new ArrayList<>();
            int len = que.size();

            while (len > 0){
                TreeNode temp = que.poll();
                itemList.add(temp.val);

                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
                len--;
            }

            resList.add(itemList);
        }
    }
}

