package JIANZHI_1;

import org.junit.jupiter.api.Test;

/**
 * 删去一条边，让它变成一个有n个节点的树
 * 并查集
 * @author 乔飞宇
 * @version 1.0
 */
public class _118_II {
    @Test
    public void test(){
        int[][] edges1 = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        findRedundantConnection(edges1);
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parents = new int[n + 1];

        //初始化并查集
        /**
         * 初始化的时候父节点都是本身
         */
        for (int i = 1; i <= n ; i++) {
            parents[i] = i;
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            int rootU = find(parents, u);
            int rootV = find(parents, v);

            if(rootU == rootV){
                return edge;
            }

            parents[rootV] = rootU;
        }

        return new int[2];
    }

    public int find(int[] parents, int node){
        while (node != parents[node]){
            parents[node] = parents[parents[node]];
            node = parents[node];
        }
        return node;
    }
}
