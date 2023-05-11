package suixianglu.Array.boost._503;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class spiral_Matrix_54_M {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (true){
            for (int col = left; col <= right; col++) {
                res.add(matrix[up][col]);
            }
            if(++up > down) break;

            for (int row = up; row <= down; row++) {
                res.add(matrix[row][right]);
            }
            if(--right < left) break;

            for (int col = right; col >= left ; col--) {
                res.add(matrix[down][col]);
            }
            if(--down < up) break;

            for (int row = down; row >= up ; row--) {
                res.add(matrix[row][left]);
            }
            if(++left > right) break;
        }
        return res;
    }
}
