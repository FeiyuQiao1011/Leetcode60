package suixianglu.DataStructure.Hashtable.day5;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class intersection_of_two_Arrays_II_350_E {
    public int[] intersect(int[] nums1, int[] nums2) {
        //比大小
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }

        //新建hashmap
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : nums1){
            int count = hashMap.getOrDefault(i,0) + 1;
            hashMap.put(i,count);
        }

        //新建数组放结果，长度是短的就可
        int[] ints = new int[nums1.length];
        int index = 0;
        for (int num : nums2){
            int count = hashMap.getOrDefault(num,0);
            if(count > 0){
                ints[index++] = num;
                count--;
                if(count > 0){
                    hashMap.put(num,count);
                }else {
                    hashMap.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(ints,0,index);
    }
}
