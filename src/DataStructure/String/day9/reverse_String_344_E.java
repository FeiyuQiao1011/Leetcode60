package DataStructure.String.day9;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class reverse_String_344_E {
    public void reverseString(char[] s) {
        //双指针法
        int p = 0;
        int q = s.length - 1;
        char temp;
        while (p < q){
            temp = s[p];
            s[p] = s[q];
            s[q] = temp;
            p++;
            q--;
        }
    }
}
