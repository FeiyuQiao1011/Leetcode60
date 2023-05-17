package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _13 {
    int m, n, k;
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        visited = new boolean[m][n];
        return dfs(0, 0, 0, 0);
    }

    public int dfs(int i, int j, int si, int sj){
        if(i >= m || j >= n || k < si + sj || visited[i][j]) return 0;
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj) +
                dfs(i, j + 1, si, (j + 1) %  10 != 0 ? sj + 1 : sj - 8);
    }

    //计算数位和
    public int bitSum(int x){
        int sum = 0;
        while (x > 0){
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
