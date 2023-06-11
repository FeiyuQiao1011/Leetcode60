package JIANZHI_1;

/**
 * 翻转单词顺序
 *      1.将s转化为数组
 *      2.遇到空格就隔开？
 *          解：1.去除空格
 *             2.翻转整个字符串
 *             3.翻转各个单词
 *             同主站151题
 * @author 乔飞宇
 * @version 1.0
 */
public class _58_I {
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1, j = s.length() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0){
            while (i >= 0 && s.charAt(i) != ' ') i--;
            stringBuilder.append(s.substring(i + 1, j + 1) + ' ');
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return stringBuilder.toString().trim();
    }
}

//    public StringBuilder removeSpace(String s){
//        int start = 0;
//        int end = s.length() - 1;
//        while (s.charAt(start) == ' ') start++;
//        while (s.charAt(end) == ' ') end--;
//        StringBuilder stringBuilder = new StringBuilder();
//        while (start <= end){
//            char c = s.charAt(start);
//            if(c != ' ' || stringBuilder.charAt(stringBuilder.length() - 1) != ' '){
//                stringBuilder.append(c);
//            }
//            start++;
//        }
//        return stringBuilder;
//    }
//
//    public void reverseStr(StringBuilder s, int start, int end){
//        while (start < end){
//            char temp = s.charAt(start);
//            s.setCharAt(start,s.charAt(end));
//            s.setCharAt(end,temp);
//            start++;
//            end--;
//        }
//    }
//
//    public void
