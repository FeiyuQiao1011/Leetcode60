package suixianglu.Algorithm.DP._424;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class climbing_Stairs_70_E {

    public int climbStairs(int n) {
        if (n <= 1) return n;
        int[] ints = new int[2];
        ints[1] = 1;
        ints[2] = 2;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            ints[2] = ints[0] + ints[1];
            ints[0] = ints[1];
            sum = ints[2];
        }
        return sum;
    }
}
