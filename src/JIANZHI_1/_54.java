package JIANZHI_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 层序遍历
 * 放到数组里
 * 找k
 * @author 乔飞宇
 * @version 1.0
 */
public class _54 {
    public int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            TreeNode temp = nodes.poll();
            list.add(temp.val);
            if(temp.left != null){
                nodes.add(temp.left);
            }
            if(temp.right != null){
                nodes.add(temp.right);
            }
        }
        int[] ints = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(ints);
        return ints[ints.length - k];
    }
}
