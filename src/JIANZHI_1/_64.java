package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _64 {
    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
