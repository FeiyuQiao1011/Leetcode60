package DataStructure.Tree.day14;

import java.util.*;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class Nary_tree_level_order_traversal_429_M {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resList = new ArrayList<>();
        if(root == null){
            return resList;
        }

        Queue<Node> que = new LinkedList<>();
        que.offer(root);

        while (!que.isEmpty()){
            ArrayList<Integer> itemList = new ArrayList<>();
            int len = que.size();
            while (len > 0){
                Node tempNode = que.poll();
                itemList.add(tempNode.val);
                List<Node> children = tempNode.children;
                if(children == null || children.size() == 0){
                    continue;
                }

                for (Node node : children){
                    if(node != null){
                        que.offer(node);
                    }
                }
                len--;
            }
            resList.add(itemList);
        }

        return resList;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
