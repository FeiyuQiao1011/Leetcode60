package JIANZHI_1;

/**
 * 最大岛屿面积dfs
 * 两层遍历
 * @author 乔飞宇
 * @version 1.0
 */
public class _105_II {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j] == 1){
                    int area = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int row, int col){
        int rows = grid.length;
        int cols = grid[0].length;
        if(row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] != 1){
            return 0;
        }

        grid[row][col] = 0;
        int area = 1;
        area += dfs(grid, row - 1, col);
        area += dfs(grid, row + 1, col);
        area += dfs(grid, row, col - 1);
        area += dfs(grid, row, col + 1);

        return area;
    }
}
