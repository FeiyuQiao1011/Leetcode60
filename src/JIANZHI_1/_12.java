package JIANZHI_1;

/**
 * DFS
 * 回溯法：先朝一个方向搜到底，在回溯至上一个节点
 * @author 乔飞宇
 * @version 1.0
 */
public class _12 {
    public boolean exist(char[][] board, String word) {
        //大框架
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] word, int i, int j, int k){
        //返回条件
        //行或列索引越界 || 当前元素与目标元素不同 || 当前矩阵元素已经访问
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        if(k == word.length - 1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }
}
