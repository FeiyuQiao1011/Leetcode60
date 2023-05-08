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
public class binary_tree_right_side_View_199_M {
    public ArrayList<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        checkfun2(root);
        return res;
    }
    
    public void checkfun2(TreeNode treeNode){
        //边角料？
        if(treeNode == null){
            return;
        }
        
        //新建队列，解决问题
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(treeNode);
        
        while (!nodes.isEmpty()){
            int size = nodes.size();

            for (int i = 0; i < size; i++) {
                TreeNode temp = nodes.poll();

                if(temp.left != null){
                    nodes.add(temp.left);
                }

                if(temp.right != null){
                    nodes.add(temp.right);
                }

                if(i == size - 1){
                    res.add(temp.val);
                }
            }
        }
    }
}
