package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _19_II {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right){
            if(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }else {
                return isValidPalindrome(s, left, right - 1) || isValidPalindrome(s, left + 1,right);
            }
        }
        return true;
    }

    public boolean isValidPalindrome(String s, int start, int end){
        while (start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
