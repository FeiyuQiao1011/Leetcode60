package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _45 {
    public String minNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        quickSort(strings, 0, strings.length - 1);
        StringBuilder res = new StringBuilder();
        for (String s : strings){
            res.append(s);
        }
        return res.toString();
    }

    public void quickSort(String[] strs, int l, int r){
        if(l >= r) return;
        int i = l, j = r;
        String tmp = strs[i];
        while (i < j){
            while ((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
            while ((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) >= 0 && i < j) i++;
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        strs[i] = strs[l];
        strs[l] = tmp;
        quickSort(strs, l, i - 1);
        quickSort(strs, i + 1, r);
    }
}
