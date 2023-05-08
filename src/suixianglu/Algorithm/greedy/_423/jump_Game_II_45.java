package suixianglu.Algorithm.greedy._423;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class jump_Game_II_45 {

    public int jump(int[] nums) {
        if(nums.length == 1) return 0;

        int curDistance = 0;
        int ans = 0;
        int nextDistance = 0;
        for (int i = 0; i < nums.length; i++) {
            nextDistance = Math.max(nums[i] + i, nextDistance);
            if(i == curDistance){
                if(curDistance < nums.length - 1){
                    ans++;
                    curDistance = nextDistance;
                    if(curDistance >= nums.length - 1) break;
                }else break;
            }
        }
        return ans;
    }

}
