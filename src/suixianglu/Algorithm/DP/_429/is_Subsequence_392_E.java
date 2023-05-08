package suixianglu.Algorithm.DP._429;

import org.junit.jupiter.api.Test;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class is_Subsequence_392_E {
    @Test
    public void test(){
        String s = "axc";
        String t = "ahbgdc";
        boolean res = isSubsequence(s, t);
        System.out.println(res);
    }
    public boolean isSubsequence(String s, String t){
        if(s.length() == 0) return true;
        for (int i = 0,j = 0; i < t.length() && j < s.length(); i++) {
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            if(j == s.length()) return true;
        }
        return false;
    }
}
