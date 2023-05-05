package revision_and_boost_1_501515.Array.boost._501;

import java.util.HashSet;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class LCOF_Offer_03_E {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = -1;
        for (int num : nums){
            if(!set.add(num)){
                res = num;
                break;
            }
        }
        return res;
    }
}
