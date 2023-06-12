package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _16 {
    public double myPow(double x, int n) {
        for (int i = 0; i < n; i++) {
            x *= x;
        }
        return x;
    }
}
