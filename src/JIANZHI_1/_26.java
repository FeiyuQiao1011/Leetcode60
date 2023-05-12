package JIANZHI_1;

/**
 * 树的子结构
 * @author 乔飞宇
 * @version 1.0
 */
public class _26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    //判断当前节点 + 递归
    public boolean recur(TreeNode A, TreeNode B){
        //终止条件
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
