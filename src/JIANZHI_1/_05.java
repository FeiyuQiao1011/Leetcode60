package JIANZHI_1;

/**
 * 替换空格
 * java、python中字符串都不可变，需要新建字符串
 * @author 乔飞宇
 * @version 1.0
 */
public class _05 {
    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (Character c : s.toCharArray()){
            if(c == ' ') builder.append("%20");
            else builder.append(c);
        }
        return builder.toString();
    }
}
