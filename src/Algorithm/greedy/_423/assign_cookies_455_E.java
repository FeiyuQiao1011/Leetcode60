package Algorithm.greedy._423;

import java.util.Arrays;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class assign_cookies_455_E {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length && start < g.length; i++) {
            if(s[i] >= g[start]){
                start++;
                count++;
            }
        }
        return count;
    }
}
