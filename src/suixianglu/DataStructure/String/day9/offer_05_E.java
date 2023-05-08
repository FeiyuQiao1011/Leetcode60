package suixianglu.DataStructure.String.day9;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class offer_05_E {
    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                builder.append("  ");
            }
        }

        //左右指针
        int left = s.length() - 1;
        s += builder.toString();
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left >= 0){
            if(chars[left] == ' '){
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            }else {
                chars[right] = chars[left];
            }
            left--;
            right--;
        }
        return new String(chars);
    }
}
