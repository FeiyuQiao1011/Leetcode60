package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _15 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0){
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
