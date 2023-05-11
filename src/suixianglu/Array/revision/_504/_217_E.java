package suixianglu.Array.revision._504;

import java.util.HashMap;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _217_E {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],0);
        }
        return false;
    }
}
