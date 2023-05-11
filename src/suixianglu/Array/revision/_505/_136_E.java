package suixianglu.Array.revision._505;

import java.util.HashMap;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _136_E {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }

        for (Integer i : nums) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }
}
