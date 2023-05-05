package Algorithm.DP._424;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class fibonacci_Number_509_M {

    public int fib(int n) {
        int[] ints = new int[n];
        ints[0] = 0;
        ints[1] = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[n];
    }
}
