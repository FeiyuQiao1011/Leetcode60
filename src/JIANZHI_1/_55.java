package JIANZHI_1;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 二叉树最大深度
 * BFS 广度优先遍历
 *      第一步：初始化---新建LinkedList nodes 和 temp维护层序结果集
 *      第二步：遍历 把下一层的所有元素都放到temp里
 *      第三步：遍历完每层后计数器res++，最后得到总层数，也就是最大深度
 *      注意：其中需要维护两个队列，其中关系咋变化的需要搞清楚，有东西。
 * DFS 深度优先遍历
 *      递归
 *      每次遍历 + 1
 * @author 乔飞宇
 * @version 1.0
 */
public class _55 {
    //BFS
    public int maxDepth(TreeNode root) {
        int res = 0;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        LinkedList<TreeNode> temp;
        nodes.push(root);
        while (!nodes.isEmpty()){
            temp = new LinkedList<>();
            for (TreeNode node : nodes) {
                if(node.left != null) temp.push(node.left);
                if(node.right != null) temp.push(node.right);
            }
            nodes = temp;
            res++;
        }
        return res;
    }

    //DFS
    public int maxDepth2(TreeNode root){
        if(root == null){
            return 0;
        }else {
            int leftHeight = maxDepth2(root.left);
            int rightHeight = maxDepth2(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
