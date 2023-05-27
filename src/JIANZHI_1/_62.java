package JIANZHI_1;

/**
 * 约瑟夫环问题，现在不想看，没意思
 * @author 乔飞宇
 * @version 1.0
 */
public class _62 {
    public int lastRemaining(int n, int m) {
        int x = 0;
        for (int i = 2; i <= n; i++) {
            x = (x + m) % i;
        }
        return x;
    }
}
