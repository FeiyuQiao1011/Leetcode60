package JIANZHI_1;

import java.util.HashMap;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _07 {
    int[] preorder;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    public TreeNode recur(int root, int left, int right){
        if(left > right) return null;
        TreeNode node = new TreeNode(preorder[root]);
        int i = map.get(preorder[root]);
        node.left = recur(root + 1, left, i - 1);
        node.right = recur(i - left + root + 1, i + 1, right);
        return node;
    }
}
