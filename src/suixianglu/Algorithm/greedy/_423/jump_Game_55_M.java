package suixianglu.Algorithm.greedy._423;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class jump_Game_55_M {

    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;

        int coverRange = 0;
        for (int i = 0; i <= coverRange; i++) {
            coverRange = Math.max(coverRange, i + nums[i]);
            if(coverRange >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}
