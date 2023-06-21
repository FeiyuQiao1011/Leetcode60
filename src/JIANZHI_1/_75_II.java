package JIANZHI_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 按照arr2的顺序排列arr1，arr2中未出现的元素按照升序排在arr1末尾
 * @author 乔飞宇
 * @version 1.0
 */
public class _75_II {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if(hashMap.containsKey(arr1[i])){
                hashMap.replace(arr1[i], hashMap.get(arr1[i]) + 1);
            }else {
                hashMap.put(arr1[i], 1);
            }
        }
        int[] res = new int[arr1.length];
        int n = 0;
        for (int i = 0; i < arr2.length; i++) {
            int k = hashMap.get(arr2[i]);
            for (int j = 0; j < k; j++) {
                res[n++] = arr2[i];
            }
            hashMap.remove(arr2[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : hashMap.keySet()) {
            int count = hashMap.get(integer);
            for (int i = 0; i < count; i++){
                list.add(integer);
            }
        }
        Collections.sort(list);
        for (Integer integer : list) {
            res[n++] = integer;
        }
        return res;
    }
}
