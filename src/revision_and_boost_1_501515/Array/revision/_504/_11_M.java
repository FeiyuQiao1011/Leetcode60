package revision_and_boost_1_501515.Array.revision._504;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _11_M {
    public int maxArea(int[] height) {
        int l = 0;
        int area = 0;
        int r = height.length - 1;
        while (l < r){
            area = Math.max((r - l) * Math.min(height[l], height[r]),area);
            if(height[l] <= height[r]) l++;
            else r--;
        }
        return area;
    }
}
