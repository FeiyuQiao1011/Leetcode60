package JIANZHI_1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _004_II {
    public int singleNumber(int[] nums) {
        //Arrays.sort(nums);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])){
                hashMap.replace(nums[i], hashMap.get(nums[i]) + 1);
                continue;
            }
            hashMap.put(nums[i],1);
        }

        for (int i = 0; i < nums.length; i++) {
            if(hashMap.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return 0;
    }
}
