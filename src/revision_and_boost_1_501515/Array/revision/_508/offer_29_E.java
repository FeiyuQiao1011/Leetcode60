package revision_and_boost_1_501515.Array.revision._508;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class offer_29_E {
    /**
     * 顺时针打印矩阵
     * //纯纯无聊套路，但是我不会，半小时没写出来，还tm简单题
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {
        int[] res = new int[matrix.length * matrix[0].length];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            res[k++] = matrix[0][i];
        }
    }
}
