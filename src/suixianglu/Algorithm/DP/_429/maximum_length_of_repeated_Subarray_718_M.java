package suixianglu.Algorithm.DP._429;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class maximum_length_of_repeated_Subarray_718_M {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        int result = 0;
        //dp[i][j] = dp[i - 1][j - 1] + 1 nums1[i] == nums1[j]
        for (int i = 1; i < nums1.length; i++) {
            for (int j = 1; j < nums2.length; j++) {
                if(nums1[i - 1] == nums2[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                result = result > dp[i][j] ? result : dp[i][j];
            }
        }
        return result;
    }
}
