package suixianglu.DataStructure.Hashtable.day7;

import java.util.HashMap;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class two_Sum_1_E {
    public int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(hashMap.containsKey(temp)){
                res[1] = i;
                res[0] = hashMap.get(temp);
                break;
            }
            hashMap.put(nums[i],i);
        }
        return res;
    }
}
