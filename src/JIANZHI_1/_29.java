package JIANZHI_1;

/**
 * 顺时针打印矩阵
 * @author 乔飞宇
 * @version 1.0
 */
public class _29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        //上下左右边界
        int l = 0, r = matrix[0].length - 1, u = 0, d = matrix.length - 1;
        //res数组
        int[] res = new int[matrix.length * matrix[0].length];
        //x
        int x = 0;
        while (true){
            //l -> r
            for (int i = l; i <= r; i++) {
                res[x++] = matrix[u][i];
            }
            if(++u > d) break;
            //u -> d
            for (int i = u; i <= d; i++) {
                res[x++] = matrix[i][r];
            }
            if(--r < l) break;
            //r -> l
            for (int i = r; i >= l ; i--) {
                res[x++] = matrix[d][i];
            }
            if(--d < u) break;
            //d -> u
            for (int i = d; i >= u; i--) {
                res[x++] = matrix[i][l];
            }
            if(++l > r) break;
        }
        return res;
    }
}
