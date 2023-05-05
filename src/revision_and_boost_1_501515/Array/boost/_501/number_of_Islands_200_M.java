package revision_and_boost_1_501515.Array.boost._501;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class number_of_Islands_200_M {
    /**
     * 系列问题——岛屿问题，遍历DFS求解
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int r = 0; r < grid.length; ++r) {
            for (int c = 0; c < grid[0].length; ++c) {
                if(grid[r][c] == '1'){
                    ++res;
                    dfs(grid, r, c);
                }
            }
        }
        return res;
    }

    public void dfs(char[][] grid, int r, int c){
        if(!inArea(grid, r, c) || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public boolean inArea(char[][] grid, int r, int c){
        if(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length){
            return true;
        }
        return false;
    }

}
