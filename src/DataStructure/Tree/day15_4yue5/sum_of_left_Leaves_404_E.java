package DataStructure.Tree.day15_4yue5;

import DataStructure.Tree.TreeNode;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class sum_of_left_Leaves_404_E {
    public int sumOfLeftLeaves(TreeNode root) {
        //1. 确定参数和返回值
        //2. 确定递归终止条件
        if (root == null){
            return 0;
        }
        //3. 确定单层递归逻辑
        int leftValue = sumOfLeftLeaves(root.left);
        if(root.left != null && root.left.left == null && root.left.right == null){
            leftValue = root.left.val;
        }
        int rightValue = sumOfLeftLeaves(root.right);
        int sum = leftValue + rightValue;
        return sum;
    }
}
