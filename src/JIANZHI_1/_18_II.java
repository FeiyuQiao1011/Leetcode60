package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _18_II {
    public boolean isPalindrome(String s) {
        s = s.replace(" ", "");
        s = s.replaceAll("\\p{Punct}", "");
        s = s.replaceAll("[0-9]", "");
        if(s.length() == 1){
            return true;
        }
        return isP(s);
    }

    public boolean isP(String s){
        int start = 0, end = s.length() - 1;
        while (start < end){
            if(s.charAt(start) == s.charAt(end) || ((Math.abs(s.charAt(start) - s.charAt(end)) == 32) && (s.charAt(start) < '0' || s.charAt(start) > '9') && (s.charAt(end) < '0' || s.charAt(end) > '9'))){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
