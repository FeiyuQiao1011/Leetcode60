package Algorithm.DP._428;

import DataStructure.Tree.TreeNode;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class house_Robber_III_337_M {
    public int rob(TreeNode root) {
        int[] res = robTree(root);
        return Math.max(res[0], res[1]);
    }

    public int[] robTree(TreeNode cur){
        int[] res = new int[2];
        if(cur == null) return res;
        int[] left = robTree(cur.left);
        int[] right = robTree(cur.right);

        res[0] = cur.val + left[0] + right[0];
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
     }
}
