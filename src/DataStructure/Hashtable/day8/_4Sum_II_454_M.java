package DataStructure.Hashtable.day8;

import java.util.HashMap;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _4Sum_II_454_M {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        //hashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int temp;
        int res = 0;
        for(int i : nums1){
            for (int j : nums2){
                temp = i + j;
                if(hashMap.containsKey(temp)){
                    hashMap.put(temp, hashMap.get(temp) + 1);
                }else {
                    hashMap.put(temp, 1);
                }
            }
        }

        for (int i : nums3){
            for (int j : nums4){
                temp = i + j;
                if(hashMap.containsKey(0 - temp)){
                    res += hashMap.get(0 - temp);
                }
            }
        }
        return res;
    }
}
