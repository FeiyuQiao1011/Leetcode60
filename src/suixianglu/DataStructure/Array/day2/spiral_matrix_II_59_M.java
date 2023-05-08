package suixianglu.DataStructure.Array.day2;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class spiral_matrix_II_59_M {
    public int[][] generateMatrix(int n){
        //圈数
        int loop = 0;

        //数组
        int[][] ints = new int[n][n];

        //计数
        int count = 1;

        //控制边界
        int start = 0;

        //
        int i, j;

        while (loop++ < n / 2){
            //从左到右
            for (j = start; j < n - loop; j++) {
                ints[start][j] = count++;
            }

            //右向下
            for (i = start; i < n - loop; i++) {
                ints[i][j] = count++;
            }

            //右到左
            for (j = n; j >= loop; j--){
                ints[i][j] = count++;
            }

            //下到上
            for (i = n; j >= loop; i--){
                ints[i][j] = count++;
            }
            start++;
        }
        if(n % 2 == 1){
            ints[start][start] = count;
        }
        return ints;
    }
}
