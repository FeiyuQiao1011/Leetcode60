package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _10 {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % Integer.MAX_VALUE;
            a = b;
            b = sum;
        }
        return a;
    }
}
