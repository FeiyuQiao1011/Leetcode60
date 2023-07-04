package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _69_II {
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] < arr[i]){
                return i;
            }
        }
        return 0;
    }
}
