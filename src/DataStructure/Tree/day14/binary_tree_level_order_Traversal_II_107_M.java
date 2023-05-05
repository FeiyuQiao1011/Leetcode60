package DataStructure.Tree.day14;

import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class binary_tree_level_order_Traversal_II_107_M {
    //最外层，返回一个ArrayList，新建
    public List<List<Integer>> resList = new ArrayList<List<Integer>>();

    //步骤
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        checkFun1(root);

        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = resList.size() - 1; i >= 0 ; i--) {
            result.add(resList.get(i));
        }
        return result;
    }

    //从上向下层序遍历，最后把得到的数组翻转
    public void checkFun1(TreeNode treeNode){
        //边角料？
        if(treeNode == null){
            return;
        }

        //新建队列，解决问题
        Queue<TreeNode> que = new LinkedList<>();
        //把首节点加进去
        que.offer(treeNode);

        while (!que.isEmpty()){
            //新建list存放单行数组
            ArrayList<Integer> itemList = new ArrayList<>();
            int len = que.size();

            while (len > 0){
                TreeNode temp = que.poll();
                itemList.add(temp.val);

                if (temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
                len--;
            }
            resList.add(itemList);
        }
    }
}
