package JIANZHI_1;

import java.util.HashMap;
import java.util.Map;

/**
 * 计算二叉树中和等于target的路径数量
 * dfs 递归
 * 会导致栈溢出，力扣不当人，会给一些变态的测试用例
 * 可以用哈希 + 前缀和做
 * @author 乔飞宇
 * @version 1.0
 */
public class _50_II {
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);
        return dfs(root, 0, targetSum, prefixCount);
    }

    public long currentPathSum(TreeNode node, int targetSum){
        if(node == null){
            return 0;
        }
        long currPathSum = 0;

        if(node.val == targetSum){
            currPathSum++;
        }

        currPathSum += currentPathSum(node.left, targetSum - node.val);
        currPathSum += currentPathSum(node.right, targetSum - node.val);

        return currPathSum;
    }

    public int dfs(TreeNode node, long currSum, int targetSum, Map<Integer, Integer> prefixCount){
        if(node == null){
            return 0;
        }

        currSum += node.val;

        int count = prefixCount.getOrDefault((int)currSum - targetSum, 0);

        prefixCount.put((int)currSum, prefixCount.getOrDefault((int)currSum, 0) + 1);

        count += dfs(node.left, currSum, targetSum, prefixCount);
        count += dfs(node.right, currSum, targetSum, prefixCount);

        prefixCount.put((int)currSum, prefixCount.get((int)currSum) - 1);

        return count;
    }
}
