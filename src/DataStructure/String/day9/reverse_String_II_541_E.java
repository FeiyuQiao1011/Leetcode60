package DataStructure.String.day9;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class reverse_String_II_541_E {
    public String reverseStr(String s, int k) {
        //转换成数组
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i += 2 * k) {
            int start = i;

            int end = Math.min(ch.length - 1, start + k - 1);

            while (start < end){
                char temp;
                temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}
