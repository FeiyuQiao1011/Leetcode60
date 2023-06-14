package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _72_II {
    public int mySqrt(int x) {
        for (int i = 0; i < x; i++) {
            if(x <= i * i){
                return i - 1;
            }
        }
        return 0;
    }
}
