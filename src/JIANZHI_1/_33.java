package JIANZHI_1;

/**
 * 二叉搜索树的后续遍历
 * @author 乔飞宇
 * @version 1.0
 */
public class _33 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0 , postorder.length - 1);
    }

    public boolean recur(int[] postorder, int i, int j){
        if(i >= j) return true;
        //找根结点
        int p = i;
        while (postorder[p] < postorder[j]) p++;
        //判断
        int m = p;
        while (postorder[p] > postorder[j]) p++;
        //左子树和右子树是否为二叉树
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
