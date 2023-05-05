package DataStructure.Hashtable.day5;

import java.util.HashSet;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class intersection_of_two_Arrays_349_E {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Object> set = new HashSet<>();
        HashSet<Object> reset = new HashSet<>();

        for(int i : nums1){
            set.add(i);
        }

        for (int i : nums2){
            if(set.contains(i)){
                reset.add(i);
            }
        }

        return reset.stream().mapToInt(x -> (int) x).toArray();
    }
}
